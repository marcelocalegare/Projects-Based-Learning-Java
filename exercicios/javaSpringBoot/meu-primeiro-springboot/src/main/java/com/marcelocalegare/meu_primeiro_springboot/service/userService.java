package com.marcelocalegare.meu_primeiro_springboot.service;

import com.marcelocalegare.meu_primeiro_springboot.model.User;
import com.marcelocalegare.meu_primeiro_springboot.repository.userRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {

    private final userRepository userRepository;

    public List<User> getAll(){
        return userRepository.findAll();
    }

    public Optional<User> getById(Long id){
        return userRepository.findById(id);
    }

    public User saveUser(User user){
        return userRepository.save(user);
    }

    public void deleteUser(Long id){
        userRepository.deleteById(id);
    }

}
