package com.Krystiano;

public class Song {
    private String title;
    private Duration duration;

    public Song(String title, Duration duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Duration getDuration() {
        return this.duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    public void printSong(){
        System.out.println("Title: " + getTitle() + "\nDuration: " + duration.printDuration());
        System.out.println();
    }
}
