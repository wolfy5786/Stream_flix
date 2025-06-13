package com.streaming.streamflix.mapper;

import com.streaming.streamflix.model.UserEntity;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    private final ContentMapper contentMapper;

    public UserMapper(ContentMapper contentMapper) {
        this.contentMapper = contentMapper;
    }

    // GraphQL → Entity
    public UserEntity toEntity(com.streaming.streamflix.codegen.types.User user) {
        UserEntity entity = new UserEntity(user.getName(), user.getUsername(),user.getId());

        // Optionally map watched/wishlist content if available
        if (user.getWishlistedContent() != null) {
            entity.setWishlistedContent(
                    user.getWishlistedContent().stream()
                            .map(contentMapper::toEntity)
                            .toList()
            );
        }

        if (user.getWatchedContent() != null) {
            entity.setWatchedContent(
                    user.getWatchedContent().stream()
                            .map(contentMapper::toEntity)
                            .toList()
            );
        }

        return entity;
    }

    // Entity → GraphQL
    public com.streaming.streamflix.codegen.types.User toGraphQL(UserEntity userEntity) {
        return com.streaming.streamflix.codegen.types.User.newBuilder()
                .id(userEntity.getId())
                .name(userEntity.getName())
                .username(userEntity.getUsername())
                .wishlistedContent(
                        userEntity.getWishlistedContent().stream()
                                .map(contentMapper::toGraphQL)
                                .toList()
                )
                .watchedContent(
                        userEntity.getWatchedContent().stream()
                                .map(contentMapper::toGraphQL)
                                .toList()
                )
                .build();
    }
}
