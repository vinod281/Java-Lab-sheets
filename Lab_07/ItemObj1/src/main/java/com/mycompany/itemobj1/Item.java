
package com.mycompany.itemobj1;

public class Item
{
    protected int location;
    protected String description;
    
    public Item(int location,String description)
    {
        this.location=location;
        this.description=description;
    }
    public void setLocation(int a)
    {
        location=a;
    }
    public int getLocation()
    {
        return location;
    }
    public void setDescription(String b)
    {
        description=b;
    }
    public String getDescription()
    {
        return description;
    }
    
}
