package part5;
import java.util.*;
public class Management {
    private ArrayList<Student> theStudent = new ArrayList<Student>();

    public void addStudent(Student student){
        theStudent.add(student);
        student.toString();
    }
    public boolean deleteStudent(Student student){
        return theStudent.remove(student);
    }
    public boolean deleteStudent(String age, String hometown){
        for(Student student: theStudent){
            if(student.getAge().equalsIgnoreCase(age) && student.getHometown().equalsIgnoreCase(hometown)) theStudent.remove(student);
        }
        return false;
    }
    public void display(){
        System.out.println(theStudent);
    }
    public String displaybyage(String age){
        for(Student s: theStudent ){
            if(age.matches(s.getAge()))
                return theStudent.toString();
        }
        return "Not found";
    }
    public int count(String age, String hometown){
        int count = 0;
        for(Student s : theStudent){
            if(age.matches(s.getAge()) && hometown.matches(s.getHometown())){
                count++;
            }
        }
        return count;
    }
}
