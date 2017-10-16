package com.Krystiano;

public class Vehicle {
    private int wheels;
    private String name;
    private String engine;
    private int capacity;



    public Vehicle(int wheels, String name, String engine, int capacity) {
        System.out.println("New vehicle created");
        this.wheels = wheels;
        this.name = name;
        this.engine = engine;
        this.capacity = capacity;
    }

    public Vehicle() {
        System.out.println("New vehicle created: default constructor");
    }

    public void move(){
        System.out.println("Vehicle.move() called");
    }


}
