package com.ajsw.javaaddressservice.models.dtos.request;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.*;

public class AddressRequest {
    @Getter
    @Setter
    @NotNull(message = "Street may not be null")
    private String street;

    @Getter
    @Setter
    @NotBlank(message = "Number may not be null")
    private String numberHouse;

    @Getter
    @Setter
    @Min(value = 1, message = "A locality must be inserted")
    private int idLocality;
}
