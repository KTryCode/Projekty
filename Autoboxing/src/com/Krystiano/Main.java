package com.Krystiano;

import java.util.ArrayList;

class IntClass{
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}

public class Main {

    public static void main(String[] args) {

        String[] strArray = new String[10];

        ArrayList<String> strArrayList = new ArrayList<String>();
        strArrayList.add("Krystian");

        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
        intClassArrayList.add(new IntClass(20));

        Integer integer = new Integer(1);
        Double doubleValue = new Double(12.2);

        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        for(int i =0;i<10;i++){
            intArrayList.add(Integer.valueOf(i));
        }
        for(int i =0;i<10;i++){
            System.out.println(i +" ---> " + intArrayList.get(i).intValue());
        }

    }
}
