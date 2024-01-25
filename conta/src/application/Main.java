package application;

import entities.account;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        System.out.print("Enter account holder: ");
        String name = sc.nextLine();
        System.out.print("Is there na initial deposit?");
        char option = sc.nextLine().charAt(0);

        if(option == 'y'){
            double amount = sc.nextDouble();
            account.deposit(amount);
        }

        account account = new account(number, name);

        sc.close();
    }
}