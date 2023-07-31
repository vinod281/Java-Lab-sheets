
package com.mycompany.testclass4;

public class TestClass4 
{

    public static void main(String[] args)
    {
       
        
        Student student = new Student("John Doe", 1001, "Computer Science");
        Lecturer lecturer = new Lecturer("Dr. Smith", 2001, "Software Engineering");

        
        System.out.println("Student Details:");
        System.out.println("Name: " + student.getName());
        System.out.println("ID: " + student.getID());
        System.out.println("Course: " + student.getCourse());

        
        System.out.println("\nLecturer Details:");
        System.out.println("Name: " + lecturer.getName());
        System.out.println("ID: " + lecturer.getID());
        System.out.println("Programme: " + lecturer.getProgramme());
    
    }
}
