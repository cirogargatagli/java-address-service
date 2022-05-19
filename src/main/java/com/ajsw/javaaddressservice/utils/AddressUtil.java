package com.ajsw.javaaddressservice.utils;

import com.ajsw.javaaddressservice.models.dtos.request.AddressRequest;
import com.ajsw.javaaddressservice.models.entities.Address;
import com.ajsw.javaaddressservice.models.entities.Locality;
import org.springframework.stereotype.Component;

@Component
public class AddressUtil{
    public Address createAddress(AddressRequest addressRequest){
        return new Address(
                addressRequest.getStreet(),
                addressRequest.getNumberHouse(),
                new Locality(addressRequest.getIdLocality())
        );
    }
}
