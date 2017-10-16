package com.Krystiano;

public class Main {

    static class Test {
        Test() {
            System.out.println("Powstaje ja, Test!");
        }

        public void przywitajSie() {
            System.out.println("Czesc, jestem Test!");
        }
    }

    public static void main(String[] args) {
        int result = 1 + 2;
        System.out.println(result);

        int previousResult = result;
        result = result - 1;
        System.out.println(result);

        Funkcyja.czesc();

        Test a = new Test();
        a.przywitajSie();


    }

}