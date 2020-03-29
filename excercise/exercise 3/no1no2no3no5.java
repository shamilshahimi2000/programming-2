import java.util.*;

public class no1no2no3no5 {

    public static void main(String[] args) {

        //QUESTION1
        //By new KeyWord
        String Name = new String("uwaa");
        //By String Literal
        String myName = "uwaa";

        //QUESTION2
        String phr = new String("Big,blue sky");
        System.out.println(phr.substring(phr.indexOf(","), 7));
        //The output is ,blu

        //QUESTION3
        Random rd = new Random();
        System.out.println(rd.nextInt(41) + 10);
        //It will generate a random number 10 to 50 inclusive
      
        //QUESTION5
        String test = "abc";
        test = test + test;
        System.out.println(test);
        //The output is abcabc
        
     }
}