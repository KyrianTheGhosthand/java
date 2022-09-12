package part5;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Management management = new Management();
        System.out.println("Student Management Program: 1 - Add Student 2 - Display Student 3 - Count Student Other - Exit");
        int command = input.nextInt();
        switch(command){
            case 1:
                System.out.println("New Student - Insert Name: \n");
                String name = input.nextLine();
                System.out.print("Insert Age: \n");
                String age = input.nextLine();
                System.out.print("Insert Hometown: \n");
                String hometown = input.nextLine();
                Student student = new Student(name, age, hometown);
                management.addStudent(student);
                management.display();
            case 2:
                String agecheck = "20";
                management.displaybyage(agecheck);
            case 3:
                String agecheck3 = "23";
                String homecheck = "DN";
                management.count(agecheck3,homecheck);
            default:
                System.out.println("Bye");
        }
    }
}
