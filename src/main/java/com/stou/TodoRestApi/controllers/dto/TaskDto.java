package com.stou.TodoRestApi.controllers.dto;

import com.stou.TodoRestApi.Model.entities.Task;

public class TaskDto {
    
    private String id;

    private String description;

    private UserDto user;

    public static TaskDto from(Task task){
        return new TaskDto()
        .setId(task.getId())
        .setDescription(task.getDescription())
        .setUser(UserDto.from(task.getUser()));
    }

    public String getId() {
        return this.id;
    }

    public TaskDto setId(String id) {
        this.id = id;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    public TaskDto setDescription(String description) {
        this.description = description;
        return this;
    }

    public UserDto getUser() {
        return this.user;
    }

    public TaskDto setUser(UserDto user) {
        this.user = user;
        return this;
    }

}
