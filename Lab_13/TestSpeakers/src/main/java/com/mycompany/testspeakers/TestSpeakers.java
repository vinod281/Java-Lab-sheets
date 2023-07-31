
package com.mycompany.testspeakers;


public class TestSpeakers
 {
    public static void main(String[] args)
 {
        Speaker politician = new Politician();
        Speaker priest = new Priest();
        Speaker lecturer = new Lecturer();

        System.out.println("Politician's speech:");
        politician.speak();

        System.out.println("\nPriest's speech:");
        priest.speak();

        System.out.println("\nLecturer's speech:");
        lecturer.speak();
    }
}