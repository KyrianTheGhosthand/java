public class Worker extends Employee{
    private int level;
    public Worker(){

    }
    public Worker(String name, int age, String gender, String address) {
        super(name, age, gender, address);
        this.level = level;
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
