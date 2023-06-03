package com.app.Restaurant.dao;

import com.app.Restaurant.models.Serie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SerieDao extends JpaRepository<Serie,Integer> {
    Serie findByNom(String serie);
    Serie findById(int id);
}
