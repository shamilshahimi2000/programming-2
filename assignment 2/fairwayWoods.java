/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;
public class fairwayWoods extends golfClub {
     
   private String material;
   private final String name="FairwayWoods";
   
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
   String madeOf()
   {
       return this.material;
   }

   @Override
   String usedFor()
   {
       return "For ranges beyond the iron club or need more control";
   }
   @Override
   String clubsLoft()
   {
       return "12 degrees to 20 degrees";
   }
   

}
