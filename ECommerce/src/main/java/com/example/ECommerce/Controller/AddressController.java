package com.example.ECommerce.Controller;

import com.example.ECommerce.Model.Address;
import com.example.ECommerce.Service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ecom/addresses")
public class AddressController {

    @Autowired
    private AddressService addressService;


    @PostMapping("/create-address")
    public Address createAddress(@RequestBody Address address) {
        return addressService.createAddress(address);
    }
}