package com.kurtwall;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Playlist playlist = new Playlist("Drive Time Beats");

        playlist.addSong(new Song("867-5309", 3));
        playlist.addSong(new Song("Sound of Silence", 4));
        playlist.addSong(new Song("Hot Legs", 3));
        playlist.addSong(new Song("Papers Please!", 4));
        playlist.addSong(new Song("Reagan", 3));
        playlist.addSong(new Song("Working in a Coal Mine", 3));

        printMenu();
        System.out.print("Type selection and press Enter: ");
        Scanner scanner = new Scanner(System.in);
        Integer choice = scanner.nextInt();
        scanner.nextLine();
        while (choice != 0) {
            switch (choice) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    playNext(playlist.getPlaylist().get(3));
                    break;
                case 2:
                    playPrevious(playlist.getPlaylist().get(3));
                    break;
                case 3:
                    replayCurrent(playlist.getPlaylist().get(3));
                    break;
                case 4:
                    printList();
                    break;
            }
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

    public static void playNext(Song song) {
        System.out.println("Now playing " + song.getTitle());
    }

    public static void playPrevious(Song song) {
        System.out.println("Now playing " + song.getTitle());
    }

    public static void replayCurrent(Song song) {
        System.out.println("Now playing " + song.getTitle());
    }

    public static void printList() {
        //
    }

}