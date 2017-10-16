package com.Krystiano;

public class Bulb {
    private int lumen;
    private int thread;

    public Bulb(int lumen, int thread) {
        System.out.println("Bulb created");
        this.lumen = lumen;
        this.thread = thread;
    }
    public void turnOn(){
        System.out.println("Utevo lux!\nBulb.turnOn() called.");
    }

    public int getLumen() {
        return lumen;
    }

    public int getThread() {
        return thread;
    }
}
