import java.util.*;

public class Management {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("First Management System, insert your command: 1 = Insert new employee 2 = Search employee 3 = Display Employee || Other = Exit ");
        int command = input.nextInt();
        switch (command) {
            case 1:
                System.out.println("Insert new employee information");
                System.out.println("Insert amount of people insert: ");
                int numemployee = input.nextInt();
                for(int i = 0; i < numemployee; i++) {
                    System.out.println("Insert new employee: 1 = Engineer 2 = Staff 3 = Worker");
                    int empcheck = input.nextInt();
                    switch (empcheck) {
                        case 1:
//        Engineer
                            Engineer engid = new Engineer();
                            break;
//        Staff
                        case 2:
                            Staff stfid = new Staff();
                            break;
                        case 3:
//        Worker
                            Worker wrkid = new Worker();
                            break;
                        default:
                            System.out.println("Try again (Numbers 1-3)");
                    }
                }
                break;
//                Search information (Still do not understand this part)
            case 2:
                System.out.println("Searching employee details: ");
                System.out.println("Insert employee to search: 1 - Engineer 2 - Staff 3 - Worker");
                int seacheck = input.nextInt();
                switch (seacheck) {
                    case 1:
                        System.out.println("Insert details to search: 1 - Name 2 - Age 3 - Gender 4 - Address 5 - Degree");
                        int esearch = input.nextInt();
                        switch (esearch) {
                        }
                        break;
                    case 2:
                        System.out.println("Insert details to search: 1 - Name 2 - Age 3 - Gender 4 - Address 5 - Job");
                        int ssearch = input.nextInt();
                        switch (ssearch) {
                        }
                        break;
                    case 3:
                        System.out.println("Insert details to search: 1 - Name 2 - Age 3 - Gender 4 - Address 5 - Level");
                        int wsearch = input.nextInt();
                        switch (wsearch) {
                        }
                        break;
                }
                break;
//                Display Information
            case 3:
                System.out.println("Display employee mode: 1 - Engineer 2 - Staff 3 - Worker");
                int discheck = input.nextInt();
                switch (discheck) {
                    case 1:
//                        Engineer
                        Engineer printeng = new Engineer();
                        System.out.println("Engineer Information: ");
                        System.out.println(printeng.printInfo());
                        break;
                    case 2:
//                        Staff
                        Staff printstf = new Staff();
                        System.out.println("Staff Information: ");
                        System.out.println(printstf.printInfo());
                        break;
                    case 3:
//                        Worker
                        Worker printwrk = new Worker();
                        System.out.println("Worker Information: ");
                        System.out.println(printwrk.printInfo());
                        break;
                    default:
                        System.out.println("Back to menu");
                }
                return;
            default:
                System.out.println("Buh bye");
        }
    }
}

