package com.Krystiano;

public class Main {

    public static void main(String[] args) {
	    BankAccount.numberOfAccounts=0;

        BankAccount acc1 = new BankAccount("Lejszcz", 1_000_000);
        BankAccount acc2 = new BankAccount("Maciej", 1_000);

        acc1.withdraw(2_000_000);
        acc1.getBalance();

        BankAccount acc3 = new BankAccount(300);


    }
}
