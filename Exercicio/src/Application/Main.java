package Application;

import Entities.Account;

import java.util.Locale;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        Locale.setDefault(Locale.US);
        Account account;

        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        System.out.print("Enter account holder: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.print("Is there any initial deposit (y/n)? ");
        char response = sc.next().charAt(0);

        if(response == 'y'){
            System.out.print("Enter inital deposit value: ");
            double initialDeposit = sc.nextDouble();
            account = new Account(number,holder,initialDeposit);
        }

        else {
            account = new Account(number, holder);
        }

        System.out.println();
        System.out.print(account);
        System.out.println();

        System.out.print("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        account.deposit(depositValue);
        System.out.print("Updated account data: ");
        System.out.print(account);
        sc.close();

        System.out.print("Enter a deposit value: ");
        double withdraw = sc.nextDouble();
        account.withdraw(withdraw);
        System.out.print("Updated account data: ");
        System.out.print(account);
        sc.close();
    }
}