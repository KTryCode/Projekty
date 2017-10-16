package com.Krystiano;

public class Porsche extends Car {

    private int price;

    public Porsche(String model, int price ) {
        super(model, "Lejszcz", "V8", 4);
        System.out.println("New porsche created");
    }


}
