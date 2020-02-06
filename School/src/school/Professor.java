/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school;

import java.util.ArrayList;

/**
 *
 * @author pauli
 */
public class Professor {
    protected String name;
    ArrayList<Course> courses;
    public Professor(String name){
        this.name = name;
        courses = new ArrayList();
    }
}
