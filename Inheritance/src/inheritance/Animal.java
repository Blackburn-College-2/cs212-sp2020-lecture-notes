package inheritance;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pauli
 */
public abstract class Animal {
    public String name;
    public Animal(String name){
        this.name = name;
        System.out.println("In animal Constructor");
    }
    public String makeNoise(){
        String x = "AAAAAAAARRRRRRGGGG";
        System.out.println(x);
        return x;
    }
    
}
