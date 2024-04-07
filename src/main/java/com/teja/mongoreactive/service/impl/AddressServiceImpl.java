package com.teja.mongoreactive.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teja.mongoreactive.repository.AddressRepository;
import com.teja.mongoreactive.entity.Address;
import com.teja.mongoreactive.service.AddressService;
import reactor.core.publisher.Flux;

@Service
public class AddressServiceImpl implements AddressService {


        
    @Autowired
	private AddressRepository AddressRepository;
    @Override
    public Flux<Address> findAll() {
        return AddressRepository.findAll();
    }
    @Override
    public Flux<Address> findId() {
        return AddressRepository.getAllAddress();    }
    
}
