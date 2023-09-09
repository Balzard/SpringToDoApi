package com.stou.TodoRestApi.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.stou.TodoRestApi.Model.entities.User;

@Repository
public interface UserRepository extends CrudRepository<User, String> {
    
}
