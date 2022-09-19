package emailtest;
import java.util.*;
public class Account implements IAccount {
    private String name;
    private String accountNumber;
    private String email;
    private double accountBalance;

    private String password;
    public Account(){}


    public Account(String name, String accountNumber, String email, double accountBalance, String password) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.email = email;
        this.accountBalance = accountBalance;
        this.password = password;
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", email='" + email + '\'' +
                ", accountBalance='" + accountBalance + '\'' +
                '}';
    }
    private ArrayList<Account> newAccount = new ArrayList<Account>();

    public void addAccount(Account account){
        newAccount.add(account);
        account.toString();
    }
    public void displayInfo(){
        System.out.println(newAccount);
    }
    public void changeEmail(String email){
        for(Account a: newAccount){
            if(a.getEmail().matches(email)){
                System.out.println("Old email found, insert new email: ");
                input.nextLine();
                String newemail = input.nextLine();
                a.setEmail(newemail);
            }else System.out.println("No email found");
            return;
        }
    }
    public void recharge(double amount){
        System.out.println("Insert email to be recharged: ");
        input.nextLine();
        String check = input.nextLine();
        for(Account a: newAccount){
            if(a.getEmail().matches(check)){
                System.out.println("Accounted found, current balance is: " +a.getAccountBalance());
                this.accountBalance += amount;
                System.out.println("New account balance: " +a.getAccountBalance());
            }else System.out.println("No email found!");
            return;
        }
    }
    public void check(String name, String password){
        for(Account a: newAccount){
            if(a.getName().matches(name) && a.getPassword().matches(password)){
                System.out.println("Login success");
                continue;
            }
            else System.out.println("Login Failed");
            break;
        }
    }
}
interface IAccount {
    Scanner input = new Scanner(System.in);
     void addAccount(Account account);
     void displayInfo();
     void changeEmail(String email);
     void recharge(double amount);
}