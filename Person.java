package test.tech.javacore;

public class Person {
    private String firstname;
    private String lastname;
    private int age;
    private String gender;
    private String addy;

    private String fullname;

    public Person(String firstname, String lastname, int age, String gender, String addy) {
        this.firstname= firstname;
        this.lastname = lastname;
        this.age = age;
        this.gender = gender;
        this.addy = addy;
    }

    public String getName(String firstname, String lastname){
        fullname = firstname + lastname;
        return fullname;
    }

    public void setName(String firstname, String lastname){
        this.fullname = fullname;
    }
    public String getGender(String gender){
        return gender;
    }
    public void setGender(String gender){
        this.gender = gender;
    }

    public int getAge(int age){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getAddy(String addy){
        return addy;
    }
    public void setAddy(String addy){
        this.addy = addy;
    }
}



