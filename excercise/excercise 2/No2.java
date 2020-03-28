
import java.util.Scanner;

public class No2 {

    public static void main(String[] args) {
        
         Scanner sc=new Scanner(System.in);
     
    System.out.print("type something : ");
    String s=sc.nextLine();                                                         //store input in s
    
    countA(s);                                                                  //call the method
    
    }
    
    public static void countA(String a){
        char c='a';                                                             //declare c as char 'b'
        int x=0;                                                                //declare x as 0
        
        for(int i=0;i<a.length();i++){                                          //for loop
        if(a.charAt(i)==c)                                                      //condition if a equal c
            x++;                                                                //plus x if the condition is true
        
            }
        
        System.out.print("total : "+x);                                         //print out total sum of x
    }
    
}
