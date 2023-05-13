package com.example.Restaurant.Model.Controller;

import com.example.Restaurant.Model.Model.Food;
import com.example.Restaurant.Model.Model.Restaurant;
import com.example.Restaurant.Model.Service.RestaurantService;
import org.springframework.web.bind.annotation.*;

import java.nio.file.AccessDeniedException;
import java.util.List;

@RestController
@RequestMapping("/api/restaurants")
public class RestaurantController {

    private final RestaurantService restaurantService;

    public RestaurantController(RestaurantService restaurantService) {
        this.restaurantService = restaurantService;
    }

    @GetMapping
    public List<Restaurant> getAllRestaurants() {
        return restaurantService.getAllRestaurants();
    }

    @GetMapping("/{id}")
    public Restaurant getRestaurantById(@PathVariable Long id) {

        return restaurantService.getRestaurantById(id).get();
    }

    @PostMapping("/add")
    public Restaurant createRestaurant(@RequestBody Restaurant restaurant) {
        return restaurantService.createRestaurant(restaurant);
    }

    @PutMapping("/{id}")
    public Restaurant updateRestaurant(@PathVariable Long id, @RequestBody Restaurant restaurantDetails) {
        return restaurantService.updateRestaurant(id, restaurantDetails);
    }

    @DeleteMapping("/{id}")
    public void deleteRestaurant(@PathVariable Long id) {
        restaurantService.deleteRestaurant(id);
    }

    @GetMapping("/{restaurantId}/menu")
    public List<Food> getRestaurantMenu(@PathVariable Long restaurantId) {
        return restaurantService.getRestaurantMenu(restaurantId);
    }

    @PostMapping("/{restaurantId}/menu")
    public Food addFoodToMenu(@PathVariable Long restaurantId, @RequestBody Food food) {
        return restaurantService.addFoodToMenu(restaurantId, food);
    }

    @DeleteMapping("/{restaurantId}/menu/{foodId}")
    public void removeFoodFromMenu(@PathVariable Long restaurantId, @PathVariable Long foodId) throws AccessDeniedException {
        restaurantService.removeFoodFromMenu(restaurantId, foodId);
    }
}
