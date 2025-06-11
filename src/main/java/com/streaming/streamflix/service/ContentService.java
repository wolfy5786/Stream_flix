package com.streaming.streamflix.service;

import com.streaming.streamflix.model.ContentEntity;
import com.streaming.streamflix.repository.ContentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ContentService {
    public ContentRepository contentRepository;

    @Autowired
    public ContentService(ContentRepository contentRepository)
    {
        contentRepository = this.contentRepository;
    }
    public Mono<ContentEntity> getContentByTitle(String title)
    {
        return contentRepository.findByTitle(title);
    }
    public Mono<ContentEntity> getContentById(String id)
    {
        return contentRepository.findById(id);
    }
    public Flux<ContentEntity> getAllContent()
    {
        return contentRepository.findAll();
    }
}
