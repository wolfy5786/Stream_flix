package com.streaming.streamflix.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collation = "user")
public class UserEntity {
    private String name;
    private String username;
    @Id
    private String id;
    private List<ContentEntity> wishlistedContent;
    private List<ContentEntity> watchedContent;


    public UserEntity(String name, String username, List<ContentEntity> wishlistedContent, List<ContentEntity> watchedContent) {
        this.name = name;
        this.username = username;
        this.wishlistedContent = wishlistedContent;
        this.watchedContent = watchedContent;
    }

    public UserEntity(String name, String username, String id, List<ContentEntity> wishlistedContent, List<ContentEntity> watchedContent) {
        this.name = name;
        this.username = username;
        this.id = id;
        this.wishlistedContent = wishlistedContent;
        this.watchedContent = watchedContent;
    }

    public String getUsername() {
        return username;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ContentEntity> getWishlistedContent() {
        return wishlistedContent;
    }

    public void setWishlistedContent(List<ContentEntity> wishlistedContent) {
        this.wishlistedContent = wishlistedContent;
    }

    public List<ContentEntity> getWatchedContent() {
        return watchedContent;
    }

    public void setWatchedContent(List<ContentEntity> watchedContent) {
        this.watchedContent = watchedContent;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", id='" + id + '\'' +
                ", wishlistedContent=" + wishlistedContent +
                ", watchedContent=" + watchedContent +
                '}';
    }
}
