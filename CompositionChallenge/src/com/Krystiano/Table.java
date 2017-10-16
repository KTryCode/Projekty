package com.Krystiano;

public class Table {
    private Wood wood;
    private int legs;

    public Table(Wood wood, int legs) {
        System.out.println("Table constructed");
        this.wood = wood;
        this.legs = legs;
    }

    public Wood getWood() {
        return wood;
    }

    public int getLegs() {
        return legs;
    }

    public void putChairs(){
        System.out.println("Chairs ready!");
    }
}
