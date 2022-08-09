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

    public Boolean add(Song newSong) {
        ListIterator<Song> songListIterator = this.songList.listIterator();
        Boolean isDupe = false;

        while (songListIterator.hasNext()) {
            Song currentSong = songListIterator.next();
            if (currentSong.getSongTitle() == newSong.getSongTitle()) {
                isDupe = true;
            }
        }

        if (!isDupe) {
            this.songList.add(newSong);
            return true;
        }

        return false;
    }

    public Boolean songExists(String songTitle) {
        ListIterator<Song> songListIterator = this.songList.listIterator();
        while (songListIterator.hasNext()) {
            Song song = songListIterator.next();
            if (song.getSongTitle() == songTitle) {
                return true;
            }
        }
        return false;
    }
}