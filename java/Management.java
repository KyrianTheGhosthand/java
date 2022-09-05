import java.util.*;

public class Management {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("First Management System, insert your command: 1 = Insert new employee 2 = Search employee 3 = Display Employee Other = Exit ");
        int command = input.nextInt();
        switch (command) {
            case 1:
                System.out.println("Insert new employee: 1 = Engineer 2 = Staff 3 = Worker");
                int empcheck = input.nextInt();
                switch (empcheck) {
                    case 1:
//        Engineer
                        System.out.println("Insert new employee information");
                        System.out.println("Insert amount of people insert: ");
                        int engcap = input.nextInt();
                        for(int i = 0; i < engcap; i++) {
                            Engineer engid = new Engineer();
                            System.out.println("Insert name: ");
                            String ename = input.nextLine();
                            Engineer.setName(ename);
                            System.out.println("Insert age: ");
                            int eage = input.nextInt();
                            Engineer.setAge(eage);
                            System.out.println("Insert gender: ");
                            String egender = input.nextLine();
                            Engineer.setGender(ename);
                            System.out.println("Insert address: ");
                            String eaddress = input.nextLine();
                            Engineer.setAddress(eaddress);
                            System.out.println("Insert degree: ");
                            String edeg = input.nextLine();
                            Engineer.setDegree(edeg);
                        }
                        break;
//        Staff
                    case 2:
                        System.out.println("Insert new employee information");
                        System.out.println("Insert amount of people insert: ");
                        int stfcap = input.nextInt();
                        for(int i = 0; i < stfcap; i++) {
                            Staff stfid = new Staff();
                            System.out.println("Insert name: ");
                            String sname = input.nextLine();
                            Staff.setName(sname);
                            System.out.println("Insert age: ");
                            int sage = input.nextInt();
                            Staff.setAge(sage);
                            System.out.println("Insert gender: ");
                            String sgender = input.nextLine();
                            Staff.setGender(sgender);
                            System.out.println("Insert address: ");
                            String saddress = input.nextLine();
                            Staff.setAddress(saddress);
                            System.out.println("Insert occupation: ");
                            String socc = input.nextLine();
                            Staff.setJob(socc);
                        }
                        break;
                    case 3:
//        Worker
                        System.out.println("Insert new employee information");
                        System.out.println("Insert amount of people insert: ");
                        int worcap = input.nextInt();
                        for(int i = 0; i < worcap; i++) {
                            Worker worid = new Worker();
                            System.out.println("Insert name: ");
                            String wname = input.nextLine();
                            Worker.setName(wname);
                            System.out.println("Insert age: ");
                            int wage = input.nextInt();
                            Worker.setAge(wage);
                            System.out.println("Insert gender: ");
                            String wgender = input.nextLine();
                            Worker.setGender(wgender);
                            System.out.println("Insert address: ");
                            String waddress = input.nextLine();
                            Worker.setAddress(waddress);
                            System.out.println("Insert level (1-10): ");
                            int wlvl = input.nextInt();
                            Worker.setLevel(wlvl);
                        }
                        break;
                }
                return;
                    case 2:
                        System.out.println("Searching employee details: ");
                        System.out.println("Insert employee to search: 1 - Engineer 2 - Staff 3 - Worker");
                        int seacheck = input.nextInt();
                        switch (seacheck) {
                            case 1:
                                System.out.println("Insert details to search: 1 - Name 2 - Age 3 - Gender 4 - Address 5 - Degree");
                                int esearch = input.nextInt();
                                switch (esearch){
                                }
                            case 2:
                                System.out.println("Insert details to search: 1 - Name 2 - Age 3 - Gender 4 - Address 5 - Job");
                                int ssearch = input.nextInt();
                                switch (ssearch){
                                }
                            case 3:
                                System.out.println("Insert details to search: 1 - Name 2 - Age 3 - Gender 4 - Address 5 - Level");
                                int wsearch = input.nextInt();
                                switch (wsearch){
                                }

                    case 3:
                        System.out.println("Display employee mode: 1 - Engineer 2 - Staff 3 - Worker");
                        int discheck = input.nextInt();
                        switch (discheck) {
                            case 1:
                                System.out.println("Engineer Information: ");
                                System.out.println(Engineer.printInfo());
                                break;
                            case 2:
                                System.out.println("Staff Information: ");
                                System.out.println(Staff.printInfo());
                                break;
                            case 3:
                                System.out.println("Worker Information: ");
                                System.out.println(Worker.printInfo());
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
}
