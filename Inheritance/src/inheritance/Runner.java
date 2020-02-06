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
public class Runner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Number x = new Integer(2);
       Number y = new Double(2.9);
       Number[] arr = {x,y};
        for (Number val : arr) {
            System.out.println(val.intValue());
        }
       
    }
    
    public static void doFlyTwice(Fly flyer){
        flyer.fly();      
        flyer.fly();
    }

}
