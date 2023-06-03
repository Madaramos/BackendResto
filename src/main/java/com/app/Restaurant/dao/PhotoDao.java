package com.app.Restaurant.dao;

import com.app.Restaurant.models.Photo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhotoDao extends JpaRepository<Photo,Integer> {
    Photo findById(int id);
}
