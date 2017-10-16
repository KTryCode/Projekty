package com.Krystiano;

public class BankAccount {
    static int numberOfAccounts;
    private int accountNumber;
    private double balance;
    private String name;
    private int phoneNmber;

    public BankAccount(String name, double cash){
        this.name=name;
        setBalance(cash);
        numberOfAccounts++;
        this.accountNumber=numberOfAccounts;
        System.out.println("Account on name: " + this.name + " created.\nBalance: " + String.format("%.0f",(this.balance)) + "$" +
                "\nAccount number: " + this.accountNumber);
    }

    public BankAccount(int accountNumber, double balance, String name, int phoneNmber){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.name = name;
        this.phoneNmber = phoneNmber;
        System.out.println("Account on name: " + this.name + " created.\nBalance: " + String.format("%.0f",(this.balance)) + "$" +
                "\nAccount number: " + this.accountNumber);
    }

    public BankAccount(double balance){
        this(32,balance,"Dd",211211211);
    }

    public void setBalance(double cash){
        if (cash > 0){
            this.balance=cash;
            System.out.println("Balance set to: " + cash);
        } else {
            System.out.println("Pojebalo?");
        }

    }

    public void deposit(double cash){
        if (cash > 0){
            this.balance+=cash;
        } else {
            System.out.println("You can not deposit negative amount of money");
        }
    }

    public void withdraw(double cash){
        if ((cash > 0) && (cash <= this.balance) ){
            this.balance-=cash;
            System.out.println(cash + "$ withdrawed.\n" + this.balance + "$ left");
        } else {
            System.out.println("Withdrawal aborted");
        }
    }

    public void getBalance(){
        System.out.println("Balance of account number " + this.accountNumber + " is: " + this.balance);
    }

}
