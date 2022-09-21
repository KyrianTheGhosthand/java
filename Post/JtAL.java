package Post;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;

public class JtAL {
    public static void main(String[] args) {
        String jsonCarStr =
“[{ “color” : “White”, “type” : “Vinfast” }, { “color” : “Blue”, “type” : “Toyota” }]”;
        ArrayList<Car> car = new ArrayList<>();
        Gson gson = new Gson();
        Type userListType = new TypeToken<ArrayList<User>>(){}.getType();
        for(Car c: car){
            System.out.println(car);
        }
    }
}
