
import java.util.*;

public class No4 {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        int min,max;                                                            //declare min and max
        
        System.out.print("enter min : ");                                       //print the string
        
        min=sc.nextInt();                                                       //initialise min
        System.out.print("enter max : "); 
        max=sc.nextInt();                                                       //initialise min
        System.out.print(RandomInRange(min,max));                               //print the random int
        
    }
    public static int RandomInRange(int a,int b){                               //call the method
        int x=0;                                                                //declare x
        if(a>b)                                                                 //condition if a larger than b
            x=0;                                                                
        else
            x=new Random().nextInt(b-a+1)+a;                                    //declare x as randam number between min and max
        
            return x;
    }
    
}
