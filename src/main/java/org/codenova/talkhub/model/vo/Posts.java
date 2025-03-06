package org.codenova.talkhub.model.vo;

import java.util.Date;

public class Posts {
    private int id;
    private String writerId;
    private String category;
    private String title;
    private String context;
    private int views;
    private int likes;
    private Date writedAt;
    private Date modifiedAt;

    public Posts() {
    }

    public Posts(int id, String writerId, String category, String title, String context, int views, int likes, Date writedAt, Date modifiedAt) {
        this.id = id;
        this.writerId = writerId;
        this.category = category;
        this.title = title;
        this.context = context;
        this.views = views;
        this.likes = likes;
        this.writedAt = writedAt;
        this.modifiedAt = modifiedAt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWriterId() {
        return writerId;
    }

    public void setWriterId(String writerId) {
        this.writerId = writerId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public Date getWritedAt() {
        return writedAt;
    }

    public void setWritedAt(Date writedAt) {
        this.writedAt = writedAt;
    }

    public Date getModifiedAt() {
        return modifiedAt;
    }

    public void setModifiedAt(Date modifiedAt) {
        this.modifiedAt = modifiedAt;
    }
}
