package br.com.testeapispring.distrolinuxapi;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface DistroLinuxRepository extends MongoRepository<DistroLinux, String> {

}
