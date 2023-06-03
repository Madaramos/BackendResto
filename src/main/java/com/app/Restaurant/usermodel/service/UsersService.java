package com.app.Restaurant.usermodel.service;



import com.app.Restaurant.usermodel.Requests.UsersRequest;
import com.app.Restaurant.usermodel.model.Users;

import java.util.List;

public interface UsersService {
    public List<Users> GetAllUsers();

    public Users AddUser(UsersRequest user);
}
