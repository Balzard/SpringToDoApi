package com.stou.TodoRestApi.controllers.dto;

public class UserRequest {

    private String id;

    private String firstName;

    private String secondName;


    public String getId() {
        return this.id;
    }

    public UserRequest setId(String id) {
        this.id = id;
        return this;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public UserRequest setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getSecondName() {
        return this.secondName;
    }

    public UserRequest setSecondName(String secondName) {
        this.secondName = secondName;
        return this;
    }
    
}
