package com.app.Restaurant.dao;

import com.app.Restaurant.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao  extends JpaRepository<User,Integer> {
    User findById(int id);
}
