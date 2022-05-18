package com.ajsw.javaaddressservice.controllers;

import com.ajsw.javaaddressservice.models.dtos.LocalityDTO;
import com.ajsw.javaaddressservice.services.LocalityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/localities")
public class LocalityController {

    @Autowired
    private LocalityService localityService;

    public LocalityController(LocalityService localityService){
        this.localityService = localityService;
    }

    @GetMapping()
    public List<LocalityDTO> getAllLocalities(){ return localityService.findAllLocalities(); }
}
