package com.example.Mapping.Controller;

import com.example.Mapping.Entity.Address;
import com.example.Mapping.Service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/addresses")
public class AddressController {
    @Autowired
    private AddressService addressService;

    @GetMapping("/{id}")
    public Address getAddress(@PathVariable("id") Long id) {
        return addressService.getAddressById(id);
    }

    @PostMapping
    public Address createAddress(@RequestBody Address address) {
        return addressService.createAddress(address);
    }

    @PutMapping("/{id}")
    public Address updateAddress(@PathVariable("id") Long id, @RequestBody Address address) {
        return addressService.updateAddress(id, address);
    }

    @DeleteMapping("/{id}")
    public void deleteAddress(@PathVariable("id") Long id) {
        addressService.deleteAddress(id);
    }
}






