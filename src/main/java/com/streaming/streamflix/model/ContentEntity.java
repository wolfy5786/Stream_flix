package com.streaming.streamflix.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Document(collation = "content")
public class ContentEntity {
    private String title;
    @Id
    private String id;
    private Float rating;
    private Date date;
    private List<ContentEntity> similarContent;
    private List<CastEntity> cast;
    private GenreEnum genre;
    private KindEnum kindEnum;

    public ContentEntity(String title, Float rating, Date date, List<ContentEntity> similarContent, List<CastEntity> cast, GenreEnum genre, KindEnum kindEnum) {
        this.title = title;
        this.rating = rating;
        this.date = date;
        this.similarContent = similarContent;
        this.cast = cast;
        this.genre = genre;
        this.kindEnum = kindEnum;
    }

    public ContentEntity(String title, String id, Float rating, Date date, List<ContentEntity> similarContent, List<CastEntity> cast, GenreEnum genre, KindEnum kindEnum) {
        this.title = title;
        this.id = id;
        this.rating = rating;
        this.date = date;
        this.similarContent = similarContent;
        this.cast = cast;
        this.genre = genre;
        this.kindEnum = kindEnum;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
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

    public GenreEnum getGenre() {
        return genre;
    }

    public void setGenre(GenreEnum genre) {
        this.genre = genre;
    }

    public KindEnum getKindEnum() {
        return kindEnum;
    }

    public void setKindEnum(KindEnum kindEnum) {
        this.kindEnum = kindEnum;
    }

    @Override
    public String toString() {
        return "ContentEntity{" +
                "title='" + title + '\'' +
                ", id='" + id + '\'' +
                ", rating=" + rating +
                ", date=" + date +
                ", similarContent=" + similarContent +
                ", cast=" + cast +
                ", genre=" + genre +
                ", kindEnum=" + kindEnum +
                '}';
    }
}
