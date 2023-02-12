package com.example.UniversityEventManagementSystem.Service;

import com.example.UniversityEventManagementSystem.Model.Event;

import java.util.List;


public interface eveService {

    public List<Event> getEvents();

    public Event addEvent(Event eve);

    public Event updateEvent(Event eve);

    void deleteEvent(String eventId);
}
