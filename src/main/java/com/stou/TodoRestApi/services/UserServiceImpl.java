package com.stou.TodoRestApi.services;

import java.util.List;
import org.springframework.stereotype.Service;
import com.stou.TodoRestApi.Model.entities.User;
import com.stou.TodoRestApi.controllers.dto.UserRequest;
import com.stou.TodoRestApi.repositories.UserRepository;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User create(UserRequest user) {
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
    public boolean isExists(String id) {
        return this.userRepository.existsById(id);
    }
    
}
