package com.example.Restaurant.Model.Repository;

import com.example.Restaurant.Model.Model.Food;
import com.example.Restaurant.Model.Model.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FoodRepository extends JpaRepository<Food, Long> {

    List<Food> findByRestaurant(Restaurant restaurant);

}

