cat <<EOT >>dev.https.config
[ req ]
default_bits       = 2048
default_md         = sha256
default_keyfile    = key.pem
prompt             = no
encrypt_key        = no

distinguished_name = req_distinguished_name
req_extensions     = v3_req
x509_extensions    = v3_req

[ req_distinguished_name ]
commonName             = "localhost"

[ v3_req ]
subjectAltName      = DNS:localhost
basicConstraints    = critical, CA:false
keyUsage            = critical, keyEncipherment
extendedKeyUsage    = critical, 1.3.6.1.5.5.7.3.1
EOT

openssl req -config dev.https.config -new -out dev.csr.pem && mv key.pem dev.key.pem
openssl x509 -req -days 365 -extfile dev.https.config -extensions v3_req -in dev.csr.pem -signkey dev.key.pem -out dev.https.crt
openssl pkcs12 -export -out dev.https.pfx -inkey dev.key.pem -in dev.https.crt -password pass:grpc
# cp dev.https.pfx ../../TodoWorld
