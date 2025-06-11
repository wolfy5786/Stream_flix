package com.streaming.streamflix.service;

import com.streaming.streamflix.model.CastEntity;
import com.streaming.streamflix.repository.CastRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class CastService {
    public CastRepository castRepository;

    @Autowired
    public CastService(CastRepository castRepository)
    {
        castRepository = this.castRepository;
    }

    public Mono<CastEntity> getCastByName(String name)
    {
        return castRepository.findByName(name);
    }
    public Mono<CastEntity> getCastById(String id)
    {
        return castRepository.findById(id);
    }

}
