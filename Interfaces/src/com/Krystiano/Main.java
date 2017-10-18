package com.Krystiano;

public class Main {

    public static void main(String[] args) {
        ITelephone krystianoPhone;

        krystianoPhone = new DeskPhone(123456);
        krystianoPhone.powerOn();
        krystianoPhone.callPhone(123456);
        krystianoPhone.answer();

    }
}
