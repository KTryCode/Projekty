package com.Krystiano;

public class MobilePhone implements ITelephone {
    private int myNumber;
    private boolean isRinging;

    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("No action taken, no power button");
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("Now ringing " + phoneNumber + " on deskphone");
    }

    @Override
    public void answer() {
        if(isRinging){
            System.out.println("Answering");
            isRinging=false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber==myNumber){
            isRinging = true;
            System.out.println("Ring ring");
        } else {
            isRinging=false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {

        return isRinging;
    }
}