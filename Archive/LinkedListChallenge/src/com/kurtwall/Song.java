package com.kurtwall;

public class Song {
    private String songTitle;
    private Integer duration;

    public Song(String songTitle, Integer duration) {
        this.songTitle = songTitle;
        this.duration = duration;
    }

    public String getSongTitle() {
        return this.songTitle;
    }

    public Integer getDuration() {
        return this.duration;
    }
}
