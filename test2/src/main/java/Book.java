import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.time.*;
public class Book {
    private int lend;
    private int bookid;
    private int lenddate;
    private int returndate;
    Scanner input = new Scanner(System.in);
    public Book(int lend, int bookid, int lenddate, int returndate) {
        this.lend = lend;
        this.bookid = bookid;
        this.lenddate = lenddate;
        this.returndate = returndate;
    }
    public Book(){

        System.out.println("Insert Lend iD: ");
        this.lend = input.nextInt();

        System.out.println("Insert Book ID: ");
        this.bookid = input.nextInt();

        System.out.println("Insert Lend Date: ");
        this.lenddate = input.nextInt();

        System.out.println("Insert Return Date: ");
        this.returndate = input.nextInt();
    }
    public int getLend() {
        return lend;
    }

    public void setLend(int lend) {
        this.lend = lend;
    }

    public int getBookid() {
        return bookid;
    }

    public void setBookid(int bookid) {
        this.bookid = bookid;
    }

    public int getLenddate() {
        return lenddate;
    }

    public void setLenddate(int lenddate) {
        this.lenddate = lenddate;
    }

    public int getReturndate() {
        return returndate;
    }

    public void setReturndate(int returndate) {
        this.returndate = returndate;
    }
    Student stdid = new Student();
    public String printInfo(){
        return "Lend-ID: " + lend + " Book-ID: " + bookid + " Lend date: " + lenddate + " Return date: " + returndate + stdid.printInfo();
    }
    public void deleteInfo(){
        System.out.println("Insert Lend ID: ");
        int check = input.nextInt();
        if(check == lend){
            return "Deleted";
        }
    }
}
