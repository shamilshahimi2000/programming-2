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

   private String name;
    
    public Cat(String name){
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }
    
    public Cat (int age){
        this.age = age;
    }
    
    public int getAge(){
        return this.age;
    }
    
    @Override
public void introduceYourself()
{
    System.out.println("Meow. I am a cat. My name is " + this.name);
    System.out.println("and I am " + this.age + " years old.");
}
}
