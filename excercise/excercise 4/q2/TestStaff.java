import java.util.*;
public class TestStaff {
		
   public static void main(String arg[]){
	Scanner sc = new Scanner(System.in);
   
   Staff a=new Staff();
   
   System.out.print("enter name\t\t\t\t:");
   String name=sc.next();
   System.out.print("enter staf ID\t\t\t:");
   String staffID=sc.next();
   System.out.print("enter working perday\t:");
   int workperday=sc.nextInt();
   
   a.setStaffInfo(name,staffID,workperday);
   a.calculateSalary();
   
   System.out.println("\n***********************************\n");
   System.out.println("\t\t\t\t staff info \t\t\t\t\n");
   
   System.out.println("name\t\t\t\t\t\t:"+a.getName());
   System.out.println("staff ID\t\t\t\t\t:"+a.getStaffID());
   System.out.print("salary of the staff\t: RM "+a.getSalary());
   
   }
}//end class

