package com.teja.mongoreactive.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.teja.mongoreactive.entity.Address;
import com.teja.mongoreactive.service.AddressService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class AddressController {
    @Autowired
    private AddressService addressService;


  @GetMapping("/all")
    public Flux<Address> findAll() {
        Flux<Address> orgAll = addressService.findAll();
        return orgAll;
    }

    @GetMapping("/id")
    public Flux<Address> findid() {
        Flux<Address> orgAll = addressService.findId();
        return orgAll;
    }
}
