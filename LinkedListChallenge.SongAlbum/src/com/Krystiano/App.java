package com.Krystiano;

import java.util.LinkedList;
import java.util.Scanner;

public class App {
    private LinkedList<Song> playlist = new LinkedList<>();
    private LinkedList<Album> albums = new LinkedList<>();
    private Duration totalDuration;
    private Scanner scanner = new Scanner(System.in);

    public App() {
    }

    private void printOption() {
        System.out.println("\nChoose action: ");
        System.out.println("0. Quit");
        System.out.println("1. Add song to playlist");
        System.out.println("2. Remove song from playlist");
        System.out.println("3. Clear playlist");
        System.out.println("4. Playlist options");
    }

    private int chooseOption() {
        return scanner.nextInt();
    }

    public void start() {
        boolean quit = false;
        while (!quit) {
            printOption();
            switch (chooseOption()) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    addSongToPlaylist();
                    break;
                case 2:
                    removeSongFromPlaylist();
                    break;
                case 3:
                    clearPlaylist();
                    break;
                case 4:
                    playlistOptions();
                    break;
                default:
                    System.out.println("An error occurred");
                    break;
            }
        }
    }

    public void addAlbum(Album album){
        this.albums.add(album);
    }

    private void addSongToPlaylist() {
        System.out.println("Choose album: ");
        Album choosenAlbum=this.chooseAlbums();
        Song choosenSong = chooseSong(choosenAlbum);
        playlist.add(choosenSong);
        System.out.println("Song: " + choosenSong.getTitle() + " added to playlist");
    }

    private void removeSongFromPlaylist() {
    }

    private void clearPlaylist() {
    }

    private void playlistOptions() {
        if (playlist!=null){
            playlistAction();
        } else{
            System.out.println("\nYou have no playlist, moron!\n");
        }
    }

    private void playlistAction() {
        System.out.println("\nChoose playlist action: ");
        System.out.println("0. Back");
        System.out.println("1. Play current song");
        System.out.println("2. Replay current song");
        System.out.println("3. Next song");
        System.out.println("4. Previous song");
    }

    private Album chooseAlbums(){
        if (this.albums==null){
            System.out.println("No albums here");
            return null;
        } else {
            int i = 0; //counter
            for (Album a : this.albums) {
                System.out.println("Album nr " + (i+1) + ": " + a.getAlbumName());
                i++;
            }

            System.out.println("Your choose of album: ");
            int albumNumber=scanner.nextInt();
            Album choosenAlbum = albums.get(albumNumber-1);
            return choosenAlbum;
        }

    }

    private Song chooseSong(Album album){
        System.out.println("Which song do you choose?");
        album.printAlbum();
        System.out.println("Your choose of song: ");
        int i = scanner.nextInt();
        Song chosenSong = album.getAlbumList().get(i-1);
        System.out.println("Song chosen successfully!");
        return chosenSong;
    }
}
