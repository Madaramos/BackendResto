package com.app.Restaurant.dao;

import com.app.Restaurant.models.Ville;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VilleDao extends JpaRepository<Ville,Integer> {
    Ville findByNom(String ville);
    Ville findById(int id);
}
