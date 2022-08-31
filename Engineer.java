package test.tech.javacore;

import java.util.List;

public class Engineer extends Employee{
    private String major;
    public Engineer(List<Person> person) {
        super(person);
    }
    public String getMajor(String major){
        return major;
    }
    public void setMajor(){
        this.major = major;
    }
}
