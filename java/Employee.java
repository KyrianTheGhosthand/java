import java.util.*;
public class Employee {
    private String name;
    private int age;
    private String gender;
    private String address;

    public Employee(String name, int age, String gender, String address){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
    }

    public Employee() {
        Scanner input = new Scanner(System.in);
        System.out.println("Insert name: ");
        this.name = input.nextLine();

        System.out.println("Insert age: ");
        this.age = input.nextInt();

        System.out.println("Insert gender: ");
        this.gender = input.next();
        
        System.out.println("Insert address: ");
        this.address = input.next();
    }

//    public String getName(String name){
//        return name;
//    }
//    public void setName(String name){
//        this.name = name;
//    }
//
//    public String getGender(String gender){
//        return gender;
//    }
//    public void setGender(String gender){
//        this.gender = gender;
//    }
//
//    public String getAddress(String address){
//        return address;
//    }
//    public void setAddress(String address){
//        this.address = address;
//    }
//
//    public int getAge(int age){
//        return age;
//    }
//    public void setAge(int age){
//        this.age = age;
//    }

    public String printInfo(){
        return name + " - " + age + " - " + gender + " - " + address;
    }
}
