package com.app.Restaurant.rest;

import com.app.Restaurant.models.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(path ="/api/users")
<<<<<<< HEAD
@CrossOrigin(origins="http://localhost:3000")
=======
>>>>>>> 0e9463e8153b7ec5fa4fd232d46a3c7980697d2e
public interface UserRest {
    @GetMapping(path ="/")
    ResponseEntity<List<User>> getAllUsers();

    @GetMapping(path ="/{id}")
    ResponseEntity<User> getUserById(@PathVariable int id);

    @PostMapping(path ="/save")
    ResponseEntity<?> createUser(@RequestBody User user);

    @PostMapping(path ="/update/{id}")
    ResponseEntity<?> updateUser(@PathVariable int id, @RequestBody User user);

    @DeleteMapping(path ="/delete/{id}")
    ResponseEntity<?> deleteUser(@PathVariable int id);

}
