package test.tech.javacore;
import java.nio.file.LinkPermission;
import java.util.*;
import java.util.regex.*;

public class regexdemo2 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Insert string: ");
        String test = input.nextLine();
        System.out.println(Regex5(test));
    }

    public static String Regex2(String test) {
        if (test.matches("p.*?q$"))
            return "Match";
        else
            return "Not match";
    }
    public static String Regex3(String test){
        if(test.matches("^[a-z]+_[a-z]+$"))
            return "Match";
        else return "Not Match";
    }
    public static String Regex4(String test){
        if(test.matches("[a-zA-z0-9_]*$"))
            return "Match";
        else return "Not Match";
    }
    public static String Regex5(String test){
        if(test.matches("^5.*$"))
            return "Match";
        else return "Not Match";
    }
}
