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
public class Sparrow extends Animal implements Fly {

    public Sparrow(){
        super("Roger");
    }
    @Override
    public void fly() {
        System.out.println("sparrow wweeeeeeeeeeeeeeeeee");
    }
    
}
