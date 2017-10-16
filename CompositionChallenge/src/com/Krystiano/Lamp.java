package com.Krystiano;

public class Lamp {
    private Bulb bulb;
    private String colour;
    private String model;


    public Lamp(Bulb bulb, String colour, String model) {
        System.out.println("Lamp created");
        this.bulb = bulb;
        this.colour = colour;
        this.model = model;
    }


    public void describeMe(){
        System.out.println("Lamp with bulb: " + bulb.getLumen() + bulb.getThread() + "\n");
    }

    public Bulb getBulb() {
        return bulb;
    }

    public String getColour() {
        return colour;
    }

    public String getModel() {
        return model;
    }

    public void turnOn(){
        System.out.println("Lamp.turnOn() called");
        bulb.turnOn();
    }
}
