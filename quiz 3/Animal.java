/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1stage1;
class Animal {
    private String name;
    public static int age;

    void introduceYourself() {
      System.out.println("Morr. I am an animal.");
      System.out.println("and I am " + this.age + " years old.");
    }
}
