public class Hybrids extends golfClub{
   
   private String material;
   private String name="Hybrids";
   
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
   System.out.println("Making airborne shots easily");
   }
   @Override
   void clubsLoft()
   {
   System.out.println("14 degrees and 28 degrees");
   }
   
}