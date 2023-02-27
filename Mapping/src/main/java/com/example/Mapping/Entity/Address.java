package com.example.Mapping.Entity;


import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class Address {

    private String landmark;
    private String zipcode;
    private String district;
    private String state;
    private String country;


}
