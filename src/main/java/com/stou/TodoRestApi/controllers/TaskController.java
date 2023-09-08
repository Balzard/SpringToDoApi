package com.stou.TodoRestApi.controllers;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import com.stou.TodoRestApi.domain.entities.Task;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.stou.TodoRestApi.domain.dto.TaskDto;
import com.stou.TodoRestApi.services.TaskService;

@RestController
public class TaskController {

    private TaskService taskService;

    public TaskController(TaskService taskService){
        this.taskService = taskService;
    }

    @GetMapping(path = "/tasks/{id}")
    public ResponseEntity<TaskDto> getTask(@PathVariable("id") String id) {
        Optional<Task> task = taskService.findOne(id);
        return task.map(taskEntity -> {
            TaskDto taskDto = TaskDto.from(taskEntity);
            return new ResponseEntity<>(taskDto, HttpStatus.OK);
        }).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping(path = "/tasks/{id}")
    public ResponseEntity deleteTask(@PathVariable("id") String id) {
        taskService.delete(id);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @PostMapping(path = "/tasks")
    public ResponseEntity<TaskDto> createTask(@RequestBody TaskDto taskDto) {
        Task task = Task.from(taskDto);
        Task savedTask = taskService.addTask(task);
        return new ResponseEntity<TaskDto>(TaskDto.from(savedTask), HttpStatus.CREATED);
    }
    
}
