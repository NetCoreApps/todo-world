# -*- ruby -*-
# encoding: utf-8

Gem::Specification.new do |s|
  s.name          = 'todoworld'
  s.version       = '1.0.0'
  s.authors       = ['ServiceStack']
  s.email         = 'team@servicestack.net'
  s.homepage      = 'https://github.com/NetCoreApps/todo-world'
  s.summary       = 'gRPC Ruby TodoWorld Example'
  s.description   = 'Simple TodoWorld demo of using gRPC from Ruby'

  s.files         = `git ls-files -- *`.split("\n")
  s.executables   = `git ls-files -- client.rb`.split("\n").map do |f|
    File.basename(f)
  end
  s.require_paths = ['lib']
  s.platform      = Gem::Platform::RUBY

  s.add_dependency 'grpc', '~> 1.0'
  s.add_dependency 'multi_json', '~> 1.13.1'
  s.add_development_dependency 'bundler', '~> 2.0'
end
