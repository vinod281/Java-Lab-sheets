
package com.mycompany.main2;


    public class Circle extends Shape
    {
    private double radius;

    // Constructor for Circle
    public Circle(double radius) 
    {
        this.radius = radius;
    }

    // Implementing the calculateArea() method for Circle
    @Override
    public double calculateArea() 
    {
        return Math.PI * radius * radius;
    }
    
}
