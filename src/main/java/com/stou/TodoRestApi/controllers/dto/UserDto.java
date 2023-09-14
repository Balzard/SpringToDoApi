package com.stou.TodoRestApi.controllers.dto;

import com.stou.TodoRestApi.Model.entities.User;

public class UserDto {

    private String id;

    private String firstName;

    private String secondName;

    public static UserDto from(User user) {
        return new UserDto()
        .setId(user.getId())
        .setFirstName(user.getFirstName().orElse("dodo"))
        .setSecondName(user.getSecondName().orElse("merde"));
    }

    public String getId() {
        return this.id;
    }

    public UserDto setId(String id) {
        this.id = id;
        return this;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public UserDto setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getSecondName() {
        return this.secondName;
    }

    public UserDto setSecondName(String secondName) {
        this.secondName = secondName;
        return this;
    }
}
