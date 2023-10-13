package com.kurtwall;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

class LinkedListChallengeTest {

    private Song song1;
    private Song song2;
    private Album album;
    private ArrayList<Album> albums;
    private Playlist playlist;

    @BeforeEach
    public void setup() {
        song1 = new Song("Test Song the First", 3);
        song2 = new Song("Second Test Song", 4);
        album = new Album("Test Album");
        albums = new ArrayList<>();
        playlist = new Playlist("Test Playlist");
    }

    @Test
    @DisplayName("Song constructor sets duration")
    public void song_constructor_sets_duration() {

        assertEquals(3, song1.getDuration());
    }

    @Test
    @DisplayName("Song constructor sets title")
    public void song_constructor_sets_title() {

        assertEquals("Test Song the First", song1.getSongTitle());
    }

    @Test
    @DisplayName("Cannot add dupe song to album")
    public void cannot_add_dupe_song_to_album() {

        assertTrue(album.add(song1), "Failed to add " + song1 + " to album");
        assertFalse(album.add(song1), "Incorrectly added duplicate song to album");
    }

    @Test
    @DisplayName("Cannot add dupe song to playlist")
    public void cannot_add_dupe_song_to_playlist() {
        album.add(song1);
        albums.add(album);

        assertTrue(playlist.add(albums, song1.getSongTitle()), "Failed to add " + song1 + " to album");
        assertFalse(playlist.add(albums, song2.getSongTitle()), "Incorrectly added duplicate song to playlist");
    }

    @Test
    @DisplayName("Play Next plays the next song")
    public void play_next_plays_next_song() {
        album.add(song1);
        album.add(song2);
        albums.add(album);

        playlist.add(albums, song1.getSongTitle());
        playlist.add(albums, song2.getSongTitle());
        playlist.playNext();
        assertTrue(playlist.nowPlaying() == song2.getSongTitle(), "Failed to play next song");
    }

    @Test
    @DisplayName("Play Previous plays the previous song")
    void play_previous_plays_previous_song() {
        album.add(song1);
        album.add(song2);
        albums.add(album);

        playlist.add(albums, song1.getSongTitle());
        playlist.add(albums, song2.getSongTitle());
        playlist.playNext();
        playlist.playPrevious();
        assertTrue(playlist.nowPlaying() == song1.getSongTitle(), "Failed to play previous song");
    }

    @Test
    @DisplayName("Replay current replays the current song")
    void replay_current_replays_current_song() {
        album.add(song1);
        album.add(song2);
        albums.add(album);

        playlist.add(albums, song1.getSongTitle());
        playlist.add(albums, song2.getSongTitle());
        playlist.replayCurrent();
        assertTrue(playlist.nowPlaying() == song1.getSongTitle(), "Failed to replay current song");
    }

    @Test
    @DisplayName("Remove current removes the current song")
    void remove_current_removes_current_song() {
        album.add(song1);
        album.add(song2);
        albums.add(album);

        playlist.add(albums, song1.getSongTitle());
        playlist.add(albums, song2.getSongTitle());
        playlist.removeCurrent();
        assertTrue(playlist.nowPlaying() == song2.getSongTitle(), "Failed to remove current song");
    }

    @Test
    @DisplayName("Cannot add song to playlist that is not on an album")
    void cannot_add_song_not_on_album() {
        album.add(song1);
        albums.add(album);

        playlist.add(albums, song1.getSongTitle());
        playlist.add(albums, song2.getSongTitle());
        assertTrue(playlist.getSize() == 1, "Incorrectly added song not on an album");
    }
}
