package com.kurtwall;

import java.util.ArrayList;
import java.util.ListIterator;

public class Playlist {
    private String playlistTitle;
    private ArrayList<String> playlist;
    private Integer currentlyPlaying;

    public Playlist(String playlistTitle) {
        this.playlistTitle = playlistTitle;
        this.playlist = new ArrayList<>();
        this.currentlyPlaying = 0;
    }

    public Boolean add(ArrayList<Album> albums, String songTitle) {
        ListIterator albumListIterator = albums.listIterator();

        // Don't add a dupe
        if (isDupe(songTitle) == false) {
            while (albumListIterator.hasNext()) {
                Album album = (Album) albumListIterator.next();
                if (album.songExists(songTitle) == true) {
                    this.playlist.add(songTitle);
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    private Boolean isDupe(String songTitle) {
        ListIterator playListIterator = playlist.listIterator();

        while (playListIterator.hasNext()) {
            String song = playListIterator.next().toString();
            if (song == songTitle) {
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
