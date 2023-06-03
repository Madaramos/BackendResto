package com.app.Restaurant.rest;

import com.app.Restaurant.models.Serie;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(path ="/api/series")
<<<<<<< HEAD
@CrossOrigin(origins="http://localhost:3000")
=======
>>>>>>> 0e9463e8153b7ec5fa4fd232d46a3c7980697d2e
public interface SerieRest {
    @GetMapping(path ="/")
    ResponseEntity<List<Serie>> getAllSeries();

    @GetMapping(path ="/{id}")
    ResponseEntity<Serie> getSerieById(@PathVariable int id);

    @PostMapping(path ="/save")
    ResponseEntity<?> createSerie(@RequestBody Serie serie);

    @PostMapping(path ="/update/{id}")
    ResponseEntity<?> updateSerie(@PathVariable int id, @RequestBody Serie serie);

    @DeleteMapping(path ="/delete/{id}")
    ResponseEntity<?> deleteSerie(@PathVariable int id);

}
