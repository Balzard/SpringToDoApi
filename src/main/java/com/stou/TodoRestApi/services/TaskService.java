package com.stou.TodoRestApi.services;

import java.util.Optional;

import com.stou.TodoRestApi.domain.entities.Task;

public interface TaskService {

    Task addTask(Task task);

    Optional<Task> findOne(String id);

    void delete(String id);
    
}
