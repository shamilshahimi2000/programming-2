
import java.util.Scanner;                                                       //import the scanner class

public class No3 {

    public static void main(String[] args) {
        
    Scanner sc=new Scanner(System.in);                                          //call the scanner class
    
    System.out.print("enter date (dd/mm/yy) :");
    String date=sc.next();                                                      //input date
    System.out.print("the date is "+date.replace("/","." ));                    //replace '/' into '.' in date object and print it out
    
    }
    
}
