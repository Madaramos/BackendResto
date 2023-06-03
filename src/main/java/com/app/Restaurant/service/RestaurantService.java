package com.app.Restaurant.service;

import com.app.Restaurant.models.Restaurant;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface RestaurantService {

    ResponseEntity<List<Restaurant>> getAllRestaurants();
    ResponseEntity<Restaurant> getRestaurantById(int id);
    ResponseEntity<?> createRestaurant(Restaurant restaurant);
    ResponseEntity<?> updateRestaurant(int id, Restaurant restaurant);
    ResponseEntity<?> deleteRestaurant(int id);
}
