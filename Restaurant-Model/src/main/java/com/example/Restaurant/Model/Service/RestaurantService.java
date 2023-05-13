package com.example.Restaurant.Model.Service;

import com.example.Restaurant.Model.Model.Food;
import com.example.Restaurant.Model.Model.Restaurant;
import com.example.Restaurant.Model.Repository.FoodRepository;
import com.example.Restaurant.Model.Repository.RestaurantRepository;
import org.springframework.stereotype.Service;

import java.nio.file.AccessDeniedException;
import java.util.List;
import java.util.Optional;

@Service
public class RestaurantService {

    private final RestaurantRepository restaurantRepository;
    private final FoodRepository foodRepository;

    public RestaurantService(RestaurantRepository restaurantRepository, FoodRepository foodRepository) {
        this.restaurantRepository = restaurantRepository;
        this.foodRepository = foodRepository;
    }

    public List<Restaurant> getAllRestaurants() {
        return restaurantRepository.findAll();
    }

    public Optional<Restaurant> getRestaurantById(Long id) {
        Optional<Restaurant> res=restaurantRepository.findById(id);
        if(res!=null){
        return res;}
        else {
            return null;
        }

    }

    public Restaurant createRestaurant(Restaurant restaurant) {
        return restaurantRepository.save(restaurant);
    }

    public Restaurant updateRestaurant(Long id, Restaurant restaurantDetails) {
        Restaurant restaurant = getRestaurantById(id).get();
        restaurant.setName(restaurantDetails.getName());
        restaurant.setAddress(restaurantDetails.getAddress());
        return restaurantRepository.save(restaurant);
    }

    public void deleteRestaurant(Long id) {
        Restaurant restaurant = getRestaurantById(id).get();
        restaurantRepository.delete(restaurant);
    }

    public List<Food> getRestaurantMenu(Long restaurantId) {
        Restaurant restaurant = getRestaurantById(restaurantId).get();
        return foodRepository.findByRestaurant(restaurant);
    }

    public Food addFoodToMenu(Long restaurantId, Food food) {
        Restaurant restaurant = getRestaurantById(restaurantId).get();
        food.setRestaurant(restaurant);
        return foodRepository.save(food);
    }

    public void removeFoodFromMenu(Long restaurantId, Long foodId) throws AccessDeniedException {
        Restaurant restaurant = getRestaurantById(restaurantId).get();
        Food food = foodRepository.findById(foodId).get();

        if (food.getRestaurant().equals(restaurant)) {
            foodRepository.delete(food);
        } else {
            throw new AccessDeniedException("Cannot remove food from another restaurant's menu");
        }
    }
}

