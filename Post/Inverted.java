package Post;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.google.gson.Gson;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Inverted {
    public static void main(String[] args) {
        Gson gson = new Gson();
        Data[] data = null;
        try{
            FileReader reader = new FileReader("employee.json");
            data = gson.fromJson(reader, Data[].class);
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
        for(Data d: data){
            System.out.println(data);
        }
    }
}
class Data{}
