import java.util.*;

class Employee{
   
   public static void main(String []args){
   Scanner sc=new Scanner(System.in);
   
   Payroll a=new Payroll();
   
   System.out.print("enter your employee ID number \t:");
   int IDnumber=sc.nextInt();
   System.out.print("enter your gross pay \t\t\t\t:RM ");
   double grosspay=sc.nextDouble();
   
   a.Payrolls(IDnumber,grosspay);
   a.calculateNetPay();
   a.printOutput();
      
   }
}