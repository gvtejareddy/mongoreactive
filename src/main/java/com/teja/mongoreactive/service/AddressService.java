package com.teja.mongoreactive.service;

import com.teja.mongoreactive.entity.Address;

import reactor.core.publisher.Flux;

public interface AddressService {
    Flux<Address> findAll();

    Flux<Address> findId();
}
