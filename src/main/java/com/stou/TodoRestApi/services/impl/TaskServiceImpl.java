package com.stou.TodoRestApi.services.impl;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.stou.TodoRestApi.domain.entities.Task;
import com.stou.TodoRestApi.repositories.TaskRepository;
import com.stou.TodoRestApi.services.TaskService;

@Service
public class TaskServiceImpl implements TaskService{

    private TaskRepository taskRepository;

    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public Optional<Task> findOne(String id) {
        return taskRepository.findById(id);
    }

    @Override
    public Task addTask(Task task) {
        return taskRepository.save(task);
    }

    @Override
    public void delete(String id) {
        taskRepository.deleteById(id);
    }
    
}
