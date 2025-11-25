package com.example.Spring_demo;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class UserService {
    private  UserRepository userRepository ;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserClassSpringBoot createUser(UserClassSpringBoot user)
    {
        userRepository.save(user);
        System.out.println("User saved to the database");
        return  user;
    }

    public List<UserClassSpringBoot>  getUser(String  name)
    {
        if (name == null || name.isEmpty()) {
            return userRepository.findAll();
        }
        return userRepository.findByName(name);
    }

    public UserClassSpringBoot updateUser(UserClassSpringBoot user) {

        if (userRepository.existsById(user.getId())) {
            userRepository.save(user);
            return user;
        }

        throw new RuntimeException("User does not already exist");
    }


    public String  deleteUser(Integer userid)
    {
        if(userRepository.existsById(userid))
        {
            userRepository.deleteById(userid);
            return "User deleted Successfully";
        }
        throw new RuntimeException("User does not exist to delete");
    }
}
