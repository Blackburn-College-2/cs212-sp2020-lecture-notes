/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author pauli
 */
public class Dog extends Animal {

    public static int population = 0;
    String breed;

    public Dog(String breed) {
        super("Doggie");
        
        System.out.println("In dog constructor");
        super.name = "Fido";
        this.breed = breed;
        population++;
    }

    @Override
    public String makeNoise() {
        String x = "bark woof bark! and there are " + Dog.population + " dogs";
        System.out.println(x);
        displayPopulation();
        return x;
    }
    public static void displayPopulation(){
        System.out.println("There are " + Dog.population + " dogs!");
//        System.out.println("My breed is: " + breed);
    }
}
