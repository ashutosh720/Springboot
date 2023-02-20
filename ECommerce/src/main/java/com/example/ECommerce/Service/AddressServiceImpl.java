package com.example.ECommerce.Service;

import com.example.ECommerce.Model.Address;
import com.example.ECommerce.Repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    private AddressRepository addressRepository;


    @Override
    public Address createAddress(Address address) {
        return addressRepository.save(address);
    }

}