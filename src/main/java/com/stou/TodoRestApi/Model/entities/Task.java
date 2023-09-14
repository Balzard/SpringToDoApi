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
    @JoinColumn(name = "user_id")
    private User user;

    public Task() {
        this.id = UUID.randomUUID().toString();
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

    public Task setUser(User user) {
        this.user = user;
        return this;
    }

}
