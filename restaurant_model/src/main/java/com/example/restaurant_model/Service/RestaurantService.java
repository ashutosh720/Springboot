package com.example.restaurant_model.Service;

import com.example.restaurant_model.Model.Restaurant;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RestaurantService {

    private static List<Restaurant> Restaurants=new ArrayList<>(); // In-memory database
    private static int snoCount=0;

    static {
        Restaurants.add(new Restaurant(++snoCount,"Punjabi Tadka","1A Clock Tower",234761,"Butter Chicken",60, 5));
        Restaurants.add(new Restaurant(++snoCount,"French Delight","3C Clock Tower",244721,"Ratatouille",45, 4));
        Restaurants.add(new Restaurant(++snoCount,"Cafe China Town","City Mall",234771,"Kung Pao Chicken",56, 4));
        Restaurants.add(new Restaurant(++snoCount,"Asia 7","Old Mussoorie Road",278451,"Sushi",35, 5));
        Restaurants.add(new Restaurant(++snoCount,"Southern Essence","E.C. Road",274731,"Malabar Parota",58, 5));
    }


    public List<Restaurant> getRestaurants() {
        return Restaurants;
    }


    public Restaurant getRestaurant(String name) {

        Restaurant res=null;
        for(Restaurant rt:Restaurants){

            if(rt.getName().equals(name)){
                res=rt;
                break;
            }

        }
        return res;
    }

    public Restaurant addRestaurant(Restaurant rest) {

        Restaurants.add(rest);
        return rest;
    }

    public Restaurant updateRestaurant(Restaurant rest) {
        return rest;
    }

    public void deleteRestaurant(String name) {

        Restaurant res=null;
        for(Restaurant rt:Restaurants){

            if(rt.getName().equals(name)){
                res=rt;
                break;
            }

        }
        Restaurants.remove(res);

        for(Restaurant rs:Restaurants){
            System.out.println(rs);
        }

    }

    // public static void addRestaurant(Restaurant restaurant) {

       // Restaurants.add(restaurant);
  //  }

    /*public static Restaurant findByName(String name) {
        Restaurant restaurant = null;
        return restaurant;
    }*/
}
