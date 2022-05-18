package com.ajsw.javaaddressservice.models.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
public class LocalityDTO {

    @Getter
    @Setter
    private int idLocality;

    @Getter
    @Setter
    private String name;
}
