package com.marcelocalegare.meu_primeiro_springboot.service;

import com.marcelocalegare.meu_primeiro_springboot.repository.userRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class userService {

    private final userRepository userRepository;



}
