package com.app.Restaurant.rest;

import com.app.Restaurant.models.Restaurant;
import com.app.Restaurant.models.Ville;
import com.app.Restaurant.models.Zone;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(path="/api")
<<<<<<< HEAD
@CrossOrigin(origins="http://localhost:3000")
=======
>>>>>>> 0e9463e8153b7ec5fa4fd232d46a3c7980697d2e
public interface VilleRest {
    @GetMapping(path="/villes")
    public ResponseEntity<List<Ville>> getAllVille();
    @GetMapping(path = "/{id}")
    ResponseEntity<Ville> getVilleById(@PathVariable int id);

    @PostMapping(path ="/save")
    ResponseEntity<?> createVille(@RequestBody Ville ville);

    @PostMapping(path ="/update/{id}")
    ResponseEntity<?> updateVille(@PathVariable int id, @RequestBody Ville ville);

    @DeleteMapping(path = "/delete/{id}")
    ResponseEntity<?> deleteVille(@PathVariable int id);
    @GetMapping(path = "/villes/{ville}/zones")
    public ResponseEntity<List<Zone>> getAllZonesForVille(@PathVariable String ville);

    @GetMapping(path = "/villes/{ville}/zones/{zone}/restaurants")
    public ResponseEntity<List<Restaurant>> getAllRestaurantsForZone(@PathVariable String ville, @PathVariable String zone);

    @GetMapping(path = "/villes/{ville}/zones/{zone}/restaurants/specialite")
    public ResponseEntity<?> getAllRestaurantsForZoneAndSpecialite(@PathVariable String ville,
                                                                                  @PathVariable String zone,
                                                                                  @RequestParam(name = "specialite") String specialite);
    @GetMapping(path = "/villes/{ville}/zones/{zone}/restaurants/serie")
    public ResponseEntity<List<Restaurant>> getAllRestaurantsForZoneAndSerie(@PathVariable String ville,
                                                                             @PathVariable String zone,
                                                                             @RequestParam(name = "serie") String serie);
    @GetMapping(path = "/villes/{ville}/zones/{zone}/restaurants/{id}")
    public ResponseEntity<?> getRestaurantForZoneAndId(@PathVariable String ville,
                                                                      @PathVariable String zone,
                                                                      @PathVariable int id);

    @GetMapping(path = "/ville/{ville}/zone/{zone}/restaurants/{id}/itineraire")
    public ResponseEntity<?> getRestaurantitineraire(@PathVariable String ville,
                                                     @PathVariable String zone,
                                                     @PathVariable int id);
}
