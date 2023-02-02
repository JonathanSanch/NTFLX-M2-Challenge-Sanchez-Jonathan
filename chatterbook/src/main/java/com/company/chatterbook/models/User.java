package com.company.chatterbook.models;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;

    private List<ChatterPost> chatterPosts = new ArrayList<>();

//  Need to define constructor that takes in a string and gives it to ChatterPost list.

    public User(String name) {
        this.name = name;
    }

    public List<ChatterPost> getChatterPosts() {
        return chatterPosts;
    }

    public void setChatterPosts(List<ChatterPost> chatterPosts) {
        this.chatterPosts = chatterPosts;
    }

    public String getName() {
        return name;
    }
}
