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
public class Bat extends Animal implements Fly {

    public Bat(){
        super("I'm a bat");
    }
    @Override
    public void fly() {
        System.out.println("I'm a bat. woosh.");
    }
    
}
