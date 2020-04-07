import java.util.*;
   public class TestStudent {  
   public static void main (String [] args) {

	Scanner sc = new Scanner(System.in);
   
   String matricNo;
	double test1,test2;
	
	Student [] studDegree = new Student[3];
   
	//complete your code here
   
   for(int i=0;i<studDegree.length;i++){
   
   System.out.print("Matric No :");
   matricNo=sc.next();
   System.out.print("Test 1 :");
   test1=sc.nextDouble();
   System.out.print("Test 2 :");
   test2=sc.nextDouble();
   
   studDegree[i]=new Student();

   studDegree[i].Student(matricNo,test1,test2);
   studDegree[i].calculateAverage();
   }
   
   
   System.out.println("\n\n**********************************");
   System.out.println("        STUDENT INFORMATION       ");
   System.out.println("**********************************\n\n");
   
   System.out.println("\tMatric No\t\tAverageMark");
   for(int i=0;i<studDegree.length;i++){
   System.out.println(studDegree[i].getStudentInfo());
   }

  }//end of main method
}//end of class TestStudent
