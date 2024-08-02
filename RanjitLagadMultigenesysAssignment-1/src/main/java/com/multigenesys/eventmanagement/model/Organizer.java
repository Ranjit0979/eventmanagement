package com.multigenesys.eventmanagement.model;

import lombok.Data;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;

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
    private List<Event> events;
}


