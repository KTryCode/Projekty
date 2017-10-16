package com.Krystiano;

public class Main {

    public static void main(String[] args) {
	    int[] myIntArray={1,2,3,4,5,6,7,8,9,10};

	    // or int[] myVariable = new intp[
        double[] myDoubleArray = new double[100];
        for (int i=0;i<myDoubleArray.length;i++){
            myDoubleArray[i] = Math.acos(i*i+10);
        }
        printArray(myDoubleArray);

    }

    public static void printArray(double[] array){
        for(int i=0;i<array.length;i++) {
            System.out.println(array[i]);
        }
    }
}
