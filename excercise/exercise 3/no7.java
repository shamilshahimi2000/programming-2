import java.util.*;
public class no7 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        
        String text1 = "School of Computing";
        String text2 = "College of Arts and Sciences";
        String text3 = "UUM Sintok";

        int totalLength = (text1+text2+text3).length();
        System.out.println(text2.substring(0,text2.length()-8)+text1.substring(text1.indexOf('C'),text1.length()));
        System.out.println("Total length is "+totalLength);
        
     }
}