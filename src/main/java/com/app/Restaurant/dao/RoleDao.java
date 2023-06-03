package com.app.Restaurant.dao;

import com.app.Restaurant.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleDao extends JpaRepository<Role,Integer> {
    Role findById(int id);

}
