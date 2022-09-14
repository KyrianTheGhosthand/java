package part6;

import part6.Management;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Management management = new Management();
        Officer officer = new Officer();
        System.out.println("Teacher Management Program: 1 - Add Teacher 2 - Delete Teacher - Exit");
        int command = input.nextInt();
        switch(command){
            case 1:
                System.out.println("New Teacher - Insert name: ");
                input.nextLine();
                String name = input.nextLine();
                System.out.println("Insert age: ");
                input.nextLine();
                String age = input.nextLine();
                System.out.println("Insert hometown: ");
                input.nextLine();
                String home = input.nextLine();
                System.out.println("Insert code: ");
                input.nextLine();
                String code = input.nextLine();
                System.out.println("Insert base salary: ");
                input.nextLine();
                int base = input.nextInt();
                System.out.println("Insert bonus salary: ");
                input.nextLine();
                int bonus = input.nextInt();
                System.out.println("Insert salary deductions: ");
                input.nextLine();
                int penalty = input.nextInt();
                int actual = officer.getActual(base,bonus,penalty);
                Personal person = new Personal(base, bonus, penalty, actual, name, age, home, code );
                management.display();
            case 2:
                System.out.println("Insert deleted code: ");
                input.nextLine();
                String check = input.nextLine();
                management.deleteTeacher(check);
            default:
                System.out.println("Bye");
        }
    }
}
