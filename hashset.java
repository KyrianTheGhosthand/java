import java.util.*;
public class hashset {
    public static void main(String[] args) {
        Part10();
    }
//    Print HS
    public static void Part1(){
        HashSet<String> hs1 = new HashSet<>();
        hs1.add("Red");
        hs1.add("White");
        hs1.add("Pink");
        hs1.add("Yellow");
        hs1.add("Black");
        hs1.add("Green");
        System.out.println("The Hash Set 1: " +hs1);
        HashSet<String> hs2 = new HashSet<>();
        hs2.add("Red");
        hs2.add("Pink");
        hs2.add("Green");
        System.out.println("Hash Set 2: " +hs2);
    }
//    HS Size
    public static void Part2(){
        HashSet<String> hs1 = new HashSet<>();
        hs1.add("Red");
        hs1.add("White");
        hs1.add("Pink");
        hs1.add("Yellow");
        hs1.add("Black");
        hs1.add("Green");
        System.out.println("The Hash Set 1: " +hs1);
        System.out.println("Size of Hash Set: " +hs1.size());
        HashSet<String> hs2 = new HashSet<>();
        hs2.add("Red");
        hs2.add("Pink");
        hs2.add("Green");
        System.out.println("Hash Set 2: " +hs2);
        System.out.println("Size of Hash Set: " +hs2.size());
    }
//    Delete HS
    public static void Part3(){
        HashSet<String> hs1 = new HashSet<>();
        hs1.add("Red");
        hs1.add("White");
        hs1.add("Pink");
        hs1.add("Yellow");
        hs1.add("Black");
        hs1.add("Green");
        System.out.println("The Hash Set 1: " +hs1);
        hs1.removeAll(hs1);
        System.out.println("New Hash Set: " +hs1);
        HashSet<String> hs2 = new HashSet<>();
        hs2.add("Red");
        hs2.add("Pink");
        hs2.add("Green");
        System.out.println("Hash Set 2: " +hs2);
        hs2.removeAll(hs2);
        System.out.println("New Hash Set: " +hs2);
    }
    public static void Part4(){
        HashSet<String> hs1 = new HashSet<>();
        hs1.add("Red");
        hs1.add("White");
        hs1.add("Pink");
        hs1.add("Yellow");
        hs1.add("Black");
        hs1.add("Green");
        System.out.println("The Hash Set 1: " +hs1);
        System.out.println("Is Hash Set Empty: " +hs1.isEmpty());
        hs1.removeAll(hs1);
        System.out.println("Is Hash Set Empty: " +hs1.isEmpty());
    }
    public static void Part5(){
        HashSet<String> hs1 = new HashSet<>();
        hs1.add("Red");
        hs1.add("White");
        hs1.add("Pink");
        hs1.add("Yellow");
        hs1.add("Black");
        hs1.add("Green");
        System.out.println("The Hash Set 1: " +hs1);
        HashSet<String> hs2 = new HashSet<String>();
        hs2 = (HashSet)hs1.clone();
        System.out.println("Duplicate Hash Set: " +hs2);
    }
//    HashSet to Array
    public static void Part6(){
        HashSet<String> hs1 = new HashSet<>();
        hs1.add("Red");
        hs1.add("White");
        hs1.add("Pink");
        hs1.add("Yellow");
        hs1.add("Black");
        hs1.add("Green");
        System.out.println("The Hash Set 1: " +hs1);
        String[] array = new String[hs1.size()];
        hs1.toArray(array);
        System.out.println("Array Element: ");
        for(String color: array){
            System.out.println(color);
        }
    }
//    HashSet to TreeSet
    public static void Part7(){
        HashSet<String> hs1 = new HashSet<>();
        hs1.add("Red");
        hs1.add("White");
        hs1.add("Pink");
        hs1.add("Yellow");
        hs1.add("Black");
        hs1.add("Green");
        System.out.println("The Hash Set 1: " +hs1);
        Set<String> treeset = new TreeSet<String>(hs1);
        System.out.println("TreeSet elements: ");
        for(String color: treeset){
            System.out.println(color);
        }
    }
    public static void Part8(){
        HashSet<String> hs1 = new HashSet<>();
        hs1.add("Red");
        hs1.add("White");
        hs1.add("Pink");
        hs1.add("Yellow");
        hs1.add("Black");
        hs1.add("Green");
        System.out.println("The Hash Set 1: " +hs1);
        ArrayList<String> Arlist = new ArrayList<String>(hs1);
        System.out.println("ArrayList elements: ");
        for(String color: Arlist){
            System.out.println(color);
        }
    }
    public static void Part9(){
        HashSet<String> hs1 = new HashSet<>();
        hs1.add("Red");
        hs1.add("White");
        hs1.add("Pink");
        hs1.add("Yellow");
        hs1.add("Black");
        hs1.add("Green");
        System.out.println("The Hash Set 1: " +hs1);
        HashSet<String> hs2 = new HashSet<>();
        hs2.add("Red");
        hs2.add("Pink");
        hs2.add("Green");
        System.out.println("Hash Set 2: " +hs2);
        for(String color: hs1){
            System.out.println(hs2.contains(color) ? "Si" : "No");
        }
    }
    public static void Part10(){
        HashSet<String> hs1 = new HashSet<>();
        hs1.add("Red");
        hs1.add("White");
        hs1.add("Pink");
        hs1.add("Yellow");
        hs1.add("Black");
        hs1.add("Green");
        System.out.println("The Hash Set 1: " +hs1);
        HashSet<String> hs2 = new HashSet<>();
        hs2.add("Red");
        hs2.add("Pink");
        hs2.add("Green");
        System.out.println("Hash Set 2: " +hs2);
        hs1.retainAll(hs2);
        System.out.println("Kept Colors: " +hs1);
    }
}