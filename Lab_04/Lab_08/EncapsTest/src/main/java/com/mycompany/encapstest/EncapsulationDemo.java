
package com.mycompany.encapstest;

public class EncapsulationDemo
{
    private String empName;
    private int age;
    private float sal;
    
    //constructor
    public EncapsulationDemo(String empName,int age,float sal)
    {
        this.empName=empName;
        this.age=age;
        this.sal=sal;
    }

    //Getter and Setter methods

    public void setEmpName(String en)
    {
        empName=en;
    }

    public String getEmpName()
    {
        return empName;
    }
    public void setAge(int a)
    {
        age=a;
    }

    public int getage()
    {
        return age;
    }
    public void setsal(float s)
    {
        sal=s;
    }

    public float getsal()
    {
        return sal;
    }

    
}
