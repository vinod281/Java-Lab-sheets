
package com.mycompany.main2;


// Rectangle class (Subclass)
public class Rectangle extends Shape
{
    private double length;
    private double width;

    // Constructor for Rectangle
    public Rectangle(double length, double width)
    {
        this.length = length;
        this.width = width;
    }

    // Implementing the calculateArea() method for Rectangle
    @Override
    public double calculateArea() 
    {
        return length * width;
    }
}