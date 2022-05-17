package com.ajsw.javaaddressservice.services;

import com.ajsw.javaaddressservice.repositories.interfaces.IAddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

    @Autowired
    private IAddressRepository iAddressRepository;

    public AddressService(IAddressRepository iAddressRepository){
        this.iAddressRepository = iAddressRepository;
    }
}
