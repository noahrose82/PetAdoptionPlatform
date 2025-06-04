package com.petadopt.petadoption.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Pet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int age;
    private String breed;
    private String size;
    private String gender;

    @Column(length = 1000)
    private String description;

    private String photoUrl; // Optional URL to an image
    private String healthInfo;
    private String adoptionStatus; // Available, Pending, Adopted
}