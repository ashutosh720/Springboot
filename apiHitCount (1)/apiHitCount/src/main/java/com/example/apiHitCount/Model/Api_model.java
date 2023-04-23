package com.example.apiHitCount.Model;

import com.example.apiHitCount.Service.Api_Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


public class Api_model {
    private  int count;
    private String userName;

    public int getCount() {
        return this.count;
    }

    public String getUserName() {
        return this.userName;
    }
    public void setCount(int count){
        this.count = count;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }

     public Api_model(String name,int count){
       this.count = count;
       this.userName = name;
    }


}
