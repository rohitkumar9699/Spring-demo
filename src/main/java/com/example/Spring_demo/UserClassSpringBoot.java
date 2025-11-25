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

    public UserClassSpringBoot(Integer id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
