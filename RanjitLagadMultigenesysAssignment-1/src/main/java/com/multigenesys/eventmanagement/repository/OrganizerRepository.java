package com.multigenesys.eventmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.multigenesys.eventmanagement.model.Organizer;

@Repository
public interface OrganizerRepository extends JpaRepository<Organizer, Long> {
}
