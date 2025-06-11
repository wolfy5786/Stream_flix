package com.streaming.streamflix.repository;

import com.streaming.streamflix.model.CastEntity;
import com.streaming.streamflix.model.ContentEntity;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface CastRepository extends ReactiveMongoRepository<CastEntity, String> {
    Mono<CastEntity> findByName(String name);

}
