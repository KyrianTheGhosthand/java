package test.tech.javacore;

import java.net.SocketOption;
import java.util.*;
import java.lang.Math;
import java.text.SimpleDateFormat;


public class demo2 {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
//        FizzBuzz
//        for (int i = 1; i < 101; i++) {
//            if (i % 15 == 0) {
//                System.out.println("FizzBuzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println("The number is " + i);
//            }
//        }
//        Insert a number
//        System.out.println("Insert a number: ");
//        int sum = 0;
//        int n = input.nextInt();
//        for (int i = 0; i < n; i++) {
//            if (i % 2 == 0) {
//                sum += i;
//            }
//        }
//        System.out.println("The sum of all the even number is " + sum);
        //Prime Number
//        System.out.println("Insert a number: ");
//        int pr = input.nextInt();
//        if (pr == 0 || pr == 1) {
//            do {
//                System.out.println("Try agane,insert a number (0 & 1 is not a prime number): ");
//                pr = input.nextInt();
//            } while (pr == 0 || pr == 1);
//        }
//        for (int i = 2; i <= pr; i++) {
//            int chk = 0;
//            for (int j = 2; j < i; j++) {
//                if (i % j == 0) {
//                    chk++;
//                    break;
//                }
//            }
//            if (chk == 0) {
//                System.out.println(i);
//            }
//        }
//        Num Triangle (Part 1)
//        System.out.println("Insert a number: ");
//        int m = input.nextInt();
//        for (int i = 1; i <= m; i++) {
//            int j = 1;
//            while (j <= i) {
//                System.out.print(j + "");
//                j++;
//            }
//            System.out.println();
//        }
//        Part 1 alt
//        System.out.println("Insert a number: ");
//        int m = input.nextInt();
//        for (int i = 1; i <= m; i++) {
//            for(int j = 1; j <= i; j++){
//                System.out.print(j+ "");
//            }
//            System.out.println();
//        }
        //        Num Triangle w/ Increments (Part 2 & 4)
//        System.out.println("Insert a number: ");
//        int r = input.nextInt();
//        int k = 1;
//        for (int i = 1; i <= r; i++) {
//            for (int j = 1; j <= i; j++) {
//
//                System.out.print(k + " ");
//                k++;
//            }
//
//            System.out.println();
//        }
        //        Num Triangle w/ Repeated digits (Part 3)
//        System.out.println("Insert a number: ");
//        int t = input.nextInt();
//
//        for (int i = 1; i <= t; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(i + " ");
//            }
//
//            System.out.println();
//        }
//            Diamond Star (Part 5)
//        System.out.println("Insert a number of star row: ");
//        int drow = input.nextInt();
//        for (int i = 1; i <= drow; i++) {
//            for (int j = drow; j > i; j--) {
//                System.out.print(" ");
//            }
//            for (int k = 0; k < i * 2 - 1; k++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for (int i = 1; i <= drow - 1; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.print(" ");
//            }
//            for (int k = (drow - i) * 2 - 1; k > 0; k--) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        Pascal Triangle (Part 6)
//        System.out.println("Insert a number of row: ");
//        int prow = input.nextInt();
//        int coeff = 1;
//        for (int i = 0; i < prow; i++) {
//            for (int space = 1; space < prow - i; ++space) {
//                System.out.print("  ");
//            }
//            for (int j = 0; j <= i; j++) {
//                if (j == 0 || i == 0)
//                    coeff = 1;
//                else
//                    coeff = coeff * (i - j + 1) / j;
//                System.out.printf("%4d", coeff);
//            }
//            System.out.println();
//        }
//        }
//            Inverted Right Triangle (Part 7)
//        System.out.println("Insert the number of lines: ");
//        int lines = input.nextInt();
//        for (int i = 1; i <= lines; i++){
//            for(int j = 0; j < i; j++){
//                System.out.print(" ");
//            }
//            for(int k = 0; k < lines - i; k++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        Right @ triangle (Part 8)
//        System.out.println("Insert the number of lines: ");
//        int line = input.nextInt();
//        for (int i = 1; i <= line; i++){
//            for(int j = 0; j < line - i; j++){
//                System.out.print(" ");
//            }
//            for(int k = 0; k < i; k++){
//                System.out.print("@");
//            }
//            System.out.println();
//        }
//        Number Diamond (Part 9a)
        System.out.println("Insert the number of diamond line: ");
        int nline = input.nextInt();
        for (int i = 1; i <= nline; i++) {
            int n = nline;
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k >= 1; k--) {
                System.out.print(k);
            }
            for (int l = nline -3; l <= i; l++) {
                System.out.print(l);
            }
            System.out.println();
        }
        for (int i = nline -1; i >= 1; i--) {
            int n = nline - 1;
            for (int j = 0; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k >= 1; k--) {
                System.out.print(k);
            }
            for (int l = nline - 3; l <= i; l++) {
                System.out.print(l);
            }
            System.out.println();
        }
////        for (int i = 1; i <= nline - 1; i++) {
//            System.out.print(" ");
//            int num = nline;
//            for (int j = 0; j < i; j++) {
//                System.out.print("  ");
//            }
//            for (int j = 0; j < nline - i; j++) {
//                System.out.print(num--+ " ");
//            }
//            num = num - 2;
//            for (int j = 0; j < nline - i - 1;j++){
//                System.out.print(num-- +" ");
//            }
//            System.out.println();
//        }
//        Alphabet Diamond (Part 9b)
//        System.out.println("Insert the number of diamond line: ");
//        int pline = input.nextInt();
//        int alpha = 64;
//        for (int i = 1; i <= pline; i++) {
//            System.out.print(" ");
//            int num = 1;
//            for (int j = 1; j <= pline - i; j++) {
//                System.out.print("  ");
//            }
//            for (int j = 1; j < i; j++) {
//                System.out.print((char)(alpha+num++)+ " ");
//            }
//            for (int j = 1; j <= i; j++) {
//                System.out.print((char)(alpha+num--)+ " ");
//            }
//            System.out.println();
//        }
//        for (int i = 1; i <= pline - 1; i++) {
//            System.out.print(" ");
//            int num = 1;
//            for (int j = 0; j < i; j++) {
//                System.out.print("  ");
//            }
//            for (int j = 0; j < pline - i; j++) {
//                System.out.print((char)(alpha+num++) + " ");
//            }
//            num = num - 2;
//            for (int j = 0; j < pline - i - 1;j++){
//                System.out.print((char)(alpha+num--) + " ");
//            }
//            System.out.println();
//        }
    }
}

