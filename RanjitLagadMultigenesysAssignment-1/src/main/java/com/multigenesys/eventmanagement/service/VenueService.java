package com.multigenesys.eventmanagement.service;

import javax.validation.Valid;

import com.multigenesys.eventmanagement.model.Venue;

import java.util.List;

public interface VenueService {
    Venue createVenue(@Valid Venue venue);
    Venue getVenueById(Long id);
    Venue updateVenue(Long id, @Valid Venue venueDetails);
    void deleteVenue(Long id);
}

