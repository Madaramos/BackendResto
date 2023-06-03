package com.app.Restaurant.service;

import com.app.Restaurant.models.Specialite;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface SpecialiteService {
    ResponseEntity<List<Specialite>> getAllSpecialites();
    ResponseEntity<Specialite> getSpecialiteById(int id);
    ResponseEntity<?> createSpecialite(Specialite specialite);
    ResponseEntity<?> updateSpecialite(int id, Specialite specialite);
    ResponseEntity<?> deleteSpecialite(int id);


}
