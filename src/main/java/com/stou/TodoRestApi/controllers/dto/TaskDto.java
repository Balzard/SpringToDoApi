package com.stou.TodoRestApi.controllers.dto;

import com.stou.TodoRestApi.Model.entities.Task;
import com.stou.TodoRestApi.Model.entities.User;

public class TaskDto {
    
    private String id;

    private String description;

    private User user;

    public static TaskDto from(Task task){
        return new TaskDto()
        .setId(task.getId())
        .setDescription(task.getDescription())
        .setUser(task.getUser());
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

    public User getUser() {
        return this.user;
    }

    public TaskDto setUser(User user) {
        this.user = user;
        return this;
    }

}
