package com.codewithaashish.mavenproject;


import com.codewithaashish.mavenproject.model.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/users")
public class UserController{

    private List<User> users=new ArrayList<>();
    private Long nextId=1L;

    public UserController(){
        users.add(new User(nextId++, "Aashish Adhikari", "aashishad67@gmail.com", 23, "Kathmandu"));
        users.add(new User(nextId++, "Simant Neupane", "simantneupane56@gmail.com", 22, "Kathmandu"));
        users.add(new User(nextId++, "Prashant Dhakal", "prashant34@gmail.com", 21, "Kathmandu"));

    }


    // GET/api/users- GET all users
    @GetMapping
    public List<User> getAllUsers(){
        return users;
    }

    //Get /api/users/{id} - GET user by id
//    @GetMapping("/{id}")
//    public User getUserById(@PathVariable Long id){
//        return users.stream().filter(user->user.getId().equals(id)).findFirst().orElse(null);
//    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable Long id){
        User user=users.stream().filter(u->u.getId().equals(id)).findFirst().orElse(null);

        if(user !=null){
            return ResponseEntity.ok(user);
        }else{
            return ResponseEntity.notFound().build();
        }

    }

    //Add a POST method for creating users
    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user){
        user.setId(nextId++);
        users.add(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }



    @GetMapping("/search/{name}")
    public List<User> searchUserByName(@PathVariable String name){
        return users.stream().filter(user->user.getName().toLowerCase().contains(name.toLowerCase())).toList();
    }


    @GetMapping("/city/{city}")
    public List<User> getUsersByCity(@PathVariable String city){
        return users.stream().filter( user -> user.getCity().equalsIgnoreCase(city)).toList();
    }

}