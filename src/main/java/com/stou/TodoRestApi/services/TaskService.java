package com.stou.TodoRestApi.services;

import java.util.Optional;

import com.stou.TodoRestApi.Model.entities.Task;
import com.stou.TodoRestApi.controllers.dto.TaskDto;

public interface TaskService {

    Task create(Task task);

    TaskDto findOne(String id);

    void delete(String id);
    
}
