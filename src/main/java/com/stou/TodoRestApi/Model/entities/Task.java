package com.stou.TodoRestApi.Model.entities;

import java.util.UUID;

import jakarta.persistence.*;

@Entity
@Table(name="tasks")
public class Task {

    @Id
    private String id;

    private String description;

    @ManyToOne(cascade = CascadeType.ALL)
    private User user;

    public Task() {
        
    }

    public Task(User user) {
        this.id = UUID.randomUUID().toString();
        this.user = user;
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

}
