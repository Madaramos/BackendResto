package com.app.Restaurant.dao;

import com.app.Restaurant.models.Specialite;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpecialiteDao extends JpaRepository<Specialite,Integer> {
    Specialite findById(int id);
}
