package com.kurtwall;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

class LinkedListChallengeTest {

    @Test
    @DisplayName("Song constructor sets duration")
    public void song_constructor_sets_duration() {
        Song song = new Song("867-5309", 3);
        assertEquals(3, song.getDuration());
    }

    @Test
    @DisplayName("Song constructor sets title")
    public void song_constructor_sets_title() {
        Song song = new Song("867-5309", 3);
        assertEquals("867-5309", song.getSongTitle());
    }

    @Test
    @DisplayName("Cannot add dupe song to album")
    public void cannot_add_dupe_song_to_album() {
        ArrayList<Album> albums = new ArrayList<>();
        Album album = new Album("Test Album");
        Song song = new Song("Test Song for a Test Album", 4);

        assertTrue(album.add(song));
        assertFalse(album.add(song));
    }

    @Test
    @DisplayName("Cannot add dupe song to playlist")
    public void cannot_add_dupe_song_to_playlist() {
        Playlist playlist = new Playlist("Test Playlist");
        ArrayList<Album> albums = new ArrayList<>();

        Album album = new Album("Test Album");
        Song song = new Song("Test Song for a Test Album", 4);
        album.add(song);
        albums.add(album);

        playlist.add(albums, song.getSongTitle());
        playlist.add(albums, song.getSongTitle());
    }

    @Test
    @DisplayName("Play Next plays the next song")
    public void play_next_plays_next_song() {

    }

    @Test
    @DisplayName("Play Previous plays the next song")
    void play_previous_plays_previous_song() {

    }

    @Test
    @DisplayName("Replay current replays the current song")
    void replay_current_replays_current_song() {

    }

    @Test
    @DisplayName("Remove current removes the current song")
    void remove_current_removes_current_song() {

    }

    @Test
    @DisplayName("Menu displays properly")
    void print_menu_prints_menu() {

    }
}
