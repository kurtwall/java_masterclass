import java.util.ArrayList;

public class Playlist {
    private static ArrayList<Song> playlist;

    public Playlist() {
        System.out.println("Creating default playlist");
        this.playlist = new ArrayList<>();
    }

    public static Boolean addSong(Song song) {
        System.out.println("Adding '" + song.title + "' to playlist");
        try {
            playlist.add(song);
            return true;
        } catch (Exception e) {
            System.out.println("Caught exception: " + e);
            return false;
        }
    }

    public static Boolean removeSong(Song song) {
        System.out.println("Removing '" + song.title + "' from playlist");
        try {
            playlist.remove(song);
            return true;
        } catch (Exception e) {
            System.out.println("Caught exception: " + e);
            return false;
        }
    }
}
