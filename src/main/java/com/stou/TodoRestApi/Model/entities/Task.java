package com.stou.TodoRestApi.Model.entities;

import java.sql.Date;
import java.util.UUID;

import jakarta.persistence.*;

@Entity
public class Task {

    @Id
    private String id;

    private String description;

    private Date limDate;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "task_id")
    private User user;

    public Task() {
        this.id = UUID.randomUUID().toString();
    }

    // public static Task from(TaskDto taskDto){
    //     return new Task()
    //     .setId(taskDto.getId())
    //     .setDescription(taskDto.getDescription())
    //     .setLimDate(taskDto.getLimDate())
    //     .setUser(taskDto.getUser());
    // }

    public String getId() {
        return this.id;
    }

    public Task setId(String id) {
        this.id = id;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    public Task setDescription(String description) {
        this.description = description;
        return this;
    }

    public Date getLimDate() {
        return this.limDate;
    }

    public Task setLimDate(Date limDate) {
        this.limDate = limDate;
        return this;
    }


    public User getUser() {
        return this.user;
    }

    public Task setUser(User user) {
        this.user = user;
        return this;
    }

}
