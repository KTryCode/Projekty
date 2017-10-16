package com.Krystiano;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Album {
    private String albumName;
    private ArrayList<Song> albumList= new ArrayList<>();
    private Duration totalDuration = new Duration(0,0);

    public Album(String albumName, ArrayList<Song> albumList, Duration totalDuration) {
        this.albumName = albumName;
        this.albumList = albumList;
        this.totalDuration = totalDuration;
    }

    public Album(){
    }

    public Album(String albumName) {
        this.albumName = albumName;
    }

    public String getAlbumName() {
        return albumName;
    }

    public ArrayList<Song> getAlbumList() {
        return albumList;
    }

    public void addSong(Song song){
        albumList.add(song);
        totalDuration.extendDuration(song.getDuration());
    }

    public void printAlbum(){
        if (albumList.size()==0){
            System.out.println("\nNo songs in album " + this.albumName);
        } else {
            System.out.println("\nAlbum " + "\"" + this.albumName +"\"" + " list of songs:\n");
            int i=0;
            for(Song song : albumList){
                System.out.println("Song number " + (i+1) + ":");
                i++;
                song.printSong();
            }
        }
        System.out.println("Total duration time: " + totalDuration.printDuration());
        System.out.println("-------------------------------");
    }
}
