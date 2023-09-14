package com.stou.TodoRestApi.controllers.dto;

public class TaskCreationDto {

    private String description;

    private String userId;


    public String getDescription() {
        return this.description;
    }

    public TaskCreationDto setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getUserId() {
        return this.userId;
    }

    public TaskCreationDto setUserId(String userId) {
        this.userId = userId;
        return this;
    }

}
