import java.util.*;
class TestBook{
   public static void main(String[]args){
   Scanner sc=new Scanner(System.in);
   
  
   System.out.print("number of book :");
   int n=sc.nextInt();
   
   Book[] myLibrary=new Book[n];
     
   for(int i=0;i<myLibrary.length;i++){
   
   sc.nextLine();
   System.out.print("title :");
   String ti=sc.nextLine();
   System.out.print("price :RM");
   double pr=sc.nextDouble();
   
   myLibrary[i]=new Book();
   
   myLibrary[i].Book(ti,pr);
   }
   
   double highest=myLibrary[0].getPrice();
   String a=myLibrary[0].getTitle();
   
   for(int i=0;i<myLibrary.length;i++){
   if(highest<myLibrary[i].getPrice()){
      highest=myLibrary[i].getPrice();
      a=myLibrary[i].getTitle();
   }
   }
   
   System.out.println("\nhighest price :RM"+highest);
   System.out.print("title :"+a+"\n\n");
   
   System.out.print("book that have java in title :-\n");
   String b="java";
   for(int i=0;i<myLibrary.length;i++){
   if(myLibrary[i].getTitle().contains(b)){
   System.out.println("title : "+myLibrary[i].getTitle());
   }
   }
   
 }  
}