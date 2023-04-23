package com.example.apiHitCount.Service;

import com.example.apiHitCount.Model.Api_model;

import java.util.HashMap;

public class Api_Service {
    static HashMap<String, Api_model> User = new HashMap<>();
    static{


    }
    public HashMap<String,Api_model> addUser(String name){
       if(User.containsKey(name)){
            Api_model api = User.get(name);
            int c = api.getCount();

            api.setCount(c+1);


        }
        else{

            User.put(name,new Api_model(name,1));

        }
//        User.put(name,new Api_model(name,1));
        return User;
    }

}
