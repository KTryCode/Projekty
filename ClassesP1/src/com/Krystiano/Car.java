package com.Krystiano;

public class Car {
    public Car(){
        System.out.println("\nNew Car created\n");
        carAmount++;
    }
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;
    static int carAmount;

    public void setDoors(int numberOfDoors){
        this.doors = numberOfDoors;
        System.out.println("Number of doors was set to: " + numberOfDoors);
    }

    public int getDoorsNumber(){
        return this.doors;
    }
}
