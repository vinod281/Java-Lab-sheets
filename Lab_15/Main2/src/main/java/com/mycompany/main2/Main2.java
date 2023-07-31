

package com.mycompany.main2;




public class Main2 
{
    public static void main(String[] args)
    {
        // Creating a Rectangle object
        double rectangleLength = 5.0;
        double rectangleWidth = 3.0;
        Shape rectangle = new Rectangle(rectangleLength, rectangleWidth);

        // Creating a Circle object
        double circleRadius = 4.0;
        Shape circle = new Circle(circleRadius);

        // Displaying the area of the Rectangle and Circle
        System.out.println("Rectangle:");
        rectangle.display();

        System.out.println("\nCircle:");
        circle.display();
    }
}
