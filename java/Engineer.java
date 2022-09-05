import java.util.*;

public class Engineer extends Employee{
    private String degree;
    public Engineer(){}

    public Engineer(String name, int age, String gender, String address) {
        super(name, age, gender, address);
        this.degree = degree;
    }
    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }
    @Override
    public String printInfo(){
        return super.printInfo() + " - " + degree;
    }
}
