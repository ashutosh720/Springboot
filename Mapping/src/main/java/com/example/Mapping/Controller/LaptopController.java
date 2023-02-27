package com.example.Mapping.Controller;

import com.example.Mapping.Entity.Laptop;
import com.example.Mapping.Service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/laptops")
public class LaptopController {

    @Autowired
    private LaptopService laptopService;

    public LaptopController(LaptopService laptopService) {
        this.laptopService = laptopService;
    }

    @PostMapping("/add")
    public Laptop createLaptop(@RequestBody Laptop laptop) {
        return laptopService.createLaptop(laptop);
    }

    @GetMapping("/all")
    public List<Laptop> getAllLaptops() {
        return laptopService.getAllLaptops();
    }

    @GetMapping("/byId/{id}")
    public Laptop getLaptopById(@PathVariable String id) {
        return laptopService.getLaptopById(id);
    }

    @PutMapping("/update/{id}")
    public void updateLaptop(@PathVariable String id, @RequestBody Laptop laptop) {
        laptopService.updateLaptop(id,laptop);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteLaptop(@PathVariable String id) {
        laptopService.deleteLaptop(id);
    }
}
