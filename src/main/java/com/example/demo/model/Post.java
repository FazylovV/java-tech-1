package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

public class Post {
    private String text;
    private Integer likes;

    public Post(String text, Integer likes) {
        this.text = text;
        this.likes = likes;
    }

    public String getText() {
        return this.text;
    }

    public Integer getLikes() {
        return this.likes;
    }

}
