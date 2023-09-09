package com.stou.TodoRestApi.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.stou.TodoRestApi.Model.entities.Task;
import com.stou.TodoRestApi.controllers.dto.TaskDto;
import com.stou.TodoRestApi.services.TaskService;

@RestController
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService){
        this.taskService = taskService;
    }

    @GetMapping(path = "/tasks/{id}")
    public TaskDto getTask(@PathVariable("id") String id) {
        return taskService.findOne(id);
    }

    @DeleteMapping(path = "/tasks/{id}")
    public HttpStatus deleteTask(@PathVariable("id") String id) {
        taskService.delete(id);
        return HttpStatus.NO_CONTENT;
    }

    @PostMapping(path = "/tasks")
    public TaskDto createTask(@RequestBody TaskDto taskDto) {
        Task task = TaskDto.to(taskDto);
        Task savedTask = taskService.create(task);
        return TaskDto.from(savedTask);
    }
    
}
