/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1stage1;

/**
 *
 * @author a
 */
public class Cat extends Animal {

   public Cat(String name) {
        super(name);
    }
    
    @Override
    void introduceYourself() {
        System.out.printf("Meow. I am a cat. My name is %s.\n", name);
    }
}
