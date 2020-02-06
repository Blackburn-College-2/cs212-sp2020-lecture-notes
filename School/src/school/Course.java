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
public class Course {
    protected String name;

    public String getName() {
        return name;
    }
    ArrayList<Student> students;
    Professor prof;
    public Course(String name){
        this.name = name;
        students = new ArrayList();
    }
    public boolean enroll(Student student){
        System.out.println("CLASS: " + name + " ENROLLING:" + student.getName());
        if(isEnrolled(student)){
            //already enrolled. 
            System.out.println("CLASS: Already enrolled");
            return true;
        }else{
            students.add(student);
            return student.enroll(this);
        }
    }
    public boolean isEnrolled(Student student){
        return students.contains(student);
    }

    void setProfessor(Professor prof) {
        this.prof = prof;
    }
    public String toString(){
        return name;
    }
}
