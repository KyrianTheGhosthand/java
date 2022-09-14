package part6;

public class Personal extends Officer{
    private String name;
    private String age;
    private String hometown;
    private String code;

    public Personal (int base, int bonus, int penalty, int actual, String name, String age, String hometown, String code) {
        super(base, bonus, penalty, actual);
        this.name = name;
        this.age = age;
        this.hometown = hometown;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Personal{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", hometown='" + hometown + '\'' +
                ", code='" + code + '\'' +
                ", actual salary='" + actual + '\'' +
                '}';
    }
}
