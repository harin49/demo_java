package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String name;

    // Getters and Setters
    public Long getId() { return Id; }
    public void setId(Long id) { this.Id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

}
