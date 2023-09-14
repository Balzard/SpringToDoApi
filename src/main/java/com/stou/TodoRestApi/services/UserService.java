package com.stou.TodoRestApi.services;

import java.util.List;
import com.stou.TodoRestApi.Model.entities.User;
import com.stou.TodoRestApi.controllers.dto.UserCreationDto;

public interface UserService {

    User create(UserCreationDto user);

    User readOne(String id);

    void delete(String id);

    List<User> readAll();

    boolean exists(String id);
    
}
