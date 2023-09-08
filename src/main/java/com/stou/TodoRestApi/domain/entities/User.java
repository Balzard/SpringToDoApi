package com.stou.TodoRestApi.domain.entities;

import java.util.UUID;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {

    @Id
    private String id;

    private String firstName;

    private String secondName;

    public User(String firstName, String secondName) {
        this.id = UUID.randomUUID().toString();
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public String getId() {
        return this.id;
    }

    public User setId(String id) {
        this.id = id;
        return this;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public User setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getSecondName() {
        return this.secondName;
    }

    public User setSecondName(String secondName) {
        this.secondName = secondName;
        return this;
    }
    
}
