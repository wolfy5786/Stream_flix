package com.streaming.streamflix.mapper;

import com.streaming.streamflix.model.ContentEntity;
import org.springframework.stereotype.Component;

@Component
public class ContentMapper {

    public com.streaming.streamflix.codegen.types.Content toGraphQL(ContentEntity entity) {
        return com.streaming.streamflix.codegen.types.Content.newBuilder()
                .id(entity.getId())
                .title(entity.getTitle())
                .genre(entity.getGenre())
                .kind(entity.getKind())
                .rating(entity.getRating())
                .release(entity.getReleaseDate())
                .build();
    }

    public ContentEntity toEntity(com.streaming.streamflix.codegen.types.Content content) {
        ContentEntity entity = new ContentEntity(content.getTitle(), content.getId());
        entity.setGenre(content.getGenre());
        entity.setKind(content.getKind());
        entity.setRating((float) content.getRating());
        entity.setReleaseDate(content.getRelease());
        return entity;
    }

}
