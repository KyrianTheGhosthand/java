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
    }

    public String getName(String name){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getGender(String gender){
        return gender;
    }
    public void setGender(String gender){
        this.gender = gender;
    }

    public String getAddress(String address){
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }

    public int getAge(int age){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

    public String printInfo(){
        return name + " - " + age + " - " + gender + " - " + address;
    }
}
