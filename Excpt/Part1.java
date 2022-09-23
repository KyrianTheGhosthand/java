package Excpt;

import java.util.*;

public class Part1 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
//        Parta();
//        Partb();
        Part2();
    }
    public static void Parta(){
        boolean check = false;
        while(!check){
        try{
            int a,b;
            System.out.println("Enter first number: ");
            a = input.nextInt();
            System.out.println("Enter second number: ");
            b = input.nextInt();
            check = true;
        }catch(InputMismatchException e){
            System.out.println("Error: " + e.getMessage());
        }}
    }
    public static void Partb() {
        try {
            int a, b, c;
            System.out.println("Enter first number: ");
            a = input.nextInt();
            System.out.println("Enter second number: ");
            b = input.nextInt();
            c = a / b;
            System.out.println("Result: " + c);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    public static void Part2(){
        System.out.println("Input the amount of numbers in the array: ");
        int count = input.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            System.out.println("Insert number: ");
            int b = input.nextInt();
            if (b == 100) {
                for (int c : a) {
                    System.out.println(a);
                }
                throw new IllegalArgumentException("It is not the right number");
            } else {
                a.add(b);
            }
        }

    }
}
