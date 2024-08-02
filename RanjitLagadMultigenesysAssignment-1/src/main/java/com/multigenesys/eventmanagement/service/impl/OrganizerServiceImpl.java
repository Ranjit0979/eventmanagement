package com.multigenesys.eventmanagement.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multigenesys.eventmanagement.exception.ResourceNotFoundException;
import com.multigenesys.eventmanagement.model.Organizer;
import com.multigenesys.eventmanagement.repository.OrganizerRepository;
import com.multigenesys.eventmanagement.service.OrganizerService;

import javax.validation.Valid;
import java.util.List;

@Service
public class OrganizerServiceImpl implements OrganizerService {
    @Autowired
    private OrganizerRepository organizerRepository;

    @Override
    public Organizer createOrganizer(@Valid Organizer organizer) {
        return organizerRepository.save(organizer);
    }

    @Override
    public Organizer getOrganizerById(Long id) {
        return organizerRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Organizer not found"));
    }

    @Override
    public Organizer updateOrganizer(Long id, @Valid Organizer organizerDetails) {
        Organizer organizer = getOrganizerById(id);
        organizer.setName(organizerDetails.getName());
        organizer.setContactInfo(organizerDetails.getContactInfo());
        return organizerRepository.save(organizer);
    }

    @Override
    public void deleteOrganizer(Long id) {
        Organizer organizer = getOrganizerById(id);
        organizerRepository.delete(organizer);
    }
}


