
package com.mycompany.testclass;

public class TestClass
{

    public static void main(String[] args) 
    {
        Employee e1=new Employee();
        e1.setName("Mr.Bogdan");
        e1.setEmpId(001);
        e1.setDesignation("Abc");
        System.out.println("1st Employee Name is " +e1.getName());
        System.out.println("1st Employee ID is " +e1.getEmpId());
        System.out.println("1st Employee Designation is " +e1.getDesignation());
        System.out.println("\n");
        Employee e2=new Employee();
        e2.setName("Ms.Bird");
        e2.setEmpId(002);
        e2.setDesignation("Efg");
        System.out.println("2nd Employee Name is " +e2.getName());
        System.out.println("2nd Employee ID is " +e2.getEmpId());
        System.out.println("2nd Employee Designation is " +e2.getDesignation());
        
                
    }
}
