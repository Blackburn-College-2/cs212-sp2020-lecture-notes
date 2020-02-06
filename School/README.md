main:
```
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
```

output:
```
CLASS: cs212 ENROLLING:Dave
STUDENT: Dave ENROLLING IN: cs212
CLASS: cs212 ENROLLING:Dave
CLASS: Already enrolled
STUDENT: Sally ENROLLING IN: cs212
CLASS: cs212 ENROLLING:Sally
STUDENT: Sally ENROLLING IN: cs212
STUDENT: already enrolled
CS212: [Dave, Sally]
Dave: [cs212]
Sally: [cs212]
Basket Weaving: [Dave, Sally]
Dave: [cs212, Basket Weaving 999]
Sally: [cs212, Basket Weaving 999]
```
