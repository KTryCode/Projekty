package com.Krystiano;

public abstract class Main {

    static void poundsToKilograms(double pounds){
        double convCoef = 0.45359237; //1 pound is equal to 0.45...kg
        double numberOfKilograms = pounds * convCoef ;
        System.out.println("My number of kilos: " + numberOfKilograms);

    }
    //int =32 (4bytes), float =32  (4bytes), double = 64 (8bytes)
    public static void main(String[] args) {
        int myInt = 5;
        float newFloat = 5f;
        double newDouble = 5d;

        System.out.println(myInt + " " + newFloat + " " + newDouble);

    //Dividing

    myInt= myInt/7;
    newFloat/=7;
    newDouble/=7;

        System.out.println(myInt + " " + newFloat + " " + newDouble);


        double numberOfPounds = 200d;
        System.out.println("\n\nMy number of pounds: " + numberOfPounds);
        poundsToKilograms(numberOfPounds);

}

}