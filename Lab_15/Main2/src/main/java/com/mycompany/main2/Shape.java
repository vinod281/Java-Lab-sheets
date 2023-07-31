
package com.mycompany.main2;

// Shape class (Superclass)
abstract class Shape 
{
    // Abstract method to calculate the area
    public abstract double calculateArea();

    // Non-abstract method to display shape information
    public void display()
    {
        System.out.println("Area: " + calculateArea());
    }
}