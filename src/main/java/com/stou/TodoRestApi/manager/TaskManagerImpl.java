package com.stou.TodoRestApi.manager;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.stou.TodoRestApi.controllers.dto.TaskCreationDto;
import com.stou.TodoRestApi.model.Task;
import com.stou.TodoRestApi.model.TaskType;
import com.stou.TodoRestApi.model.User;
import com.stou.TodoRestApi.repositories.TaskRepository;
import com.stou.TodoRestApi.repositories.UserRepository;

@Service
public class TaskManagerImpl implements TaskManager{

    private final TaskRepository taskRepository;
    private final UserRepository userRepository;

    public TaskManagerImpl(TaskRepository taskRepository, UserRepository userRepository) {
        this.taskRepository = taskRepository;
        this.userRepository = userRepository;
    }

    @Override
    public Task readOne(String id) {
        return taskRepository.findById(id)
            .orElseThrow(() -> new IllegalArgumentException("un message bidon"));
    }

    @Override
    public List<Task> readAll(TaskType type) {
        if(type==null) {
            return taskRepository.findAll();
        } else {
            return taskRepository.findAllByType(type);
        }
    }

    @Override
    public Task create(TaskCreationDto taskRequest) {
        if(taskRequest.getType() == null) {
            throw new IllegalArgumentException("type is null");
        }
        final User user = userRepository.findById(taskRequest.getUserId())
            .orElseThrow(() -> new IllegalArgumentException("un message bidon"));
        final Task task = new Task(user, taskRequest.getType()).setDescription(taskRequest.getDescription());
        return taskRepository.save(task);
    }

    @Override
    public void delete(String id) {
        taskRepository.deleteById(id);
    }
    
}
