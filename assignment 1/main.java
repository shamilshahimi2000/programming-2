import java.util.*;
   public class main{
   public static void main(String[]args){
   Scanner sc=new Scanner(System.in);
   
   golfClub       a=new golfClub();
   driver         b=new driver();
   fairwayWoods   c=new fairwayWoods();
   Hybrids        d=new Hybrids();
   
   //declare the material
   b.madeOf("Wood"); 
   c.madeOf("Metal woods");
   d.madeOf("Wood and an iron");
   
   //call the method
   System.out.println("****************************************");
   System.out.println("The Components of a golf club :");      a.basicPart();
   System.out.print("\nMade of\t\t\t:  ");                     a.madeOf();
   System.out.print("Function \t\t:  ");                       a.usedFor();
   System.out.print("Golfclubs Loft\t:  ");                    a.clubsLoft();
   
   System.out.println("****************************************");
   System.out.println("           Type of golf club            ");
   System.out.println("****************************************");
   System.out.println("Name\t\t\t\t:  "      +      b.getName());
   System.out.print("Made of\t\t\t:  ");            b.madeOf();
   System.out.print("Specific for\t:  ");           b.usedFor();
   System.out.print("Golfclubs Loft\t:  ");         b.clubsLoft();
   
   System.out.println("****************************************");
   System.out.println("Name\t\t\t\t:  "      +      c.getName());
   System.out.print("Made of\t\t\t:  ");            c.madeOf();
   System.out.print("Specific for\t:  ");           c.usedFor();
   System.out.print("Golfclubs Loft\t:  ");         c.clubsLoft();
   
   System.out.println("****************************************");
   System.out.println("Name\t\t\t\t:  "      +      d.getName());
   System.out.print("Made of\t\t\t:  ");            d.madeOf();
   System.out.print("Specific for\t:  ");           d.usedFor();
   System.out.print("Golfclubs Loft\t:  ");         d.clubsLoft();
   System.out.println("****************************************");

   }   
   
}
