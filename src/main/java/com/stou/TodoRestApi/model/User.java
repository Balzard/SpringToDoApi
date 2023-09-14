package com.stou.TodoRestApi.model;

import java.util.Optional;
import java.util.UUID;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="users")
public class User {

    @Id
    private String id;

    private String firstName;

    private String secondName;

    public User() {
        this.id = UUID.randomUUID().toString();
    }

    public String getId() {
        return this.id;
    }

    public Optional<String> getFirstName() {
        return Optional.ofNullable(firstName);
    }

    public User setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public Optional<String> getSecondName() {
        return Optional.ofNullable(secondName);
    }

    public User setSecondName(String secondName) {
        this.secondName = secondName;
        return this;
    }
    
}
