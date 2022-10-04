/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q1ex4gomos;

/**
 *
 * @author TAU
 */
public class Person {
    private String name, interest;
    private int age;
    
    public Person (String name){
    this.name = name;
    this.age = 40;
    this.interest = "love";
    }
    
    public String getName(){
        return name;
    }
    public String getInterest(){
        return interest;
    }
    public int getAge(){
        return age;
    }
}
