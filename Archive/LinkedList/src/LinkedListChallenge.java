// Create a program that implements a playlist for songs
// The albums will be stored in an ArrayList
// Songs from different albums can be added to the playlist and will appear in the list in the ordera
// they are added.
// Once the songs have been added to the playlist, create a menu of options to:-
// Quit,Skip forward to the next song, skip backwards to a previous song.  Replay the current song.
// List the songs in the playlist
// A song must exist in an album before it can be added to the playlist (so you can only play songs that
// you own).
// Hint:  To replay a song, consider what happened when we went back and forth from a city before we
// started tracking the direction we were going.
// As an optional extra, provide an option to remove the current song from the playlist
// (hint: listiterator.remove()


import java.util.ArrayList;

public class LinkedListChallenge {

    ArrayList<Album> albums = new ArrayList<Album>();

    public static void main(String[] args) {

        // Create albums
        Album thisOne = new Album("My First Album");
        thisOne.addSong("A Song on My Album", 4);
        thisOne.addSong("A Stain on My Pants", 5);
        thisOne.addSong("A Blot on My Record", 3);

        Album thatOne = new Album("Album the Last");
        thatOne.addSong("This Album Sucks Balls", 5);
        thatOne.addSong("Steal This Album", 6);
        thatOne.addSong("Eat the Rich", 4);

        Song song1 = thisOne.getSongList().get(0);
        Song song2 = thatOne.getSongList().get(0);
        Song song3 = thatOne.getSongList().get(1);
        Song song4 = thisOne.getSongList().get(2);

        // Add songs to playlist
        Playlist playlist = new Playlist();
        Playlist.addSong(song1);
        Playlist.addSong(song2);
        Playlist.addSong(song3);
        Playlist.addSong(song4);

        System.out.println(playlist);

        // Show menu then enter while loop
//        printMenu();
//        Integer choice = Integer.MAX_VALUE;
//        while (choice != 0) {
//
//        }
    }

    private static void printMenu() {
        System.out.println("Available actions:");
        System.out.println("1) Skip to next song\n" +
                "2) Back to previous song\n" +
                "3) Replay current song\n" +
                "4) Show playlist\n" +
                "5) Remove song from playlist\n" +
                "0) Quit\n" +
                "SELECT ACTION: ");
    }
}
