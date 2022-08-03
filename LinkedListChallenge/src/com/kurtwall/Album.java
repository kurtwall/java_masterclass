package com.kurtwall;

import java.util.ArrayList;
import java.util.ListIterator;

public class Album {
    private String albumTitle;
    private ArrayList<Song> songs;

    public Album(String albumTitle, ArrayList<Song> songs) {
        this.albumTitle = albumTitle;
        this.songs = songs;
    }

    public String getAlbumTitle() {
        return albumTitle;
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

    public void printSongList() {
        ListIterator<Song> i = this.songs.listIterator();

        while (i.hasNext()) {
            System.out.println("* " + i.next());
        }
        System.out.println("=============================");
    }
}