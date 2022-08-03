package com.kurtwall;

import java.util.ArrayList;

public class Playlist {
    private String playlistTitle;
    private ArrayList<Song> playlist;

    public Playlist(String playlistTitle) {
        this.playlistTitle = playlistTitle;
        this.playlist = new ArrayList<>();
    }

    public String getPlaylistTitle() {
        return playlistTitle;
    }

    public ArrayList<Song> getPlaylist() {
        return playlist;
    }

    public Boolean addSong(Song song) {
        Boolean songExists;
        if (findSong(song.getTitle()) == null) {
            playlist.add(song);
            songExists = true;
        } else {
            System.out.println(song.getTitle() + " already on playlist");
            songExists = false;
        }
        return songExists;
    }
}
