import java.util.*;
public class exam2 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        Part4();
    }
    public static void Part1(){
        int sum = 0;
        int[] numbers = new int[]{1, 4, 17, 7, 25, 3, 100};
        int count = numbers.length;
        for(int i = 0; i < count; i++){
            sum += numbers[i];
        }
        double avg = sum/count;
        System.out.println("Average of the array: " +avg);
        for(int j = 0; j < count; j++){
            if(numbers[j] > avg){
                System.out.println("The numbers that is greater than avg: " +numbers[j]);
            }
        }
    }
    public static void Part2(){
        System.out.println("Insert the word: ");
        String check = input.nextLine();
        if(check.matches("^[aeiouAEIOU]*$")){
            System.out.println("The result was true");
        }
        else System.out.println("The result was false");
    }
    public static void Part3(){
        System.out.println("Insert the number line: ");
        String check = input.nextLine();
        int count = check.length();
        StringBuffer rev = new StringBuffer(String.valueOf(check));
        rev.reverse();
        long reverse = Long.parseLong(String.valueOf(rev));
        if(reverse % 10 != 0 || count != 10){
            System.out.println("This is not a VN phone number");
        }
        else System.out.println("This is a VN phone number");
    }
    public static void Part4(){
        int[] num1 = new int[]{1, -2, 5, -4, 3, -6};
        int[] num2 = new int[]{1, 2 ,5, 4, 3, 6};
        boolean check1 = true, check2 = true;
        System.out.println("Array 1 check: " );
        for (int i = 0; i < num1.length - 1; i++){
            if(num1[i] > 0 && num1[i+1] > 0 || num1[i] < 0 && num1[i+1] < 0){
                check1 = false;
                break;
            }
            else check1 = true;
        }
        System.out.println(check1);
        System.out.println("Array 2 check: " );
        for (int j = 0; j < num2.length - 1; j++){
            if(num2[j] > 0 && num2[j+1] > 0 || num2[j] < 0 && num2[j+1] < 0){
                check2 = false;
                break;}
            else check2 = true;
        }
        System.out.println(check2);
    }
}
