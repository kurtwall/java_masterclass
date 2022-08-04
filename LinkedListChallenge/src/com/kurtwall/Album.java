package com.kurtwall;

import java.util.ArrayList;
import java.util.ListIterator;

public class Album {
    private String albumTitle;
    private ArrayList<Song> songList;

    public Album(String albumTitle) {
        this.albumTitle = albumTitle;
        this.songList = new ArrayList<>();
    }
    public Album(String albumTitle, ArrayList<Song> songs) {
        this.albumTitle = albumTitle;
        this.songList = songs;
    }

    public ArrayList<Song> getSongList() {
        return songList;
    }
}