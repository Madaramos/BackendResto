package com.app.Restaurant.rest;

import com.app.Restaurant.models.Zone;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(path ="/api/zones")
<<<<<<< HEAD
@CrossOrigin(origins="http://localhost:3000")
=======
>>>>>>> 0e9463e8153b7ec5fa4fd232d46a3c7980697d2e
public interface ZoneRest {
    @GetMapping(path ="/get")
    ResponseEntity<List<Zone>> getAllZones();

    @GetMapping(path ="/{id}")
    ResponseEntity<Zone> getZoneById(@PathVariable int id);

    @PostMapping(path ="/save")
    ResponseEntity<?> createZone(@RequestBody Zone zone);

    @PostMapping(path ="/update/{id}")
    ResponseEntity<?> updateZone(@PathVariable int id, @RequestBody Zone zone);

    @DeleteMapping(path ="/delete/{id}")
    ResponseEntity<?> deleteZone(@PathVariable int id);

}
