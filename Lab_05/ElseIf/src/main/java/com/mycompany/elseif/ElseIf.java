
package com.mycompany.elseif;
public class ElseIf
{
    public static void main(String[] args)
    {
     char grade ='A';
     if(grade=='A')
	{
	System.out.println("Excellent!");
        }
     else if(grade=='D')
        {
         System.out.println("You passed");
        }
     else if(grade=='F')
     {
        System.out.println("Better try again");
     }
     else
     {
         System.out.println("Invalid grade");
         
     }
	System.out.println("Your grade is " + grade);

        
     }
}
