package com.example.Restaurant.Model.Service;

import com.example.Restaurant.Model.Model.Food;
import com.example.Restaurant.Model.Model.User;
import com.example.Restaurant.Model.Repository.FoodRepository;
import com.example.Restaurant.Model.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodService {


    @Autowired
    private UserRepository userRepository;

    @Autowired
    private final FoodRepository foodRepository;

    public FoodService(FoodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }

    public Food addFood(Food food,int user_id){

        User authuser =userRepository.getadmin(user_id);
        if(authuser.getRole().equals("ADMIN")){

            return foodRepository.save(food);
        }

        else {
            throw new RuntimeException("Unauthorised user");
        }

    }

    public Food updateFood(Food food , int user_id , Long food_id){

        User authuser =userRepository.getadmin(user_id);

        if(authuser.getRole().equals("ADMIN")){

            Food newFood = foodRepository.findById(food_id).get();
            newFood.setName(food.getName());
            newFood.setPrice(food.getPrice());
            return foodRepository.save(newFood);
        }

        else {
            throw new RuntimeException("Unauthorised user");
        }


    }

    public void deleteFood(Long food_id ,int user_id) {

        User authuser =userRepository.getadmin(user_id);

        if(authuser.getRole().equals("ADMIN")){
            Food food = this.foodRepository.findById(food_id).get();
            this.foodRepository.deleteById(food_id);
        }

        else {
            throw new RuntimeException("Unauthorised user");
        }


    }


    public List<Food> getAllFoods(){

        return foodRepository.findAll();
    }

    public Food getByFoodId(Long food_id){

        return foodRepository.findById(food_id).get();

    }


    }
