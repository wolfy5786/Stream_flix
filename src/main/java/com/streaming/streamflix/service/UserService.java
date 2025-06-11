package com.streaming.streamflix.service;

import com.streaming.streamflix.model.UserEntity;
import com.streaming.streamflix.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class UserService {
    public UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository)
    {
        userRepository = this.userRepository;
    }

    public Mono<UserEntity> getUserByUsername(String username){
        return userRepository.findByUsername(username);
    }

    public Flux<UserEntity> getAllUsers()
    {
        return userRepository.findAll();
    }

    public Mono<UserEntity> getUserById(String id)
    {
        return userRepository.findById(id);
    }
    public Mono<UserEntity> updateUser(UserEntity userEntity)
    {
//        if (userRepository.has)
//        {
//            return userRepository.save(userEntity);
//        }
        return null;
    }
}
