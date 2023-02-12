package com.example.UniversityEventManagementSystem.Controller;

import com.example.UniversityEventManagementSystem.Model.Event;

import com.example.UniversityEventManagementSystem.Service.eveService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class eveController {
    @Autowired
    private eveService eveservice;

    public eveController(eveService eveservice) {
        this.eveservice = eveservice;
    }

    @GetMapping("/all-events")
    public List<Event> getEvents(){

        return this.eveservice.getEvents();

    }


    @PostMapping("/add-event")
    public Event addEvent(@RequestBody Event eve){

        return this.eveservice.addEvent(eve);
    }

    @PutMapping("/update-event")
    public Event updateStudent(@RequestBody Event eve){

        return this.eveservice.updateEvent(eve);
    }

    @DeleteMapping("/delete-event/eventId/{eventId}")
    public  void deleteEvent(@PathVariable String eventId){
        this.eveservice.deleteEvent(eventId);
    }

}
