
package com.mycompany.encapstest1;

public class EncapsTest1
{

    public static void main(String[] args) 
    {
        {
         EncapsulationDemo1 obj = new EncapsulationDemo1("Mario",5000.00f,1000.00f);
         obj.setEmpName("Mario");
         obj.setbsal(5000.00f);
         obj.setbonous(1000.00f);
         System.out.println("Employee name is " +obj.getEmpName());
         System.out.println("Salary is " +obj.getbsal());
         System.out.println("Bonous is " +obj.getbonous());
         obj.setBonousAmount();
        }
    }
}
