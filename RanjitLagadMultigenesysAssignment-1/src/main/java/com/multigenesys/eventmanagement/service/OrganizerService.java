package com.multigenesys.eventmanagement.service;

import javax.validation.Valid;

import com.multigenesys.eventmanagement.model.Organizer;

import java.util.List;

public interface OrganizerService {
    Organizer createOrganizer(@Valid Organizer organizer);
    Organizer getOrganizerById(Long id);
    Organizer updateOrganizer(Long id, @Valid Organizer organizerDetails);
    void deleteOrganizer(Long id);
}

