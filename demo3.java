package test.tech.javacore;

import java.util.*;

public class demo3 {
    static Scanner input = new Scanner(System.in);

    public String repeat(String rpt) {
        int charcount = rpt.length();
        String output = "";
        for (int i = 0; i < charcount; i++) {
            output += rpt.substring(i, i + 1) + rpt.substring(i, i + 1);
        }
        return output;
    }
    public static void removerepeat(String rrpt){
        int charcount = rrpt.length();
        String output = "";
        for (int i = 0; i < charcount; i++){
                char charindicator = rrpt.charAt(i);
                if(output.indexOf(charindicator) < 0){
                    output += charindicator;
            }
        }
        System.out.println(output);
    }
    public static void oneocc(String mc) {
        int charcount = mc.length();
        int one, i;
        int[] count = new int[mc.length()];
        char oneChar = mc.charAt(0);
        char string[] = mc.toCharArray();
        for (i = 0; i < charcount; i++) {
            count[i] = 1;
            for (int j = i + 1; j < charcount; j++) {
                if (string[i] == string[j] && string[i] != '0') {
                    count[i]++;
                    string[j] = '0';
                }
            }
        }
        one = count[0];
        for (i = 0; i < charcount; i++) {
            if (one == count[i]) {
                one = count[i];
                oneChar = string[i];
            }
        }
        System.out.println("Once occurred character: " + oneChar);
    }
    public static void max(String mc) {
        int charcount = mc.length();
        int max, i;
        int[] count = new int[mc.length()];
        char maxChar = mc.charAt(0);
        char string[] = mc.toCharArray();
        for (i = 0; i < charcount; i++) {
            count[i] = 1;
            for (int j = i + 1; j < charcount; j++) {
                if (string[i] == string[j] && string[i] != '0') {
                    count[i]++;
                    string[j] = '0';
                }
            }
        }
        max = count[0];
        for (i = 0; i < charcount; i++) {
            if (max < count[i]) {
                max = count[i];
                maxChar = string[i];
            }
        }
        System.out.println("Max occurred character: " + maxChar);
    }

    static void reverse(char str[], int start, int end) {
        char temp;
        while (start <= end)
        {
            temp = str[start];
            str[start] = str[end];
            str[end] = temp;
            start++;
            end--;
        }
    }
    static char[] reverseWords(char[] s) {
        int start = 0;
        for (int end = 0; end < s.length; end++) {
            if (s[end] == ' ') {
                reverse(s, start, end);
                start = end + 1;
            }
        }
        reverse(s, start, s.length - 1);
        reverse(s, 0, s.length - 1);
        return s;
    }

    public static void main(String[] args) {
        demo3 one = new demo3();
        System.out.println("Part 1: Insert input:");
        String in = input.nextLine();
        System.out.println("String input: " + in);
        System.out.println("String output: " + one.repeat(in));
//        Part 2
        System.out.println("Part 2: Insert input:");
        String two = input.next();
        System.out.println("Input string: " +two);
        System.out.println("Output string: ");
        removerepeat(two);
//        Part 3
//        System.out.println("Part 3: Insert input: ");
//        String three = input.next();
//        System.out.println("Input string: " +three);
//        oneocc(three);
//        Part 4
        System.out.println("Part 4: Insert input: ");
        String four = input.next();
        System.out.println("Input string: " +four);
        max(four);
//        Part 5
        System.out.println("Part 5: Insert input: ");
        String five = input.next();
        System.out.println("Input string: " +five);
        char []fv = reverseWords(five.toCharArray());
        System.out.print(fv);
    }
}
