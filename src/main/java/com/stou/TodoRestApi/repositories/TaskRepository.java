package com.stou.TodoRestApi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stou.TodoRestApi.Model.entities.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, String> {
    
}
