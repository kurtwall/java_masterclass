package com.kurtwall;

public class Song {
    private String title;
    private Integer duration;

    public Song(String title, Integer duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public Integer getDuration() {
        return duration;
    }
}
