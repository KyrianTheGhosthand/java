import java.util.*;
public class hashmap {
    public static void main(String[] args) {
        Part3();
    }
    static void Part1(){
        HashMap<Integer,String> hash_map1= new HashMap<Integer,String>();
        hash_map1.put(1, "Red");
        hash_map1.put(2, "Green");
        hash_map1.put(3, "Black");
        hash_map1.put(4, "White");
        hash_map1.put(5, "Blue");
        for(Map.Entry i: hash_map1.entrySet()){
            System.out.println(i.getValue());
        }
    }
    static void Part2(){
        HashMap<Integer,String> hash_map1= new HashMap<Integer,String>();
        hash_map1.put(1, "Red");
        hash_map1.put(2, "Green");
        hash_map1.put(3, "Black");
        hash_map1.put(4, "White");
        hash_map1.put(5, "Blue");
        System.out.println("Hash map size: " +hash_map1.size());
    }
    static void Part3(){
        HashMap<Integer,String> hash_map1= new HashMap<Integer,String>();
        hash_map1.put(1, "Red");
        hash_map1.put(2, "Green");
        hash_map1.put(3, "Black");
        hash_map1.put(4, "White");
        hash_map1.put(5, "Blue");
        System.out.println("Old Hash Map: " +hash_map1);
        HashMap<Integer,String> hm2 = new HashMap<Integer,String>();
        hm2.putAll(hash_map1);
        System.out.println("New Hash Map: " +hm2);
    }
    static void Part4(){
        HashMap<Integer,String> hash_map1= new HashMap<Integer,String>();
        hash_map1.put(1, "Red");
        hash_map1.put(2, "Green");
        hash_map1.put(3, "Black");
        hash_map1.put(4, "White");
        hash_map1.put(5, "Blue");
        System.out.println("Old Hash Map: " +hash_map1);
        hash_map1.clear();
        System.out.println("New Map: " +hash_map1);
    }
    static void Part5(){
        HashMap<Integer,String> hash_map1= new HashMap<Integer,String>();
        hash_map1.put(1, "Red");
        hash_map1.put(2, "Green");
        hash_map1.put(3, "Black");
        hash_map1.put(4, "White");
        hash_map1.put(5, "Blue");
        System.out.println("Old Hash Map: " +hash_map1);
        boolean result = hash_map1.isEmpty();
        System.out.println("Hash Map Empty check: " +result);
        hash_map1.clear();
        result = hash_map1.isEmpty();
        System.out.println("Hash Map Updated empty check: " +result);
    }
    static void Part6(){
        HashMap<Integer,String> hash_map1= new HashMap<Integer,String>();
        hash_map1.put(1, "Red");
        hash_map1.put(2, "Green");
        hash_map1.put(3, "Black");
        hash_map1.put(4, "White");
        hash_map1.put(5, "Blue");
        System.out.println("Old Hash Map: " +hash_map1);
        HashMap<Integer, String> hm2 = new HashMap<Integer,String>();
        hm2 = (HashMap)hash_map1.clone();
        System.out.println("Shallow cloned: " +hm2);
    }
    static void Part7(){
        HashMap<Integer,String> hash_map1= new HashMap<Integer,String>();
        hash_map1.put(1, "Red");
        hash_map1.put(2, "Green");
        hash_map1.put(3, "Black");
        hash_map1.put(4, "White");
        hash_map1.put(5, "Blue");
        System.out.println("Old Hash Map: " +hash_map1);
        System.out.println("Check if hash map contains black: ");
        if(hash_map1.containsKey("Black")){
            System.out.println("Yes @ " +hash_map1.get("Black"));
        }else{
            System.out.println("Nope");
        }
        System.out.println("Check if hash map contains yellow: ");
        if(hash_map1.containsKey("Yellow")){
            System.out.println("Yes @ " +hash_map1.get("Yellow"));
        } else {
            System.out.println("Nope");
        }
    }
    static void Part8(){
        HashMap<Integer,String> hash_map1= new HashMap<Integer,String>();
        hash_map1.put(1, "Red");
        hash_map1.put(2, "Green");
        hash_map1.put(3, "Black");
        hash_map1.put(4, "White");
        hash_map1.put(5, "Blue");
        System.out.println("Old Hash Map: " +hash_map1);
        Set set = hash_map1.entrySet();
        System.out.println("Set values: "+set);
    }
    static void Part9(){
        HashMap<Integer, String> hash_map1 = new HashMap<Integer, String>();
        hash_map1.put(1, "Red");
        hash_map1.put(2, "Green");
        hash_map1.put(3, "Black");
        hash_map1.put(4, "White");
        hash_map1.put(5, "Blue");
        System.out.println("Old Hash Map: " + hash_map1);
        String val = (String)hash_map1.get(4);
        System.out.println("Value of key 4 is: " +val);
    }
    static void Part10(){
        HashMap<Integer, String> hash_map1 = new HashMap<Integer, String>();
        hash_map1.put(1, "Red");
        hash_map1.put(2, "Green");
        hash_map1.put(3, "Black");
        hash_map1.put(4, "White");
        hash_map1.put(5, "Blue");
        System.out.println("Old Hash Map: " + hash_map1);
        Set key = hash_map1.keySet();
        System.out.println("Key set are: " + key);
    }
    static void Part11(){
        HashMap<Integer, String> hash_map1 = new HashMap<Integer, String>();
        hash_map1.put(1, "Red");
        hash_map1.put(2, "Green");
        hash_map1.put(3, "Black");
        hash_map1.put(4, "White");
        hash_map1.put(5, "Blue");
        System.out.println("Old Hash Map: " + hash_map1);
        System.out.println("Collection views: "+hash_map1.values());
    }
}
