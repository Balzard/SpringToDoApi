package com.stou.TodoRestApi.services;

import java.util.List;
import com.stou.TodoRestApi.Model.entities.Task;
import com.stou.TodoRestApi.controllers.dto.TaskRequest;

public interface TaskService {

    Task create(TaskRequest task);

    Task readOne(String id);

    void delete(String id);

    List<Task> readAll();
    
}
