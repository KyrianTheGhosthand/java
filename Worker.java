package test.tech.javacore;

import java.util.List;

public class Worker extends Employee{
    public Worker(List<Person> person) {
        super(person);
    }
    private int level;
    public int getLevel(int level){
        return level;
    }
    public void setLevel(){
        this.level = level;
    }
}
