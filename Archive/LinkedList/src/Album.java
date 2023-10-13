import java.util.ArrayList;

public class Album {
    private static String albumTitle;
    private static ArrayList<Song> songList;

    public Album(String title) {
        System.out.println("Creating album '" + title + "'");
        this.albumTitle = title;
        this.songList = new ArrayList<Song>();
    }

    public static ArrayList<Song> getSongList() {
        return songList;
    }

    public Boolean addSong(String title, Integer duration) {
        if(!songList.contains(title)) {
            System.out.println("Adding '" + title + "' to '" + albumTitle +"'");
            songList.add(new Song(title, duration));
            return true;
        } else {
            System.out.println("'" + title + " already on '" + albumTitle + "'");
            return false;
        }
    }
}
