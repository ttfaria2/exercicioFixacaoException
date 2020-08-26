package application;

import entities.Account;
import exceptions.AccountException;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter acc data");
            System.out.print("Number: ");
            int number = sc.nextInt();
            System.out.print("Holder:");
            String holder = sc.nextLine();
            sc.nextLine();
            System.out.print("Initial Balance: ");
            double initialBalance = sc.nextDouble();
            System.out.print("Withdraw Limit: ");
            double withdrawLimit = sc.nextDouble();

            Account acc = new Account(number, holder, initialBalance, withdrawLimit);

            System.out.println("Enter amount for withdraw: ");
            double amount = sc.nextDouble();
            acc.withdraw(amount);

            System.out.println("New balance: " + acc.getBalance());

            sc.close();
        }

        catch (AccountException e) {
            System.out.println("Withdraw error: " + e.getMessage());
        }
    }


}
