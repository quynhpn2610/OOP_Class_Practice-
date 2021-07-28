package com.buildSchoolManagement.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Students {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int age;

    @ManyToOne
    private Classes classes;
}
