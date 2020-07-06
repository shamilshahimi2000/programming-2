/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1stage1;
class Animal {
    protected String name; // only this class & subclass can access
    
    public Animal(String name) {
        this.name = name;
    }
    
    void introduceYourself() {
        System.out.println("Morr. I am a animal.");
    }

}
