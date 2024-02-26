package com.example.pocaffesy.api;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


//
@Entity
public class Employee {
    @Id
    private Long id;
    private String name;

    public void setId(Long id) {
        this.id = id;
    } //Entity

    public Long getId() {
        return id;
    }
}
