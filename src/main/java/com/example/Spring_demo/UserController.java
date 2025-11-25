package com.example.Spring_demo;


import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("users")
public class UserController {
    private UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @PostMapping
    public UserClassSpringBoot create(@RequestBody UserClassSpringBoot user)
    {
        return  service.createUser(user);
    }

    @PutMapping
    public UserClassSpringBoot update(@RequestBody UserClassSpringBoot user)
    {
        return  service.updateUser(user);
    }

    @GetMapping
    public List<UserClassSpringBoot> get(@RequestParam(required = false) String name) {
        return service.getUser(name);
    }

    @DeleteMapping("/{userid}")
    public String delete(@PathVariable int userid) {
        return service.deleteUser(userid);
    }

}
