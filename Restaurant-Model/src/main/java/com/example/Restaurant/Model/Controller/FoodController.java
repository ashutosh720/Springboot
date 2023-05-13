package com.example.Restaurant.Model.Controller;

import com.example.Restaurant.Model.Model.Food;
import com.example.Restaurant.Model.Service.FoodService;
import com.example.Restaurant.Model.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/foods")
public class FoodController {

    @Autowired
    private UserService userService;

    @Autowired
    private FoodService foodService;


    @PostMapping("/admin/{user_id}/add_food")
    public ResponseEntity<Food> addFood(@RequestBody Food food, @PathVariable int user_id) {
        Food savedFood = foodService.addFood(food, user_id);
        return new ResponseEntity<>(savedFood, HttpStatus.CREATED);
    }

    @GetMapping("/users/{food_id}")
    public ResponseEntity<Food> getByFoodId(@PathVariable Long food_id) {
        return ResponseEntity.ok(this.foodService.getByFoodId(food_id));
    }

    @GetMapping("/all_food")
    public ResponseEntity<List<Food>> getAllFoods() {

        return ResponseEntity.ok((this.foodService.getAllFoods()));
    }

    @PutMapping("/admin/{user_id}/update_food/{food_id}")
    public ResponseEntity<Food> updateFood(@RequestBody Food food, @PathVariable int user_id, @PathVariable Long food_id) {

        Food updatedFood = this.foodService.updateFood(food, user_id, food_id);
        return ResponseEntity.ok(updatedFood);
    }

    @DeleteMapping("/admin/{user_id}/delete_food/{food_id}")
    public ResponseEntity<String> deleteFood(@PathVariable int user_id, @PathVariable Long food_id) {

        this.foodService.deleteFood(food_id, user_id);
        return new ResponseEntity<>("Deleted", HttpStatus.NO_CONTENT);
    }
}
