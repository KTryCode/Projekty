package com.Krystiano;

public class Car extends Vehicle {
    private String model;
    private String owner;

    public Car(String model, String owner, String engine, int capacity) {
        super(4, "Car", engine, capacity);
        System.out.println("New car created");
        this.model=model;
        this.owner=owner;
    }

    public static void train(){
        System.out.println("I like trains");
    }
}
