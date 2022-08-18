DOMAIN=todoworld.servicestack.net
if [ $# -ge 1 ]
  then
    DOMAIN=$1
fi

PASSWORD=grpc
if [ $# -ge 2 ]
  then
    PASSWORD=$2
fi

cat <<EOT >>prod.config
[ req ]
default_bits       = 2048
default_md         = sha256
default_keyfile    = prod.key
prompt             = no
encrypt_key        = no

distinguished_name = dn
req_extensions     = v3_req
x509_extensions    = x509_req
string_mask        = utf8only

[ dn ]
commonName             = TodoWorld prod cert
emailAddress           = todoworld@servicestack.net
countryName            = US
stateOrProvinceName    = DE
localityName           = Wilmington
organizationName       = Todo World

[ x509_req ]
subjectKeyIdentifier   = hash
authorityKeyIdentifier = keyid,issuer
basicConstraints       = critical, CA:false
keyUsage               = critical, keyEncipherment
subjectAltName         = @alt_names
# extendedKeyUsage     = serverAuth, clientAuth
nsComment              = "OpenSSL Generated Certificate"

[ v3_req ]
subjectKeyIdentifier   = hash
basicConstraints       = critical, CA:false
subjectAltName         = @alt_names
# extendedKeyUsage     = serverAuth, clientAuth
nsComment              = "OpenSSL Generated Certificate"

[ alt_names ]
DNS.1                  = $DOMAIN
EOT

openssl req -config prod.config -new -out prod.csr.pem
openssl x509 -req -days 365 -extfile prod.config -extensions v3_req -in prod.csr.pem -signkey prod.key -out prod.crt
openssl pkcs12 -export -out prod.pfx -inkey prod.key -in prod.crt -password pass:$PASSWORD
cp prod.crt ../../TodoWorld/wwwroot/grpc.crt
rm prod.config prod.csr.pem