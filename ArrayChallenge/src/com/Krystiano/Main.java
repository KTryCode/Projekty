package com.Krystiano;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arrayIntegers = getNumbers();
        getArray(arrayIntegers);
        java.util.Arrays.sort(arrayIntegers);
        getArray(arrayIntegers);

    }

    public static int[] getNumbers(){
        System.out.println("How many integers? \r");
        int numberOfIntegers=scanner.nextInt();
        int[] values = new int[numberOfIntegers];
        for(int i=0 ; i < values.length ; i++){
            System.out.println("Integer number " + (i+1) + " is: \r");
            values[i] = scanner.nextInt();
        }
        System.out.println("Integers were applied correctly");
        return values;
    }
    public static void getArray(int[] myArray){
        System.out.println("\nYour array is:");
        for ( int i=0 ; i < myArray.length ; i++){
            System.out.print(myArray[i] +  " ");
        }
    }
}
