package com.example.UniversityEventManagementSystem.Service;

import com.example.UniversityEventManagementSystem.Model.Event;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class eveServiceimpl implements eveService{


    List<Event> eventList;

     /*eventId
eventName
locationOfEvent
date
startTime
endTime*/

    public eveServiceimpl(){
        eventList=new ArrayList<>();
        eventList.add(new Event("F001","Nukkad","University Ground","21/02/23","14:00","16:00"));
        eventList.add(new Event("M001","Mime","University Auditorium","1/03/23","11:00","14:00"));
        eventList.add(new Event("M002","Poetry Competition","University Auditorium","2/03/23","10:00","13:00"));
        eventList.add(new Event("M003","Best Boy Band Completion","University Auditorium","2/03/23","16:00","18:00"));
        eventList.add(new Event("M004","Robot Wars","Workshop Arena","3/03/23","12:00","16:00"));
    }


    @Override
    public List<Event> getEvents() {
        return eventList;
    }
    
     public List<Event> getAllEventsByDate(LocalDate date) {
        return eventRepository.findByDate(date);
    }

    @Override
    public Event addEvent(Event eve) {
        eventList.add(eve);
        return eve;
    }

    @Override
    public Event updateEvent(Event eve) {
        return eve;
    }

    @Override
    public void deleteEvent(String eventId) {
        Event et=null;
        for(Event ev:eventList){

            if(ev.getEventId().equals(eventId)){
                et=ev;
            }

        }
        eventList.remove(et);

        for(Event e:eventList){
            System.out.println(e);
        }

    }
}
