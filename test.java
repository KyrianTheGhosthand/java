package test.tech.javacore;

import java.net.SocketOption;
import java.util.Scanner;
import java.lang.Math;
import java.util.Random;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.LinkedList;

public class test {
    static {
        System.out.println("Hi guys");
    }

    static int globalVar;
    static Scanner input = new Scanner(System.in);
    static Random rng = new Random();
    static LinkedList<Integer> stack = new LinkedList<Integer>();

    public static void main(String[] args) {
//            Part 1b
        int i = 10;
        int n = ++i % 5;
        System.out.println("Part 1b results:");
        System.out.println(i);
        System.out.println(n);


//            Part 1a
        int e = 10;
        int g = i++ % 5;
        System.out.println("Part 1a results:");
        System.out.println(e);
        System.out.println(g);

//            Part 2
        double d = 9 / 5d;
        // If there is no d in the math the results will be printed as 1; if a letter d is added behind one of the number the result will be 1.8;
        System.out.println("Part 2 results:");
        System.out.println(d);

//            Part 3
        System.out.println("Part 3: Enter a Fahrenheit temperature:");

        double f = input.nextDouble();
        double c = (f - 32f) / 1.8f;
        System.out.printf("The Celsius temperature will be: %.2f\n", c);

//            Part 4

        int rd = rng.nextInt(1000);
        System.out.printf("Part 4: The number that was generated: %d\n", rd);
        int rds = 0;
        while (rd > 0) {
            int digit = rd % 10;
            rds = rds + digit;
            rd = rd / 10;
        }
        System.out.println("Sum of the Digits of the number generated: " + rds);

//            Part 5
        System.out.println("Part 5: Insert the first number:");
        int one = input.nextInt();
        System.out.println("Insert the second number");
        int two = input.nextInt();
        boolean res;
        res = one == 10 || two == 10 || one + two == 10 || one - two == 10 || two - one == 10;
        System.out.println("The results of the algorithm is " + res);


//            Part 6
        System.out.println("Part 6: Insert your weight (kg):");
        double weight = input.nextDouble();
        System.out.println("Insert your height (m):");
        double height = input.nextDouble();
        double bmi = weight / Math.pow(height, 2);
        System.out.printf("Your BMI is: %.2f\n", bmi);


        //            Part 7
        long crt = System.currentTimeMillis();
        SimpleDateFormat sdf = new SimpleDateFormat("MMM dd,yyyy HH:mm");
        Date rdt = new Date(crt);
        System.out.println("Part 7: The current time is: ");
        System.out.println(sdf.format(rdt));

//            Part 8
        System.out.println("Part 8: Insert a 6-digit number:");
        int six = input.nextInt();
        while(six > 0){
            stack.push(six % 10);
            six = six / 10;
        }
        while (!stack.isEmpty()){
            System.out.println("Digits in the number: \n" +stack.pop());
        }

        //            Part 9
        System.out.println("Part 9: Insert a number:");
        float nine = input.nextFloat();
        System.out.println("Next number up for %d: \n");
        System.out.println(Math.nextUp(nine));
        System.out.println("Next number down  for %d: \n");
        System.out.println(Math.nextDown(nine));

//        Part 10
        System.out.println("Part 10: Insert a lower bound number:");
        int lb = input.nextInt();
        System.out.println("Insert a upper bound number:");
        int ub = input.nextInt();
        int tb = rng.nextInt(ub-lb) + lb;
        System.out.println("The random number generated: " +tb);

//        Part 11a
        System.out.println("Part 11a: Insert an amount of hours: ");
        long hours = input.nextLong();
        long hy = hours / (24 * 365);
        long hd = (hours / 24) % 365;
        System.out.println("There will be " +hd+ " days & "+hy+ " years");
//        11b
        System.out.println("Part 11b: Insert an amount of minutes: ");
        long mins = input.nextLong();
        long my = mins / (24 * 60 * 365);
        long md = (mins / 24 / 60) % 365;
        System.out.println("There will be " +md+ " days & "+my+ " years");
//        11c
        System.out.println("Part 11c: Insert an amount of seconds: ");
        long sec = input.nextLong();
        long sy = sec / (24 * 3600 * 365);
        long sd = (sec / 24 / 3600) % 365;
        System.out.println("There will be " +sd+ " days & "+sy+ " years");
    }
}