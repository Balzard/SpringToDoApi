package com.stou.TodoRestApi.controllers;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.stou.TodoRestApi.Model.entities.User;
import com.stou.TodoRestApi.controllers.dto.UserDto;
import com.stou.TodoRestApi.controllers.dto.UserCreationDto;
import com.stou.TodoRestApi.services.UserService;

@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping(path = "/users")
    public UserDto createBook(@RequestBody UserCreationDto userRequest){
        User user = userService.create(userRequest);
        return UserDto.from(user);
    }

    @GetMapping(path = "/users/{id}")
    public UserDto getUser(@PathVariable("id") String id) {
        User user = userService.readOne(id);
        return UserDto.from(user);
    }

    @DeleteMapping(path = "/users/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteUser(@PathVariable("id") String id) {
        userService.delete(id);
    }

    @GetMapping(path = "/users")
    public List<UserDto> getTasks() {
        List<User> tasks = userService.readAll();
        return tasks.stream()
            .map(UserDto::from)
            .toList();
    }
   
}
