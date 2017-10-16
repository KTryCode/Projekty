package com.Krystiano;

public class Room {
    private Shelf shelf;
    private Table table;
    private Lamp lamp;

    public Room(Shelf shelf, Table table, Lamp lamp) {
        System.out.println("\nRoom constructed\n");
        this.shelf = shelf;
        this.table = table;
        this.lamp = lamp;
    }

    public void lightOn() {
        System.out.println("Room.lightOn() called");
        getLamp().turnOn();
    }

    public Shelf getShelf() {
        return shelf;
    }

    public Table getTable() {
        return table;
    }

    public Lamp getLamp() {
        return lamp;
    }
}
