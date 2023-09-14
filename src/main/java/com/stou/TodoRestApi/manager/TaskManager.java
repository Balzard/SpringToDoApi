package com.stou.TodoRestApi.manager;

import java.util.List;

import com.stou.TodoRestApi.controllers.dto.TaskCreationDto;
import com.stou.TodoRestApi.model.Task;
import com.stou.TodoRestApi.model.TaskType;

public interface TaskManager {

    Task create(TaskCreationDto task);

    Task readOne(String id);

    void delete(String id);

    List<Task> readAll(TaskType type);
    
}
