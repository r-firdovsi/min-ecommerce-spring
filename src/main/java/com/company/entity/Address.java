package com.company.entity;

import jakarta.persistence.*;

@Entity
public class Address {
    @Id
    @GeneratedValue
    private Long id;

    private String street;
    private String city;

    @OneToOne(mappedBy = "address")
    private Person person;
}
