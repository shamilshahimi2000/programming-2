/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;
public class driver extends golfClub{
    private String material;
    private final String name="Driver";
   
   
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
   String madeOf()
   {  //to called the parent method.
      super.madeOf();
        return "Anything ranging from steel.";
   }
   
   
   @Override
   String usedFor()
   {
        return "Hit the ball furthest";
   }
   @Override
   String clubsLoft()
   {
        return "7 degrees to 11 degrees";
   }

}
