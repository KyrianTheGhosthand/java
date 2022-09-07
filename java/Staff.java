import java.util.Scanner;

public class Staff extends Employee {
    private String job;
    public Staff(){
        Scanner input = new Scanner(System.in);
        System.out.println("Insert Occupation: ");
        this.job = input.nextLine();
    }
    public Staff(String name, int age, String gender, String address) {

        super(name, age, gender, address);
    }
    public String getJob(){
        return job;
    }
    public void setJob(String job){
        this.job = job;
    }
    @Override
    public String printInfo(){
        return super.printInfo() + " - " + job;
    }
}
