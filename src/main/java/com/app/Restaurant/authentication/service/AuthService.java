package com.app.Restaurant.authentication.service;



import com.app.Restaurant.usermodel.Requests.UsersRequest;
import com.app.Restaurant.usermodel.model.Users;

import java.util.Optional;

public interface AuthService {
    public Optional<Users> AddUser(UsersRequest user);
}
