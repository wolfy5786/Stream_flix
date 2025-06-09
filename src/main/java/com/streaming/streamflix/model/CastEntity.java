package com.streaming.streamflix.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collation = "cast")
public class CastEntity {
    private String name;
    @Id
    private String id;
    private List<ContentEntity> work;

    public CastEntity(String name, List<ContentEntity> work) {
        this.name = name;
        this.work = work;
    }

    public CastEntity(String name, String id, List<ContentEntity> work) {
        this.name = name;
        this.id = id;
        this.work = work;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ContentEntity> getWork() {
        return work;
    }

    public void setWork(List<ContentEntity> work) {
        this.work = work;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "CastEntity{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", work=" + work +
                '}';
    }
}
