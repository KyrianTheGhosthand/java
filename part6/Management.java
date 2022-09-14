package part6;
import java.util.*;
public class Management {
    private ArrayList<Personal> newPerson = new ArrayList<Personal>();
    public void addTeacher(Personal person){
        newPerson.add(person);
        person.toString();
    }
    public void display(){
        System.out.println(newPerson);
    }
    public boolean deleteTeacher(String code){
        for(Personal o: newPerson){
            if(o.getCode().matches(code))
            newPerson.remove(o);
        }
        return false;
    }
}
