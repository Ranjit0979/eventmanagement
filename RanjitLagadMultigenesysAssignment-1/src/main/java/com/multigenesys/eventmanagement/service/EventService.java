package com.multigenesys.eventmanagement.service;

import javax.validation.Valid;

import com.multigenesys.eventmanagement.model.Event;

import java.util.List;

public interface EventService {
    Event createEvent(@Valid Event event);
    List<Event> getAllEvents();
    Event getEventById(Long id);
    Event updateEvent(Long id, @Valid Event eventDetails);
    void deleteEvent(Long id);
    List<Event> getEventsByVenue(Long venueId);
    List<Event> getEventsByOrganizer(Long organizerId);
}

