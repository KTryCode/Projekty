package com.Krystiano;

public class Main {

    public static void main(String[] args) {
        Car.train();

        Porsche porsche = new Porsche("model1", 1_000_000);
        porsche.move();
    }


}
