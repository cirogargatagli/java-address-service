package com.ajsw.javaaddressservice.services;

import com.ajsw.javaaddressservice.models.dtos.request.AddressRequest;
import com.ajsw.javaaddressservice.models.dtos.response.EntityCreatedResponse;
import com.ajsw.javaaddressservice.models.dtos.response.Response;
import com.ajsw.javaaddressservice.models.entities.Address;
import com.ajsw.javaaddressservice.repositories.interfaces.IAddressRepository;
import com.ajsw.javaaddressservice.utils.AddressUtil;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

    @Autowired
    private IAddressRepository iAddressRepository;
    private final ModelMapper mapper;
    private final AddressUtil addressUtil;
    private String nameEntity = "Address";

    public AddressService(IAddressRepository iAddressRepository, ModelMapper mapper, AddressUtil addressUtil){
        this.iAddressRepository = iAddressRepository;
        this.mapper = mapper;
        this.addressUtil = addressUtil;
    }

    public Response saveAddress(AddressRequest addressRequest){
        Address address = addressUtil.createAddress(addressRequest);
        Address addressCreated = iAddressRepository.save(address);
        return new EntityCreatedResponse(addressCreated.getIdAddress(), nameEntity);
    }
}
