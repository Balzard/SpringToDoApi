package com.stou.TodoRestApi.manager;

import java.util.List;
import org.springframework.stereotype.Service;

import com.stou.TodoRestApi.controllers.dto.UserCreationDto;
import com.stou.TodoRestApi.model.User;
import com.stou.TodoRestApi.repositories.UserRepository;

@Service
public class UserManagerImpl implements UserManager {

    private final UserRepository userRepository;

    public UserManagerImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User create(UserCreationDto user) {
        User savedUser = new User().setFirstName(user.getFirstName()).setSecondName(user.getSecondName());
        return this.userRepository.save(savedUser);
    }

    @Override
    public User readOne(String id) {
        return this.userRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Not found"));
    }

    @Override
    public void delete(String id) {
        this.userRepository.deleteById(id);
    }

    @Override
    public List<User> readAll() {
        return this.userRepository.findAll();
    }

    @Override
    public boolean exists(String id) {
        return this.userRepository.existsById(id);
    }
    
}
