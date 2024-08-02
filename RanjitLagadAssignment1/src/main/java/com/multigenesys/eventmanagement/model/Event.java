package com.multigenesys.eventmanagement.model;

import lombok.Data;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonBackReference;

import java.util.Date;

@Entity
@Data
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Event name is required")
    private String eventName;

    @NotNull(message = "Event date is required")
    private Date eventDate;

    private String description;

    @ManyToOne
    @JoinColumn(name = "organizer_id")
    @NotNull(message = "Organizer is required")
    @JsonBackReference
    private Organizer organizer;

    @ManyToOne
    @JoinColumn(name = "venue_id")
    @NotNull(message = "Venue is required")
    @JsonBackReference
    private Venue venue;
}


