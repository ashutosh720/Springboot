package com.example.Mapping.Service;

import com.example.Mapping.Entity.Laptop;
import com.example.Mapping.Repositories.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LaptopService {

    @Autowired
    private LaptopRepository laptopRepository;

    public LaptopService(LaptopRepository laptopRepository) {
        this.laptopRepository = laptopRepository;
    }

    public Laptop createLaptop(Laptop laptop) {
        return laptopRepository.save(laptop);
    }

    public List<Laptop> getAllLaptops() {
        return laptopRepository.findAll();
    }

    public Laptop getLaptopById(String id) {
        return laptopRepository.findById(id).get();
    }

    public Laptop updateLaptop(String id, Laptop newLaptop) {
        Laptop laptop = laptopRepository.findById(id).get();
        laptop.setName(newLaptop.getName());
        laptop.setBrand(newLaptop.getBrand());
        laptop.setPrice(newLaptop.getPrice());
        laptop.setStudent(newLaptop.getStudent());
        return laptopRepository.save(laptop);
    }

    public void deleteLaptop(String id) {
        laptopRepository.deleteById(id);
    }
}
