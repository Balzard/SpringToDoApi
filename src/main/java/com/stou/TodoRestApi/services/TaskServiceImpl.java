package com.stou.TodoRestApi.services;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.stou.TodoRestApi.Model.entities.Task;
import com.stou.TodoRestApi.Model.entities.User;
import com.stou.TodoRestApi.controllers.dto.TaskCreationDto;
import com.stou.TodoRestApi.repositories.TaskRepository;
import com.stou.TodoRestApi.repositories.UserRepository;

@Service
public class TaskServiceImpl implements TaskService{

    private final TaskRepository taskRepository;
    private final UserRepository userRepository;

    public TaskServiceImpl(TaskRepository taskRepository, UserRepository userRepository) {
        this.taskRepository = taskRepository;
        this.userRepository = userRepository;
    }

    @Override
    public Task readOne(String id) {
        return taskRepository.findById(id)
            .orElseThrow(() -> new IllegalArgumentException("un message bidon"));
    }

    @Override
    public List<Task> readAll() {
        return taskRepository.findAll();
    }

    @Override
    public Task create(TaskCreationDto taskRequest) {
        final User user = userRepository.findById(taskRequest.getUserId())
            .orElseThrow(() -> new IllegalArgumentException("un message bidon"));
        final Task task = new Task(user).setDescription(taskRequest.getDescription());
        return taskRepository.save(task);
    }

    @Override
    public void delete(String id) {
        taskRepository.deleteById(id);
    }
    
}
