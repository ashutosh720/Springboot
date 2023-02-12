package com.example.UniversityEventManagementSystem.Service;

import com.example.UniversityEventManagementSystem.Model.Event;


public interface eveService {

    public Event addEvent(Event eve);

    public Event updateEvent(Event eve);

    void deleteEvent(String eventId);
}
