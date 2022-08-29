package test.tech.javacore;

import java.util.*;
public class demo4 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Part2();
    }

    public static void Part0(){
        System.out.println("Insert the count of numbers: ");
        int n = input.nextInt();
        int[] array = new int[n+4];
            System.out.println("Insert the numbers in the array: ");
           for(int i = 0; i < n; i++){
               array[i] = input.nextInt();
        }
        System.out.println("The numbers in the array: ");
        for(int i = 0; i < n; i++){
            System.out.println(array[i]);
        }
        System.out.println("Adjusted numbers in the array: ");
        for(int i = 0; i < n; i++){
            if(array[i] % 2 == 0){
                array[i] = array[i] + 1;
            }
            System.out.println(array[i]);
        }
    }

    public static void Part1(){
        int sum = 0;
        int[] numbers = new int[]{20, 30, 25, 35, -16, 60, -100};
        int count = numbers.length;
        for(int i = 0; i < count; i++){
            sum += numbers[i];
        }
        double avg = sum / count;
        System.out.println("Average of the given array: " +avg);
    }

    public static void Part2(){
        int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        my_array[3] = 5;
        int n = my_array.length;
        for(int i = 0; i < n; i++){
            System.out.println(my_array[i]);
        }
    }

    public static void Part3(){
        String[] array1 = new String[]{“Python”, “JAVA”, “PHP”, “C#”, “C++”,“SQL”};
        String[] array2 = {“MySQL”, “SQL”, “SQLite”, “Oracle”, “PostgreSQL”, “DB2”, “JAVA”};
    }
}
