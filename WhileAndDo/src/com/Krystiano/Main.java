package com.Krystiano;

public class Main {

    public static void main(String[] args) {
        int count=1;
        while(count<=10){
            System.out.println("costam po raz: " + count);
            count++;
        }

        int startNumber = 10;
        int finishNumber = 1200;
        int counter =0;

        while (startNumber<=finishNumber){

            if (isEven(startNumber)){
                counter++;
                //System.out.println("New even number: " + startNumber);
                startNumber++;
            } else {
                startNumber++;
            }
        }

        System.out.println("Total number of even numbers: " + counter);
    }

    public static boolean isEven(int number){
        if(number%2 ==0){
            System.out.println("It is even number: " + number);
            return true;
        } else {
            System.out.println("It is not even number");
            return false;
        }
    }



}
