package emailtest;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        Account account = new Account();
        ArrayList<Account> newAccount = new ArrayList<Account>();
        System.out.println("Account management program: 1 - Add account 2 - Display account 3 - Recharge Account 4 - Change account name Else - Exit");
        input.nextLine();
        int command = input.nextInt();
        switch (command) {
            case 1:
                System.out.println("New Account, insert account name: ");
                input.nextLine();
                String name = input.nextLine();
                System.out.println("Insert account number: ");
                input.nextLine();
                String number = input.nextLine();
                System.out.println("Insert account email name: ");
                input.nextLine();
                String email = input.nextLine();
                System.out.println("Insert account balance: ");
                input.nextLine();
                int balance = input.nextInt();
                new Account(name, number, email, balance);
                account.displayInfo();
            case 2:
                System.out.println("All Account: ");
                for(Account a: newAccount){
                    account.displayInfo();
                }
            case 3:
                System.out.println("Insert amount to be inserted: ");
                input.nextLine();
                double amount = input.nextDouble();
                account.recharge(amount);
            case 4:
                System.out.println("Insert email to be replaced: ");
                input.nextLine();
                String check = input.nextLine();
                account.changeEmail(check);
            default:
                System.out.println("Bye, have a beautiful time");
        }
    }
}
