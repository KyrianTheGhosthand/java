import java.util.Scanner;

public class Worker extends Employee{
    private int level;
    public Worker(){
        Scanner input = new Scanner(System.in);
        System.out.println("Insert level: ");
        this.level = input.nextInt();
    }
    public Worker(String name, int age, String gender, String address) {
        super(name, age, gender, address);
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
    @Override
    public String printInfo(){
        return super.printInfo() + " - level: " + level;
    }
}
