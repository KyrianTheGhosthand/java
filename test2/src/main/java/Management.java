import java.util.*;

public class Management {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Book Lend-Lease Management Program: 1 - Insert new Entry 2 - Delete Entry 3 - Display Entry");
        int command = input.nextInt();

        switch(command) {
            case 1:
                Book newbook = new Book();
                break;
            case 2:
                Book delete = new Book();
                break;
            case 3:
                Book display = new Book();
                System.out.println("Book Info: ");
                System.out.println(display.printInfo());
                break;
            default:
                System.out.println("Bye");
        }

    }

}
