package com.stou.TodoRestApi.controllers.dto;

import com.stou.TodoRestApi.Model.entities.User;

public class TaskRequest {

    private String description;

    private User user;


    public String getDescription() {
        return this.description;
    }

    public TaskRequest setDescription(String description) {
        this.description = description;
        return this;
    }

    public User getUser() {
        return this.user;
    }

    public TaskRequest setUser(User user) {
        this.user = user;
        return this;
    }

}
