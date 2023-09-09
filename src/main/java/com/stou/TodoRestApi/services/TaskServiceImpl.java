package com.stou.TodoRestApi.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.stou.TodoRestApi.Model.entities.Task;
import com.stou.TodoRestApi.controllers.dto.TaskDto;
import com.stou.TodoRestApi.repositories.TaskRepository;

@Service
public class TaskServiceImpl implements TaskService{

    private TaskRepository taskRepository;

    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public TaskDto findOne(String id) {
        Optional<Task> task = taskRepository.findById(id);
        return task.map(taskEntity -> {
            return TaskDto.from(taskEntity);
        }).orElse(null); // je savais pas quoi return
    }

    @Override
    public Task create(Task task) {
        return taskRepository.save(task);
    }

    @Override
    public void delete(String id) {
        taskRepository.deleteById(id);
    }
    
}
