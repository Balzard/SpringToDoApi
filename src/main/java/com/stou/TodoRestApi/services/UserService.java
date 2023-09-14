package com.stou.TodoRestApi.services;

import java.util.List;
import com.stou.TodoRestApi.Model.entities.User;
import com.stou.TodoRestApi.controllers.dto.UserRequest;

public interface UserService {

    User create(UserRequest user);

    User readOne(String id);

    void delete(String id);

    List<User> readAll();

    boolean isExists(String id);
    
}
