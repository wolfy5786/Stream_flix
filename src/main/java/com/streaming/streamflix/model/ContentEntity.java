package com.streaming.streamflix.model;

import com.streaming.streamflix.codegen.types.Date;
import com.streaming.streamflix.codegen.types.Genre;
import com.streaming.streamflix.codegen.types.Kind;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


import java.util.List;

@Document(collation = "content")
public class ContentEntity {
    private String title;
    @Id
    private String id;
    private Float rating;
    private Date releaseDate;
    private List<ContentEntity> similarContent;
    private List<CastEntity> cast;
    private Genre genre;
    private Kind kind;

    public ContentEntity(String title, Float rating, Date releaseDate, List<ContentEntity> similarContent, List<CastEntity> cast, Genre genre, Kind kind) {
        this.title = title;
        this.rating = rating;
        this.releaseDate = releaseDate;
        this.similarContent = similarContent;
        this.cast = cast;
        this.genre = genre;
        this.kind = kind;
    }

    public ContentEntity(String title, String id, Float rating, Date releaseDate, List<ContentEntity> similarContent, List<CastEntity> cast, Genre genre, Kind kind) {
        this.title = title;
        this.id = id;
        this.rating = rating;
        this.releaseDate = releaseDate;
        this.similarContent = similarContent;
        this.cast = cast;
        this.genre = genre;
        this.kind = kind;
    }

    public ContentEntity(String title, String id) {
        this.title = title;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Float getRating() {
        return rating;
    }

    public void setRating(Float rating) {
        this.rating = rating;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public List<ContentEntity> getSimilarContent() {
        return similarContent;
    }

    public void setSimilarContent(List<ContentEntity> similarContent) {
        this.similarContent = similarContent;
    }

    public List<CastEntity> getCast() {
        return cast;
    }

    public void setCast(List<CastEntity> cast) {
        this.cast = cast;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Kind getKind() {
        return kind;
    }

    public void setKind(Kind kind) {
        this.kind = kind;
    }

    @Override
    public String toString() {
        return "ContentEntity{" +
                "title='" + title + '\'' +
                ", id='" + id + '\'' +
                ", rating=" + rating +
                ", date=" + releaseDate +
                ", similarContent=" + similarContent +
                ", cast=" + cast +
                ", genre=" + genre +
                ", kindEnum=" + kind +
                '}';
    }
}
