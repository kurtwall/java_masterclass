package com.kurtwall;

import java.util.ArrayList;
import java.util.ListIterator;

public class Playlist {
    private String playlistTitle;
    private ArrayList<String> playlist;

    public Playlist(String playlistTitle) {
        this.playlistTitle = playlistTitle;
        this.playlist = new ArrayList<>();
    }

    public ArrayList<String> getPlaylist() {
        return playlist;
    }

    public Boolean addSong(String songTitle) {
        Boolean songExists;
        if (findSong(songTitle) == null) {
            playlist.add(songTitle);
            songExists = true;
        } else {
            System.out.println(songTitle + " already on playlist");
            songExists = false;
        }
        return songExists;
    }

    private Boolean findSong(String songTitle) {
        return null;
    }
}
