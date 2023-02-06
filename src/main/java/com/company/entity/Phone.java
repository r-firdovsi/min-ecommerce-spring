package com.company.entity;

import jakarta.persistence.*;

@Entity
public class Phone {
    @Id
    @GeneratedValue
    private Long id;

    private String number;

    @ManyToOne
    @JoinColumn(name = "person_id")
    private Person person;

    // getters and setters
}

