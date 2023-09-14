package com.stou.TodoRestApi.model;

import java.util.UUID;

import jakarta.persistence.*;

@Entity
@Table(name="tasks")
public class Task {

    @Id
    private String id;

    private String description;

    private TaskType type;

    @ManyToOne(cascade = CascadeType.ALL)
    private User user;

    public Task() {

    }

    public Task(User user, TaskType type) {
        this.id = UUID.randomUUID().toString();
        this.user = user;
        this.type = type;
    }

    public String getId() {
        return this.id;
    }

    public String getDescription() {
        return this.description;
    }

    public Task setDescription(String description) {
        this.description = description;
        return this;
    }

    public User getUser() {
        return this.user;
    }

    public TaskType getType() {
        return this.type;
    }

}
