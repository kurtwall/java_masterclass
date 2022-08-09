package com.kurtwall;

import java.util.ArrayList;
import java.util.ListIterator;

public class Playlist {
    private String playlistTitle;
    private ArrayList<String> playlist;
    private Integer currentlyPlaying;

    public Playlist(String playlistTitle) {
        System.out.println("➡➡➡➡➡ Creating playlist " + playlistTitle);
        this.playlistTitle = playlistTitle;
        this.playlist = new ArrayList<>();
        this.currentlyPlaying = 0;
    }

    public Boolean add(String songTitle) {
        Boolean songExists;
        if (findSong(songTitle) == false) {
            this.playlist.add(songTitle);
            songExists = true;
        } else {
            System.out.println("➡➡➡➡➡ " + songTitle + " already on playlist");
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
            System.out.println("➡➡➡➡➡ At end of playlist");
        } else {
            this.currentlyPlaying++;
            System.out.println("➡➡➡➡➡ Now playing: " + nowPlaying());
        }
    }

    public void playPrevious() {
        if (this.currentlyPlaying == 0) {
            System.out.println("➡➡➡➡➡ At beginning of list");
        } else {
            this.currentlyPlaying--;
            System.out.println("➡➡➡➡➡ Now playing: " + nowPlaying());
        }
    }

    public void replayCurrent() {
        System.out.println("➡➡➡➡➡ Now playing: " + nowPlaying());
    }

    public void removeCurrent() {
        ListIterator li = this.playlist.listIterator();

        String songTitle = this.playlist.get(currentlyPlaying);
        System.out.println("➡➡➡➡➡ Removing " + songTitle);
        while (li.hasNext()) {
            if (li.next() == songTitle) {
                li.remove();
                if (this.currentlyPlaying > 0) {
                    currentlyPlaying--;
                } else {
                    currentlyPlaying++;
                }
            }
        }
    }

    public String nowPlaying() {
        return this.playlist.get(this.currentlyPlaying);
    }

    public void display() {
        ListIterator li = this.playlist.listIterator();
        while (li.hasNext()) {
            System.out.println("* " + li.next());
        }
    }
}
