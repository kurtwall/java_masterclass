package com.kurtwall;

import java.util.ArrayList;
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

        playlist.add("867-5309");
        playlist.add("Sound of Silence");
        playlist.add("Hot Legs");
        playlist.add("Papers Please!");
        playlist.add("Reagan");
        playlist.add("Working in a Coal Mine");

        printMenu();
        System.out.print("Type selection and press Enter: ");
        Scanner scanner = new Scanner(System.in);
        Integer choice = scanner.nextInt();
        scanner.nextLine();

        while (choice != 0) {
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
                "4) Remove current song\n" +
                "5) Display playlist\n" +
                "0) Exit");
    }
}