package com.teja.mongoreactive.repository;

import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.teja.mongoreactive.entity.Address;

import reactor.core.publisher.Flux;

@Repository
public interface AddressRepository extends ReactiveMongoRepository<Address, String> {

    @Aggregation(pipeline = {  
        "{_id:\"62263\"}"
      })
      Flux<Address> getAllAddress();
 }