package com.ajsw.javaaddressservice.services;

import com.ajsw.javaaddressservice.models.dtos.LocalityDTO;
import com.ajsw.javaaddressservice.models.entities.Locality;
import com.ajsw.javaaddressservice.models.mappers.ListMapper;
import com.ajsw.javaaddressservice.repositories.interfaces.ILocalityRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LocalityService {

    private ILocalityRepository iLocalityRepository;
    private final ListMapper listMapper;
    private final ModelMapper modelMapper;

    public LocalityService(ILocalityRepository iLocalityRepository, ListMapper listMapper, ModelMapper modelMapper){
        this.iLocalityRepository = iLocalityRepository;
        this.listMapper = listMapper;
        this.modelMapper = modelMapper;
    }

    public List<LocalityDTO> findAllLocalities(){
        List<Locality> localities = iLocalityRepository.findAll();
        return listMapper.mapList(localities, LocalityDTO.class);
    }
}
