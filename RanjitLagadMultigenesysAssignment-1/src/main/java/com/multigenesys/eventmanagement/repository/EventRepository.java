package com.multigenesys.eventmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.multigenesys.eventmanagement.model.Event;

import java.util.List;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {
    List<Event> findByVenueId(Long venueId);
    List<Event> findByOrganizerId(Long organizerId);
}

