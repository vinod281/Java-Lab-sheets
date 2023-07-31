

package com.mycompany.testenhanceforloop1;

public class TestEnhanceForLoop1
{
    public static void main(String[] ardgs)
    {
        int [] numbers = {10, 20, 30, 40, 50};
        for(int x:numbers)
        {
            System.out.print(x);
            System.out.println(",");
        }
        System.out.print("\n");
        String[]names={"James", "Larry", "Tom", "Lacy"};
        for(String name:names)
        {
            System.out.print(name);
            System.out.print(",");
        }
        
        
    }
}
