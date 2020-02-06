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
public class Student {

    protected String name;

    public String getName() {
        return name;
    }
    ArrayList<Course> courses;

    public Student(String name) {
        this.name = name;
        courses = new ArrayList();
    }

    public boolean enroll(Course course) {
        System.out.println("STUDENT: " + name + " ENROLLING IN: " + course.getName());
        if (isEnrolled(course)) {
         //can assume class has enrolled already.
         return true;
        }else{
            courses.add(course);
            return course.enroll(this);
        }
    }
    public boolean enrollOptimized(Course course){
        return isEnrolled(course) || courses.add(course) && course.enrollOptimized(this);
    }

    public boolean isEnrolled(Course course) {
        return courses.contains(course);
    }
    public String toString(){
        return name;
        
    }

}
