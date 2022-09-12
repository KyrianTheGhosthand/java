import java.util.*;
public class Arraylistp {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        Part21();
    }
    public static void Part1(){
        List<String> colors = new ArrayList<String>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Orange");
        colors.add("Blue");
        colors.add("White");
        colors.add("Black");
        System.out.println(colors);
    }
//    Iteration
    public static void Part2(){
        List<String> colors = new ArrayList<String>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Orange");
        colors.add("Blue");
        colors.add("White");
        colors.add("Black");
        for(String s: colors){
            System.out.println(s);
        }
    }
//    Adding elements @ the beginning and the end
    public static void Part3(){
        List<String> colors = new ArrayList<String>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Orange");
        colors.add("Blue");
        colors.add("White");
        colors.add("Black");
        colors.add(0, "Teal");
        colors.add(colors.size(), "Cream" );
        System.out.println(colors);
    }
//    Finding index
    public static void Part4(){
        List<String> colors = new ArrayList<String>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Orange");
        colors.add("Blue");
        colors.add("White");
        colors.add("Black");
        System.out.println(colors);
        System.out.println("Insert index element needs to find: ");
        int index1 = input.nextInt();
        System.out.println("Insert second element need to be find: ");
        int index2 = input.nextInt();
        System.out.println("Element number " +index1+ " : " +colors.get(index1));
        System.out.println("Element number " +index2+ " : " +colors.get(index2));
    }
//    Replace element
    public static void Part5(){
        List<String> colors = new ArrayList<String>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Orange");
        colors.add("Blue");
        colors.add("White");
        colors.add("Black");
        System.out.println(colors);
        System.out.println("Insert index element needs to be replaced: ");
        int index = input.nextInt();
        colors.set(index, "Banana");
        System.out.println("Replaced index: " +colors);
    }
//    Remove element
    public static void Part6(){
        List<String> colors = new ArrayList<String>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Orange");
        colors.add("Blue");
        colors.add("White");
        colors.add("Black");
        System.out.println(colors);
        System.out.println("Insert index element needs to be removed: ");
        int index = input.nextInt();
        colors.remove(index);
        System.out.println("New Index: " +colors);
    }
//    Search
    public static void Part7(){
        List<String> colors = new ArrayList<String>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Orange");
        colors.add("Blue");
        colors.add("White");
        colors.add("Black");
        System.out.println(colors);
        if(colors.contains("Red")){
            System.out.println("Found an element");
        }else{
            System.out.println("No element");
        }
    }
//    Sorting
    public static void Part8(){
        List<String> colors = new ArrayList<String>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Orange");
        colors.add("Blue");
        colors.add("White");
        colors.add("Black");
        System.out.println(colors);
        Collections.sort(colors);
        System.out.println("New String after Sort: " +colors);
    }
//    Copy
    public static void Part9(){
        List<String> colors = new ArrayList<String>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Orange");
        System.out.println("List 1:" +colors);
        List<String> colors2 = new ArrayList<String>();
        colors2.add("Blue");
        colors2.add("White");
        colors2.add("Black");
        System.out.println("List 2: " +colors2);
        Collections.copy(colors, colors2);
//        Copy list 2 to list 1
        System.out.println("New List 1: " +colors);
        System.out.println("New List 2: " +colors2);
    }
//    Shuffle list
    public static void Part10() {
        List<String> colors = new ArrayList<String>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Orange");
        colors.add("Blue");
        colors.add("White");
        colors.add("Black");
        System.out.println(colors);
        Collections.shuffle(colors);
        System.out.println("New String after Shuffle: " + colors);
    }
//    Reverse
    public static void Part11(){
        List<String> colors = new ArrayList<String>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Orange");
        colors.add("Blue");
        colors.add("White");
        colors.add("Black");
        System.out.println(colors);
        Collections.reverse(colors);
        System.out.println("New String after reverse: " + colors);
    }
//    Extraction via sublist
    public static void Part12(){
        List<String> colors = new ArrayList<String>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Orange");
        colors.add("Blue");
        colors.add("White");
        colors.add("Black");
        System.out.println(colors);
//        Extract the first 2 elements
        List<String> subcolors = colors.subList(0,2);
        System.out.println("List of the first two elements: " +subcolors);
    }
//    Elements comparison
    public static void Part13(){
        List<String> colors = new ArrayList<String>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Orange");
        colors.add("Blue");
        colors.add("White");
        colors.add("Black");
        List<String> colors2 = new ArrayList<String>();
        colors2.add("Red");
        colors2.add("Green");
        colors2.add("Teal");
        colors2.add("Blue");
        Collections.shuffle(colors2);
        System.out.println(colors2);
        ArrayList<String> compare = new ArrayList<String>();
        for (String c: colors)
            compare.add(colors2.contains(c) ? "Yes" : "No");
        System.out.println(compare);
    }
//    Swapping elements
    public static void Part14(){
        List<String> colors = new ArrayList<String>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Orange");
        colors.add("Blue");
        colors.add("White");
        colors.add("Black");
        System.out.println("Array list pre swap: ");
        for(String a: colors){
            System.out.println(a);
        }
        Collections.swap(colors, 0, 4);
        System.out.println("Array list post swap: ");
        for(String b: colors){
            System.out.println(b);
        }
    }
//    Joining
    public static void Part15(){
        List<String> colors = new ArrayList<String>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Orange");
        colors.add("Blue");
        colors.add("White");
        colors.add("Black");
        System.out.println("Colors 1: " +colors);
        List<String> colors2 = new ArrayList<String>();
        colors2.add("Cream");
        colors2.add("Banana");
        colors2.add("Purple");
        colors2.add("Pink");
        System.out.println("Colors 2: " +colors2);
        ArrayList<String> m = new ArrayList<String>();
        m.addAll(colors);
        m.addAll(colors2);
        System.out.println("Merged Array: " +m);
    }
//    Cloning
    public static void Part16(){
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Orange");
        colors.add("Blue");
        colors.add("White");
        System.out.println("Original list: " +colors);
        ArrayList<String> colors2 = (ArrayList<String>)colors.clone();
        System.out.println("Cloned list: " +colors2);
    }
//    Remove All
    public static void Part17(){
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Orange");
        colors.add("Blue");
        colors.add("White");
        System.out.println("Original list: " +colors);
        colors.removeAll(colors);
        System.out.println("Post removal list: " +colors);
    }
//    Empty set check
    public static void Part18(){
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Orange");
        colors.add("Blue");
        colors.add("White");
        System.out.println("Original list: " +colors);
        System.out.println("Empty check: " +colors.isEmpty());
        colors.removeAll(colors);
        System.out.println("New List: " +colors);
        System.out.println("Empty check: "+colors.isEmpty());
    }
//    Trimming
    public static void Part19(){
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Orange");
        colors.add("Blue");
        colors.add("White");
        System.out.println("Original list: " +colors);
        System.out.println("Trim to size: ");
        colors.trimToSize();
        System.out.println(colors);
    }
//    Extending size
    public static void Part20(){
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Orange");
        colors.add("Blue");
        colors.add("White");
        System.out.println("Original List: " +colors);
        colors.ensureCapacity(8);
        colors.add("Purple");
        colors.add("Teal");
        System.out.println("New updated list: " +colors);
    }
//    Replaced based on index location
    public static void Part21(){
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Orange");
        colors.add("Blue");
        colors.add("White");
        System.out.println("Original List: " +colors);
        System.out.println("Insert the colors to be replaced: ");
        String newc = input.nextLine();
        colors.set(2, newc);
        for(int i = 0; i< colors.size();i++)
        System.out.println(colors.get(i));
    }
//    Print based on position
    public static void Part22(){
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Orange");
        colors.add("Blue");
        colors.add("White");
        System.out.println(colors);
        System.out.println("\nPrint based on index: ");
        for(int i = 0; i < colors.size(); i++){
            System.out.println(colors.get(i));
        }
    }
}


