/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school;

/**
 *
 * @author pauli
 */
public class Runner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Professor paul = new Professor("Paul");
        Course cs212 = new Course("cs212");
        cs212.setProfessor(paul);
        Student dave = new Student("Dave");
        Student sally = new Student("Sally");
        cs212.enroll(dave);
        sally.enroll(cs212);
        System.out.println("CS212: " + cs212.students);
        System.out.println("Dave: " + dave.courses);
        System.out.println("Sally: " + sally.courses);
        
        Course course2 = new Course("Basket Weaving 999");
        course2.enrollOptimized(dave);
        sally.enrollOptimized(course2);
        System.out.println("Basket Weaving: " + course2.students);
        System.out.println("Dave: " + dave.courses);
        System.out.println("Sally: " + sally.courses);
        
    }
    
}
