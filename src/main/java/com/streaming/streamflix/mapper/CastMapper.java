package com.streaming.streamflix.mapper;

import com.streaming.streamflix.codegen.types.Cast;
import com.streaming.streamflix.codegen.types.Content;
import com.streaming.streamflix.model.CastEntity;
import com.streaming.streamflix.model.ContentEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CastMapper {

    private final ContentMapper contentMapper;

    public CastMapper(ContentMapper contentMapper) {
        this.contentMapper = contentMapper;
    }

    // Mongo Entity → GraphQL Cast
    public Cast toGraphQL(CastEntity entity) {
        List<Content> works = null;
        if (entity.getWork() != null) {
            works = entity.getWork().stream()
                    .map(contentMapper::toGraphQL)
                    .collect(Collectors.toList());
        }

        return Cast.newBuilder()
                .id(entity.getId())
                .name(entity.getName())
                .work(works)
                .build();
    }

    // GraphQL Cast → Mongo Entity
    public CastEntity toEntity(Cast cast) {
        List<ContentEntity> works = null;
        if (cast.getWork() != null) {
            works = cast.getWork().stream()
                    .map(contentMapper::toEntity)
                    .collect(Collectors.toList());
        }

        return new CastEntity(cast.getName(), cast.getId(), works);
    }
}
