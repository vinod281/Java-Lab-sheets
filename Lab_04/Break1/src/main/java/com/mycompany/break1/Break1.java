

package com.mycompany.break1;

public class Break1
{
    public static void main(String[] ardgs)
    {
      int [] numbers = {10, 20, 30, 40, 50};
      for(int x : numbers )
      {
         if( x == 30 )
         {
	    break;
         }
         System.out.print( x );
         System.out.print("\n");
      }
          System.out.print("I’m  out of the Loop now");		 
   }
}
