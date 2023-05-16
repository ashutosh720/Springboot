package com.example.Mapping.Service;

import com.example.Mapping.Entity.Address;
import com.example.Mapping.Repositories.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

    @Service
    public class AddressService {
        @Autowired
        private AddressRepository addressRepository;

        public Address getAddressById(Long id) {
            return addressRepository.findById(id).get();
        }

        public Address createAddress(Address address) {
            return addressRepository.save(address);
        }

        public Address updateAddress(Long id, Address newAddress) {
            Address address = addressRepository.findById(id).orElse(null);
            if (address != null) {
                address.setLandmark(newAddress.getLandmark());
                address.setZipcode(newAddress.getZipcode());
                address.setDistrict(newAddress.getDistrict());
                address.setState(newAddress.getState());
                address.setCountry(newAddress.getCountry());
                return addressRepository.save(address);
            }
            return null;
        }

        public void deleteAddress(Long id) {
            addressRepository.deleteById(id);
        }
    }


