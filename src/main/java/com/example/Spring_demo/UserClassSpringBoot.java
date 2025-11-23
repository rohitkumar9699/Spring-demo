package com.example.Spring_demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class UserClassSpringBoot {
    @Id
    private int id;
    private String name;
    private String email;

    public UserClassSpringBoot() {
    }

    public UserClassSpringBoot(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
