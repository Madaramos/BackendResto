package com.app.Restaurant.rest;

import com.app.Restaurant.models.Photo;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(path ="/api/photos")
<<<<<<< HEAD
@CrossOrigin(origins="http://localhost:3000")
=======
>>>>>>> 0e9463e8153b7ec5fa4fd232d46a3c7980697d2e
public interface PhotoRest {

    @GetMapping(path ="/")
    ResponseEntity<List<Photo>> getAllPhotos();

    @GetMapping(path ="/{id}")
    ResponseEntity<Photo> getPhotoById(@PathVariable int id);

    @PostMapping(path ="/save")
    ResponseEntity<?> createPhoto(@RequestBody Photo photo);

    @PostMapping(path ="/update/{id}")
    ResponseEntity<?> updatePhoto(@PathVariable int id, @RequestBody Photo photo);

    @DeleteMapping(path ="/delete/{id}")
    ResponseEntity<?> deletePhoto(@PathVariable int id);
}