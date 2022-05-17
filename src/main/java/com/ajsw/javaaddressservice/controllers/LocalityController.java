package com.ajsw.javaaddressservice.controllers;

import com.ajsw.javaaddressservice.models.entities.Locality;
import com.ajsw.javaaddressservice.services.LocalityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/localities")
public class LocalityController {

    @Autowired
    private LocalityService localityService;

    public LocalityController(LocalityService localityService){
        this.localityService = localityService;
    }

    @GetMapping()
    public List<Locality> getAllLocalities(){
        return localityService.findAllLocalities();
    }
}
