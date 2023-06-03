package com.app.Restaurant.rest;

import com.app.Restaurant.models.Specialite;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(path ="/api/specialites")
<<<<<<< HEAD
@CrossOrigin(origins="http://localhost:3000")
=======
>>>>>>> 0e9463e8153b7ec5fa4fd232d46a3c7980697d2e
public interface SpecialiteRest {
    @GetMapping(path ="/")
    ResponseEntity<List<Specialite>> getAllSpecialites();

    @GetMapping(path ="/{id}")
    ResponseEntity<Specialite> getSpecialiteById(@PathVariable int id);

    @PostMapping(path ="/save")
    ResponseEntity<?> createSpecialite(@RequestBody Specialite specialite);

    @PostMapping(path ="/update/{id}")
    ResponseEntity<?> updateSpecialite(@PathVariable int id, @RequestBody Specialite specialite);

    @DeleteMapping(path ="/delete/{id}")
    ResponseEntity<?> deleteSpecialite(@PathVariable int id);

}
