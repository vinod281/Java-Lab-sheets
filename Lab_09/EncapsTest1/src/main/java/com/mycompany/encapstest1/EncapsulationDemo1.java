
package com.mycompany.encapstest1;


    public class EncapsulationDemo1
{
    private String empName;
  
    private float bsal,bonous,newsal;
    
    //constructor
    public EncapsulationDemo1(String empName,float bsal,float bonous)
    {
        this.empName=empName;
       
        this.bsal=bsal;
        this.bonous=bonous;
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
   
    public void setbsal(float s)
    {
        bsal=s;
    }

    public float getbsal()
    {
        return bsal;
    }
    public void setbonous(float b)
    {
        bonous=b;
    }

    public float getbonous()
    {
        return bonous;
    }
public void setBonousAmount()
{
    newsal=bonous+bsal;
    System.out.println("Bonous Amount is " +newsal);
}
    
}

    

