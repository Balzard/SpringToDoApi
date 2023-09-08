package com.stou.TodoRestApi.domain.dto;

import com.stou.TodoRestApi.domain.entities.User;

public class UserDto {

    private String id;

    private String firstName;

    private String secondName;

    public static UserDto from(User user) {
        return new UserDto()
        .setId(user.getId())
        .setFirstName(user.getFirstName())
        .setSecondName(user.getSecondName());
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
