import java.util.*;

public class TriangleDemo
{
   public static void main(String[] args)
   {
      //create a Scanner object
      Scanner sc =new Scanner(System.in);

      // Create a Triangle object.
      Triangle a=new Triangle();

      // Prompt user to input value for height and base                 
      System.out.print("enter height: ");
      double height=sc.nextDouble();
      System.out.print("enter base: ");
      double base=sc.nextDouble();
      
      //Set the height and base (use mutator) 
      a.set(height,base);
      
      
      // Display the height, base and area (use accessor)
      System.out.println("The pyramid's height is "
                         + a.getHeight());
      System.out.println("The pyramid's base is "
                         +a.getBase());
      
     System.out.println("The pyramid's area is "
                         + a.getArea());
      
   }
}

