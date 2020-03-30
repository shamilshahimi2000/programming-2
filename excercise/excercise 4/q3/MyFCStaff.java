import java.util.*;
public class MyFCStaff{
   
   public static void main(String[]args){
   Scanner sc = new Scanner(System.in);
   
   TestMyFCStaff a=new TestMyFCStaff();
   
   System.out.print("staff name\t\t\t\t:");
   String name=sc.next();
   System.out.print("staf ID\t\t\t\t\t:");
   String staffID=sc.next();
   System.out.print("hours work\t\t\t\t:");
   int hourwork=sc.nextInt();
   System.out.print("total sale\t\t\t\t:RM");
   double tsale=sc.nextDouble();
   
   a.TestMyFCStaff(name,staffID,hourwork,tsale);
   a.calculateCommission();
   a.calculateSalary();
   System.out.print("total salary\t\t\t:RM"+a.displaySalary());
   
   
   }
}