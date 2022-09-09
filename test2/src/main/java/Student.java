import java.util.*;
public class Student {
    private String name;
    private int age;
    private String major;

    public Student(String name, int age, String major) {
        this.name = name;
        this.age = age;
        this.major = major;
    }
    public Student(){
        Scanner input = new Scanner(System.in);
        System.out.println("Insert name: ");
        this.name = input.nextLine();

        System.out.println("Insert age: ");
        this.age = input.nextInt();

        System.out.println("Insert year: ");
        this.major = input.nextLine();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
    public String printInfo() {return "Name: " + name + " Age: " +age+ " Major: " + major;}
}
