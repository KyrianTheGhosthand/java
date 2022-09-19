package emailtest;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        Account account = new Account();
        ArrayList<Account> newAccount = new ArrayList<Account>();
        System.out.println("Welcome choose option: 1 - Add account 2 - Login Else - exit");
        input.nextLine();
        int login = input.nextInt();
        switch (login) {
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
                System.out.println("Insert password: ");
                input.nextLine();
                String password = input.nextLine();
                System.out.println("Insert account balance: ");
                input.nextLine();
                int balance = input.nextInt();
                new Account(name, number, email, balance, password);
                System.out.println("Signed up success");
                account.displayInfo();
            case 2:
                System.out.println("Login, insert username: ");
                input.nextLine();
                String namecheck = input.nextLine();
                System.out.println("Insert password: ");
                input.nextLine();
                String passcheck = input.nextLine();
                account.check(namecheck,passcheck);
        System.out.println("Login success, account management program: 1 - Display account 2 - Recharge Account 3 - Change account name Else - Exit");
        input.nextLine();
        int command = input.nextInt();
        switch (command) {
            case 1:
                System.out.println("All Account: ");
                for(Account a: newAccount){
                    account.displayInfo();
                }
            case 2:
                System.out.println("Insert amount to be inserted: ");
                input.nextLine();
                double amount = input.nextDouble();
                account.recharge(amount);
            case 3:
                System.out.println("Insert email to be replaced: ");
                input.nextLine();
                String check = input.nextLine();
                account.changeEmail(check);
            default:
                System.out.println("Bye, have a beautiful time");
        }}
    }
}
