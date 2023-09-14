package com.stou.TodoRestApi.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stou.TodoRestApi.model.Task;
import com.stou.TodoRestApi.model.TaskType;

@Repository
public interface TaskRepository extends JpaRepository<Task, String> {

    List<Task> findAllByType(TaskType type);
    
}
