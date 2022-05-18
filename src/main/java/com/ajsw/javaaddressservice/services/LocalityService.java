package com.ajsw.javaaddressservice.services;

import com.ajsw.javaaddressservice.models.entities.Locality;
import com.ajsw.javaaddressservice.repositories.interfaces.ILocalityRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocalityService {

    private ILocalityRepository iLocalityRepository;

    public LocalityService(ILocalityRepository iLocalityRepository){
        this.iLocalityRepository = iLocalityRepository;
    }

    public List<Locality> findAllLocalities(){
        return iLocalityRepository.findAll();
    }
}
