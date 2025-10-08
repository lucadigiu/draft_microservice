package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@AllArgsConstructor
@Slf4j
public class ServiceImpl implements UserService{

    private final UserRepository userRepository;

    @Override
    public List<User> findAll() {
        return userRepository.findAll()
            .stream()
            .toList();
    }

    @Override
    public User save(User u) {
        return userRepository.save(u);
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));}

    @Override
    public void delete(Long id) {
        userRepository.deleteById(id);
    }

}
