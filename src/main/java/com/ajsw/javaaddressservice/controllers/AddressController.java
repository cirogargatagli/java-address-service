package com.ajsw.javaaddressservice.controllers;

import com.ajsw.javaaddressservice.models.dtos.LocalityDTO;
import com.ajsw.javaaddressservice.models.dtos.request.AddressRequest;
import com.ajsw.javaaddressservice.models.dtos.response.Response;
import com.ajsw.javaaddressservice.services.AddressService;
import com.ajsw.javaaddressservice.services.LocalityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/api/addresses")
public class AddressController {

    @Autowired
    private AddressService addressService;

    public AddressController(AddressService addressService){
        this.addressService = addressService;
    }

    @PostMapping()
    public Response createAddress(@Validated @RequestBody AddressRequest addressRequest){
        try{
            return addressService.saveAddress(addressRequest);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Error registering the address .\n");
        }
    }
}