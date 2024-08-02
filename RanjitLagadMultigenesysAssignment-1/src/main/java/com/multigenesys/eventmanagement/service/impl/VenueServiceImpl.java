package com.multigenesys.eventmanagement.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multigenesys.eventmanagement.exception.ResourceNotFoundException;
import com.multigenesys.eventmanagement.model.Venue;
import com.multigenesys.eventmanagement.repository.VenueRepository;
import com.multigenesys.eventmanagement.service.VenueService;

import javax.validation.Valid;
import java.util.List;

@Service
public class VenueServiceImpl implements VenueService {
    @Autowired
    private VenueRepository venueRepository;

    @Override
    public Venue createVenue(@Valid Venue venue) {
        return venueRepository.save(venue);
    }

    @Override
    public Venue getVenueById(Long id) {
        return venueRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Venue not found"));
    }

    @Override
    public Venue updateVenue(Long id, @Valid Venue venueDetails) {
        Venue venue = getVenueById(id);
        venue.setName(venueDetails.getName());
        venue.setLocation(venueDetails.getLocation());
        venue.setCapacity(venueDetails.getCapacity());
        return venueRepository.save(venue);
    }

    @Override
    public void deleteVenue(Long id) {
        Venue venue = getVenueById(id);
        venueRepository.delete(venue);
    }
}


