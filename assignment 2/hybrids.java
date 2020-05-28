/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;
public class hybrids extends golfClub {
    private String material;
    private final String name="Hybrids";
   
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
        return "Making airborne shots easily";
   }
   @Override
   String clubsLoft()
   {
        return "14 degrees and 28 degrees";
   }
   
}
