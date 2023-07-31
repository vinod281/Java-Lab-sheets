
package com.mycompany.itemobj1;

public class ItemObj1 
{

    public static void main(String[] args) 
    {
        Monster m=new Monster(10300,"Kottawa");
      
        m.setLocation(10345);
        m.setDescription("Pannipitiya");
        System.out.println("Location is "+m.getLocation());
        System.out.println("Description is "+m.getDescription());
    }
}
