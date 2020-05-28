public class driver extends golfClub{
   
   private String material;
   private String name="Driver";
   
   
   String getName()
   {
   return name;
   }
   
   //overloading method.
   void madeOf(String materials)
   {
   this.material=materials;
   }
   
   @Override
   void madeOf()
   {  //called the parent of method.
      super.madeOf();
      System.out.println("\t\t\t\t\t\tAnything ranging from steel.");
   }
   
   
   @Override
   void usedFor()
   {
   System.out.println("Hit the ball furthest");
   }
   @Override
   void clubsLoft()
   {
   System.out.println("7 degrees to 11 degrees");
   }

}