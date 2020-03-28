
import java.util.Scanner;                                                       //import the scanner class

public class No4 {

    public static void main(String[] args) {
        
    Scanner sc=new Scanner(System.in);                                          //call the scanner class
    
    String year=sc.next();                                                      //input year
    
    int sum=0;                                                                  //initialise sum =0
    
    for(int i=0;i!=4;i++){                                                       //for loop
        
        System.out.println(year.charAt(i));                                     //set year as character and print it out        
        sum+=Integer.parseInt(""+year.charAt(i));                               //change year into int and calculate it
    }
    System.out.print("the sum is : "+sum);                                      //print out total sum
    }
    
}
