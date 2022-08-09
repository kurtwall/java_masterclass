package com.kurtwall;

/**
 * Model a song
 * @songTitle - Title of song
 * @duration  - Length of song in minutes
 */
public class Song {
    private String songTitle;
    private Integer duration;

    public Song(String songTitle, Integer duration) {
        this.songTitle = songTitle;
        this.duration = duration;
    }
}
