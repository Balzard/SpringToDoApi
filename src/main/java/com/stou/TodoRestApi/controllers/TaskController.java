package com.stou.TodoRestApi.controllers;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.stou.TodoRestApi.controllers.dto.TaskDto;
import com.stou.TodoRestApi.manager.TaskManager;
import com.stou.TodoRestApi.model.Task;
import com.stou.TodoRestApi.model.TaskType;
import com.stou.TodoRestApi.controllers.dto.TaskCreationDto;

@RestController
public class TaskController {

    private final TaskManager taskService;

    public TaskController(TaskManager taskService){
        this.taskService = taskService;
    }

    @PostMapping(path = "/tasks")
    public TaskDto createTask(@RequestBody TaskCreationDto taskRequest) {
        Task savedTask = taskService.create(taskRequest);
        return TaskDto.from(savedTask);
    }

    @GetMapping(path = "/tasks/{id}")
    public TaskDto getTask(@PathVariable("id") String id) {
        return TaskDto.from(taskService.readOne(id));
    }

    @DeleteMapping(path = "/tasks/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteTask(@PathVariable("id") String id) {
        taskService.delete(id);
    }

    @GetMapping(path = "/tasks")
    public List<TaskDto> getTasks(@RequestParam(required = false) TaskType taskType) {
        List<Task> tasks = taskService.readAll(taskType);
        return tasks.stream()
            .map(TaskDto::from)
            .toList();
    }
    
}
