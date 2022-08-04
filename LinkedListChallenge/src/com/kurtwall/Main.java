package com.kurtwall;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    public static Playlist playlist = new Playlist("Drive Time Beats");
    public static ArrayList<Song> songs = new ArrayList<>();

    public static void main(String[] args) {

        songs.add(new Song("867-5309", 3));
        songs.add(new Song("Sound of Silence", 4));
        songs.add(new Song("Hot Legs", 3));
        songs.add(new Song("Papers Please!", 4));
        songs.add(new Song("Reagan", 3));
        songs.add(new Song("Working in a Coal Mine", 3));

        Album album = new Album("Self-Titled Album", songs);

        playlist.addSong("867-5309");
        playlist.addSong("Sound of Silence");
        playlist.addSong("Hot Legs");
        playlist.addSong("Papers Please!");
        playlist.addSong("Reagan");
        playlist.addSong("Working in a Coal Mine");

        printMenu();
        System.out.print("Type selection and press Enter: ");
        Scanner scanner = new Scanner(System.in);
        Integer choice = scanner.nextInt();
        scanner.nextLine();

        while (choice != 0) {
            switch (choice) {
                case 1:
                    playNext(playlist);
                    break;
                case 2:
                    playPrevious(playlist);
                    break;
                case 3:
                    replayCurrent(playlist);
                    break;
                case 4:
                    printList(playlist);
                    break;
                default:
                    break;
            }
            printMenu();
            System.out.print("Type selection and press Enter: ");
            choice = scanner.nextInt();
            scanner.nextLine();
        }
    }

    private static void printMenu() {
        System.out.println("Available Actions\n" +
                "1) Play next song\n" +
                "2) Play previous song\n" +
                "3) Replay current song\n" +
                "4) Display playlist\n" +
                "0) Exit");
    }

    public Song findSong(String songTitle) {

        return null;
    }

    public static void playNext(Playlist playlist) {

        System.out.println("Playing next song");
        ArrayList<String> list = playlist.getPlaylist();
    }

    public static void playPrevious(Playlist playlist) {

        System.out.println("Playing previous song");
    }

    public static void replayCurrent(Playlist playlist) {

        System.out.println("Replaying current song");
    }

    public static void printList(Playlist playlist) {

        ListIterator li = playlist.getPlaylist().listIterator();
        while (li.hasNext()) {
            String songTitle = (String) li.next();
            System.out.println("* " + songTitle);
        }
    }
}