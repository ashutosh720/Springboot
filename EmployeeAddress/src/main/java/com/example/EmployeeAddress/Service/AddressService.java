package com.example.EmployeeAddress.Service;

import com.example.EmployeeAddress.Model.Address;
import com.example.EmployeeAddress.Repositories.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddressService {

    @Autowired
    private AddressRepository addressRepository;

    public List<Address> getAllAddresses() {
        return addressRepository.findAll();
    }

    public Address getAddressById(Long id) {
        Optional<Address> optionalAddress = addressRepository.findById(id);
        return  addressRepository.findById(id).get();
    }

    public Address createAddress(Address address) {
        return addressRepository.save(address);
    }

    public Address updateAddress(Long id, Address addressDetails) {
        Optional<Address> optionalAddress = addressRepository.findById(id);
        if (optionalAddress.isPresent()) {
            Address address = optionalAddress.get();
            address.setStreet(addressDetails.getStreet());
            address.setCity(addressDetails.getCity());
            address.setState(addressDetails.getState());
            address.setZipcode(addressDetails.getZipcode());
            return addressRepository.save(address);
        } else {
           return null;
        }
    }

    public void deleteAddress(Long id) {
        Optional<Address> optionalAddress = addressRepository.findById(id);
        if (optionalAddress.isPresent()) {
            addressRepository.deleteById(id);
        } else {
           System.out.println("No Id found");
        }
    }

}
