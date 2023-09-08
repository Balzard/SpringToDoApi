package com.stou.TodoRestApi.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.stou.TodoRestApi.domain.entities.Task;

@Repository
public interface TaskRepository extends CrudRepository<Task, String> {
    
}