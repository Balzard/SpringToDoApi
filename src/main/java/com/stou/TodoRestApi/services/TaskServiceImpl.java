package com.stou.TodoRestApi.services;
import java.util.List;
import org.springframework.stereotype.Service;

import com.stou.TodoRestApi.Model.entities.Task;
import com.stou.TodoRestApi.controllers.dto.TaskRequest;
import com.stou.TodoRestApi.repositories.TaskRepository;

@Service
public class TaskServiceImpl implements TaskService{

    private TaskRepository taskRepository;

    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public Task readOne(String id) {
        return taskRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("un message bidon"));
    }

    @Override
    public List<Task> readAll() {
        return taskRepository.findAll();
    }

    @Override
    public Task create(TaskRequest taskRequest) {
        Task task = new Task().setDescription(taskRequest.getDescription());
        return taskRepository.save(task);
    }

    @Override
    public void delete(String id) {
        taskRepository.deleteById(id);
    }
    
}
