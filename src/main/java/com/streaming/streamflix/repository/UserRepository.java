package com.streaming.streamflix.repository;

import com.streaming.streamflix.model.ContentEntity;
import com.streaming.streamflix.model.UserEntity;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface UserRepository extends ReactiveMongoRepository<UserEntity, String> {
    Mono<UserEntity> findByUsername(String username);
}
