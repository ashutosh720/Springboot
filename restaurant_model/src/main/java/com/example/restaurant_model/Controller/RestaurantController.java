package com.example.restaurant_model.Controller;

import com.example.restaurant_model.Model.Restaurant;
import com.example.restaurant_model.Service.RestaurantService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/restaurant-model")
public class RestaurantController {

    private final RestaurantService restaurantService;

    public RestaurantController(RestaurantService restaurantService) {
        this.restaurantService = restaurantService;

    }

    @GetMapping("/home")
    public String home() {
        return "Welcome to Restaurant Model";
    }

    @GetMapping("/all-restaurants")
    public List<Restaurant> getRestaurants() {

        return this.restaurantService.getRestaurants();

    }

    @GetMapping("/get-restaurant/name/{name}")
    public Restaurant getRestaurant(@PathVariable String name) {

        return this.restaurantService.getRestaurant(name);
    }

    @PostMapping("/add-restaurant")
    public Restaurant addRestaurant(@RequestBody Restaurant rest) {

        return this.restaurantService.addRestaurant(rest);
    }

    @PutMapping("/update-restaurant")
    public Restaurant updateRestaurant(@RequestBody Restaurant rest) {

        return this.restaurantService.updateRestaurant(rest);
    }

    @DeleteMapping("/delete-restaurant/name/{name}")
    public void deleteRestaurant(@PathVariable String name) {
        this.restaurantService.deleteRestaurant(name);
    }

}



