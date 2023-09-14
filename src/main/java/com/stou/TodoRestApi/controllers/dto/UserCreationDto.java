package com.stou.TodoRestApi.controllers.dto;

public class UserCreationDto {

    private String id;

    private String firstName;

    private String secondName;


    public String getId() {
        return this.id;
    }

    public UserCreationDto setId(String id) {
        this.id = id;
        return this;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public UserCreationDto setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getSecondName() {
        return this.secondName;
    }

    public UserCreationDto setSecondName(String secondName) {
        this.secondName = secondName;
        return this;
    }
    
}
