package com.stou.TodoRestApi.manager;

import java.util.List;

import com.stou.TodoRestApi.controllers.dto.UserCreationDto;
import com.stou.TodoRestApi.model.User;

public interface UserManager {

    User create(UserCreationDto user);

    User readOne(String id);

    void delete(String id);

    List<User> readAll();

    boolean exists(String id);
    
}
