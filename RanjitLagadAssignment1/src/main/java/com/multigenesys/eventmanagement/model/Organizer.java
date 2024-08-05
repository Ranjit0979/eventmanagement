package com.multigenesys.eventmanagement.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Entity
@Data
public class Organizer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Organizer name is required")
    private String name;

    @NotBlank(message = "Contact info is required")
    private String contactInfo;

    @OneToMany(mappedBy = "organizer")
    @JsonIgnore
    private List<Event> events;
}
