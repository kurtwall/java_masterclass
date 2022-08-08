package com.kurtwall;

import java.util.ArrayList;
import java.util.ListIterator;

public class Playlist {
    private String playlistTitle;
    private ArrayList<String> playlist;
    private Integer currentlyPlaying;

    public Playlist(String playlistTitle) {
        System.out.println("➡➡➡➡➡➡➡➡ Creating playlist " + playlistTitle);
        this.playlistTitle = playlistTitle;
        this.playlist = new ArrayList<>();
        this.currentlyPlaying = -1;
    }

    public Boolean add(String songTitle) {
        Boolean songExists;
        if (findSong(songTitle) == false) {
            this.playlist.add(songTitle);
            songExists = true;
        } else {
            System.out.println("➡➡➡➡➡➡➡➡ " + songTitle + " already on playlist");
            songExists = false;
        }
        return songExists;
    }

    private Boolean findSong(String songTitle) {
        ListIterator li = playlist.listIterator();
        while (li.hasNext()) {
            if (li.next() == songTitle) {
                return true;
            }
        }
        return false;
    }

    public void playNext() {
        if (this.currentlyPlaying >= this.playlist.size() - 1) {
            System.out.println("➡➡➡➡➡➡➡➡ At end of playlist");
        } else {
            String songTitle = this.playlist.get(this.currentlyPlaying + 1);
            System.out.println("➡➡➡➡➡➡➡➡ Now playing " + songTitle);
            this.currentlyPlaying++;
        }
    }

    public void playPrevious () {
        if (this.currentlyPlaying == 0) {
            System.out.println("➡➡➡➡➡➡➡➡ At beginning of list");
        } else {
            String songTitle = this.playlist.get(this.currentlyPlaying - 1);
            System.out.println("➡➡➡➡➡➡➡➡ Now playing " + songTitle);
            this.currentlyPlaying--;
        }
    }

    public void replayCurrent() {
        String songTitle = this.playlist.get(this.currentlyPlaying);
        System.out.println("➡➡➡➡➡➡➡➡ Now playing " + songTitle);
    }

    public void removeCurrent() {
        String songTitle = this.playlist.get(this.currentlyPlaying);
        System.out.println("➡➡➡➡➡➡➡➡ Removing " + songTitle);
        this.playlist.remove(this.currentlyPlaying);
        currentlyPlaying = 0;
    }

    public void display() {
        ListIterator li = this.playlist.listIterator();
        while (li.hasNext()) {
            System.out.println("* " + li.next());
        }
    }
}
