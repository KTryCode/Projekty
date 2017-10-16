package com.Krystiano;
import java.lang.*;

public class Main {

    public static void main(String[] args) {
        int switchValue = 2;

        switch (switchValue) {
            case 1:
                System.out.println("Value was: " + switchValue);
                break;

            case 2:
            case 3:
                System.out.println("Value was: 2 or 3");
                break;
            default:
                System.out.println("Chuj wie");
                break;

        }

        char letter = 'A';

        switch (letter) {
            case 'A':
                System.out.println("The letter is A");
                break;
            case 'B':
                System.out.println("The letter is B");
                break;
            default:
                System.out.println("Chuj wie");
                break;
        }

        for(int i=1; i<=10000; i*=2){
            float b=restOfDivision(i,11);
            System.out.println(String.format("%.2f",b));
        }

    }

    public static int restOfDivision(int number, int divider){
        return number%divider;
    }

    public static boolean isPrime(int n){
        if (n==1){
            return false;
        }

        for (int i=2 ; i = n ; i++){
            if (n%i==0){
                return false;
            }
        }
    }
}