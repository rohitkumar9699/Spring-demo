package com.example.Spring_demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository< UserClassSpringBoot, Integer> {
    List<UserClassSpringBoot> findByName(String name);
}
