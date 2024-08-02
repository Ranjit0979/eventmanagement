package com.multigenesys.eventmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import com.multigenesys.eventmanagement.model.Organizer;
import com.multigenesys.eventmanagement.service.OrganizerService;

import javax.validation.Valid;

@RestController
@RequestMapping("/organizers")
@Validated
public class OrganizerController {

    @Autowired
    private OrganizerService organizerService;

    @PostMapping
    public ResponseEntity<Organizer> createOrganizer(@Valid @RequestBody Organizer organizer) {
        return ResponseEntity.ok(organizerService.createOrganizer(organizer));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Organizer> getOrganizerById(@PathVariable Long id) {
        return ResponseEntity.ok(organizerService.getOrganizerById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Organizer> updateOrganizer(@PathVariable Long id, @Valid @RequestBody Organizer organizer) {
        return ResponseEntity.ok(organizerService.updateOrganizer(id, organizer));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteOrganizer(@PathVariable Long id) {
        organizerService.deleteOrganizer(id);
        return ResponseEntity.noContent().build();
    }
}

