package com.kurtwall;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static Playlist playlist = new Playlist("Drive Time Beats");
    public static ArrayList<Album> albums = new ArrayList<>();

    public static void main(String[] args) {

        Album album = new Album("Kurt's Kustom Album");
        album.add(new Song("867-5309", 3));
        album.add(new Song("Sound of Silence", 4));
        album.add(new Song("Hot Legs", 5));
        album.add(new Song("Papers Please!", 4));
        album.add(new Song("Reagan", 6));
        album.add(new Song("Working in a Coal Mine", 2));
        albums.add(album);

        playlist.add(albums, "867-5309");
        playlist.add(albums, "Hot Legs");
        playlist.add(albums, "Papers Please!");
        playlist.add(albums, "Reagan");
        playlist.add(albums, "Working in a Coal Mine");

        System.out.println("➡➡➡➡➡ Now playing " + playlist.nowPlaying());
        Scanner scanner = new Scanner(System.in);
        Integer choice;

        do {
            printMenu();
            System.out.print("Type selection and press Enter: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    playlist.playNext();
                    break;
                case 2:
                    playlist.playPrevious();
                    break;
                case 3:
                    playlist.replayCurrent();
                    break;
                case 4:
                    playlist.removeCurrent();
                    break;
                case 5:
                    playlist.display();
                    break;
                default:
                    break;
            }
        } while ((choice != 0));
    }

    private static void printMenu() {
        System.out.println("\nAvailable Actions\n" +
                "1) Play next song\n" +
                "2) Play previous song\n" +
                "3) Replay current song\n" +
                "4) Remove current song\n" +
                "5) Display playlist\n" +
                "0) Exit");
    }
}