public class fairwayWoods extends golfClub{
   
   private String material;
   private String name="FairwayWoods";
   
   String getName()
   {
   return name;
   }
   
   //overloading method;
   void madeOf(String materials)
   {
   this.material=materials;
   }
   @Override
   void madeOf()
   {
   System.out.println(this.material);
   }

   @Override
   void usedFor()
   {
   System.out.println("For ranges beyond the iron club or need more control");
   }
   @Override
   void clubsLoft()
   {
   System.out.println("12 degrees to 20 degrees");
   }
   
}