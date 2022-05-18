package com.ajsw.javaaddressservice.services;

import com.ajsw.javaaddressservice.models.dtos.LocalityDTO;
import com.ajsw.javaaddressservice.models.entities.Locality;
import com.ajsw.javaaddressservice.repositories.interfaces.ILocalityRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LocalityService {

    private ILocalityRepository iLocalityRepository;

    public LocalityService(ILocalityRepository iLocalityRepository){
        this.iLocalityRepository = iLocalityRepository;
    }

    public List<LocalityDTO> findAllLocalities(){
        List<Locality> localities = iLocalityRepository.findAll();
        List<LocalityDTO> localitiesDTO = new ArrayList<>();
        for (Locality locality : localities){
            localitiesDTO.add(new LocalityDTO(locality.getIdLocality(), locality.getName()));
        }
        return localitiesDTO;
    }
}
