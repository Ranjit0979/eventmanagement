package com.multigenesys.eventmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import com.multigenesys.eventmanagement.model.Venue;
import com.multigenesys.eventmanagement.service.VenueService;

import javax.validation.Valid;

@RestController
@RequestMapping("/venues")
@Validated
public class VenueController {

    @Autowired
    private VenueService venueService;

    @PostMapping
    public ResponseEntity<Venue> createVenue(@Valid @RequestBody Venue venue) {
        return ResponseEntity.ok(venueService.createVenue(venue));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Venue> getVenueById(@PathVariable Long id) {
        return ResponseEntity.ok(venueService.getVenueById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Venue> updateVenue(@PathVariable Long id, @Valid @RequestBody Venue venue) {
        return ResponseEntity.ok(venueService.updateVenue(id, venue));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteVenue(@PathVariable Long id) {
        venueService.deleteVenue(id);
        return ResponseEntity.noContent().build();
    }
}
