package com.Krystiano;

public class Main {

    public static void main(String[] args) {
        Car.carAmount=0;
        Car porsche = new Car();
        Car holden = new Car();
        porsche.setDoors(4);
        holden.setDoors(1);
        Car[] a = new Car[4];
        for(int i=0; i<4; i++) a[i] = new Car();
        System.out.println(Car.carAmount);
        System.out.println(porsche.getDoorsNumber());

    }
}
