package com.stou.TodoRestApi.controllers.dto;

import java.sql.Date;

import com.stou.TodoRestApi.Model.entities.Task;
import com.stou.TodoRestApi.Model.entities.User;

public class TaskDto {
    
    private String id;

    private String description;

    private Date limDate;

    private User user;

    public static TaskDto from(Task task){
        return new TaskDto()
        .setId(task.getId())
        .setDescription(task.getDescription())
        .setLimDate(task.getLimDate())
        .setUser(task.getUser());
    }

    public static Task to(TaskDto taskDto) {
        return new Task()
        .setId(taskDto.getId())
        .setDescription(taskDto.getDescription())
        .setLimDate(taskDto.getLimDate())
        .setUser(taskDto.getUser());
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

    public Date getLimDate() {
        return this.limDate;
    }

    public TaskDto setLimDate(Date limDate) {
        this.limDate = limDate;
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
