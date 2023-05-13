# Restaurant Model
# Requirments
 IntelliJIDEA
 Serverport: 8080 (use: localhost:8080)
 Database name: food_delivery_db
 Java version: 11
 Springboot 
 
Everything is present in the pom.xml (no need to download any library)


# Admin EndPoints
 Add foods - localhost:8080/api/foods/admin/{user_id}/add_food
 update foods - localhost:8080/api/foods/admin/{user_id}/update_food/{food_id}
 delete foods - localhost:8080/api/foods/admin/{user_id}/delete_food/{food_id}
 getFoodByOrderId - localhost:8080/api/foods//admin/{user_id}/get_food_byOrder_id/{order_id}
 
 
 # User EndPoints
 get all foods -localhost:8080/api/foods/all_food
 get food by id-localhost:8080/api/foods/users/{food_id}
 
  
  # User Authentication
  register User - localhost:8080/api/v1/user/register
  authenticate User - localhost:8080/api/v1/user/authenticate
  
  # Restaurant APIs
    @GetMapping- getAllRestaurants()-localhost:8080/api/restaurants
    @GetMapping-getRestaurantById()-localhost:8080/api/restaurants/{id}
    @PostMapping-createRestaurant()-localhost:8080/api/restaurants/add
    @DeleteMapping-deleteRestaurant()-localhost:8080/api/restaurants/{id}
    
  
# Data structure used -Arraylist

Database Created In MySQL

# Project Summary:-
Food Delivery Application created in springboot with java with mvc architecture for four different model with their Controller, Service and Entities Layer
