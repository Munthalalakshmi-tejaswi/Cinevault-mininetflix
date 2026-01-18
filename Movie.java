package com.example.mininetflix;
import java.io.Serializable;

public class Movie implements Serializable {
    private String title;
    private String description;
    private int imageRes;
    private int videoRes;

    public Movie(String title, String description, int imageRes, int videoRes) {
        this.title = title;
        this.description = description;
        this.imageRes = imageRes;
        this.videoRes = videoRes;
    }

    public String getTitle() { return title; }
    public String getDescription() { return description; }
    public int getImageRes() { return imageRes; }
    public int getVideoRes() { return videoRes; }
}
