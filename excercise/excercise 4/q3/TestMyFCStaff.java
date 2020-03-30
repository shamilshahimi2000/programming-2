class TestMyFCStaff{

   private String name;
   private String studentID;
   private int thour;
   private double tsale,commission=0,tsalary;
   
   
   public void TestMyFCStaff(String nm,String stID,int thours,double tsales){
      this.name=nm;
      this.studentID=stID;
      this.thour=thours;
      this.tsale=tsales;
   }
   
   public void calculateCommission(){
   if(tsale>150&&tsale<301)
   commission=0.05;
   else if(tsale>300&&tsale<501)
   commission=0.10;
   else if(tsale>500)
   commission=0.15;
   } 
   
   public void calculateSalary(){
   thour=thour*8;
   
   tsalary=thour+(commission*tsale);
   } 
   
   public double displaySalary(){
   return tsalary;
   } 
}