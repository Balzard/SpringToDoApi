package com.stou.TodoRestApi.controllers.dto;

import com.stou.TodoRestApi.model.TaskType;

public class TaskCreationDto {

    private String description;

    private String userId;

    private TaskType type;


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


    public TaskType getType() {
        return this.type;
    }

    public TaskCreationDto setType(TaskType type) {
        this.type = type;
        return this;
    }


}
