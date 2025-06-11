package com.streaming.streamflix.repository;

import com.streaming.streamflix.model.ContentEntity;
import com.streaming.streamflix.model.UserEntity;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface ContentRepository extends ReactiveMongoRepository<ContentEntity,String> {
    Mono<ContentEntity> findByTitle(String title);
}
