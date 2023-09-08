package com.stou.TodoRestApi.repositories;

import org.springframework.data.repository.CrudRepository;
import com.stou.TodoRestApi.domain.entities.User;

public interface UserRepository extends CrudRepository<User, String> {
    
}
