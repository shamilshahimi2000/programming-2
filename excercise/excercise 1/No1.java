
 import java.util.Scanner;    
    public class No1 {                                                   //import the scanner class
    public static void main(String[] args) {
         
    Scanner sc=new Scanner(System.in);                                          //call the scanner class
    
    String college = new String ("College of Arts and Sciences");                 //declare "College of Arts and Sciences" in collage object
    String town=new String(" sintok kedah");                                      //declare " sintok kedah" in town object
    
    System.out.println(college); // part (a)                                        //print out collage object
    
    int stringLength;                                                               //initiallise stringLength as int
  
    String change1, change2, change3;                                               //initialise change1, change2, change3 as string
    
    stringLength=college.length(); // part (b)                                      //store the length of collage(string) in stringLength object
   
    System.out.println (college + " contains " + stringLength + "characters.");     //print college and stringLength object
    change1 = college.toUpperCase(); // part (c)                                    //change all the string in college object into uppercase and store in change1 object
    System.out.println ("The string is all in upper case: " + change1);             //print out change1 object
    change2 = change1.replace('O', '*'); // part (d)                                //replace all 'O' in change1 object into '*' using .replace and store in change2 object
    System.out.println ("All capital O's are replaced with the asteriskcharacter: " + change2);             //print out change2 object
    change3 =college.concat(town) ; // part (e)                                     //declare town into collage using concat and store in change3 object                                         
    System.out.println ("The final string is " + change3);                          //print out change3
    
        }  
    }
    
    

