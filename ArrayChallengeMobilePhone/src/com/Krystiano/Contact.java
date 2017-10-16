package com.Krystiano;

import java.util.Scanner;

public class Contact {
    private String name;
    private int number;
    private Scanner scanner = new Scanner(System.in);

    public Contact(String name, int number) {
        this.name = name;
        this.number = number;
        System.out.println("New contact: " + name+ " " + number);
    }

    public void modifyContact(){
        setName();
        setNumber();
    }

    public String getName() {
        return name;
    }

    private void setName(){
        System.out.println("Type new name: ");
        String newName = scanner.nextLine();
        setName(newName);
    }

    private void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    private void setNumber(){
        System.out.println("Type new number: ");
        int newNumber = scanner.nextInt();
        setNumber(newNumber);
    }

    private void setNumber(int number) {
        this.number = number;
    }

    public Contact getContact(){
        return this;
    }

    public String printContact(){
        return(getName() + " " + getNumber());
    }
}
