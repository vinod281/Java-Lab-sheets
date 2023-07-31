

package com.mycompany.encapstest;

public class EncapsTest
{

    public static void main(String[] args) 
    
        
        {
         EncapsulationDemo obj = new EncapsulationDemo("Mario",23,20000.00f);
         obj.setEmpName("Mario");
         obj.setAge(23);
         obj.setsal(20000.00f);
            System.out.println("Employee name is " +obj.getEmpName());
            System.out.println("Age is " +obj.getage());
            System.out.println("Salary is " +obj.getsal());
        }

    
}
