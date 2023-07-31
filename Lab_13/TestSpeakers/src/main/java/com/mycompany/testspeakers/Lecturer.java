
package com.mycompany.testspeakers;

class Lecturer implements Speaker
 {
    @Override
    public void speak() 
{
        System.out.println("Lecturer: Today's lecture is on Java programming.");
    }
}
