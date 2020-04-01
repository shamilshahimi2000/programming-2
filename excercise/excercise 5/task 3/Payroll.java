class Payroll{
   
   private int IDnumber;
   private double grosspay,stax,fedtax,netpay;

   void Payrolls(int Dnum, double gpay){
   
   IDnumber=Dnum;
   grosspay=gpay;
   }
   
   void calculateNetPay(){
   stax=grosspay*0.075;
   fedtax=grosspay*0.125;
   netpay=grosspay-stax-fedtax;
   }
   
   void printOutput(){
   System.out.println("enter your state tax \t\t\t\t:RM "+stax);
   System.out.print("enter your federal tax \t\t\t\t:RM "+fedtax);
   System.out.print("\n\nnet pay is \t:RM "+netpay);
   }

}