package CS1301Lab;

import java.util.Scanner;

/*
*Jacquelyn Nguyen
*CS 1301
*March 10, 2021
*
*Lab08 Program 2
*/

public class SumProductMinMax3

{
	
    public static void main(String[] args) 
    
    {
    	try (Scanner input = new Scanner(System.in)) 
    	
    	{
				
    		{

    			System.out.println("Enter first integer: ");
    			int integerOne = input.nextInt();            
				    
    			System.out.println("Enter second integer: ");
    			int integerTwo = input.nextInt();
    			
    			System.out.println("Enter third integer: ");
    			int integerThree = input.nextInt();

    			int sum = integerOne + integerTwo + integerThree;
    			int product = integerOne * integerTwo * integerThree;
    			
    			int min = integerOne;
    				if (integerTwo < min)
    				{
    					min = integerTwo;
    				}
    				if (integerThree < min)
    				{
    					min = integerThree;
    				}
    				
    			int max = integerOne;
    				if (integerTwo > max)
    				{
    					max = integerTwo;
    				}
    				if (integerThree > max)
    				{
    					max = integerThree;
    				}

    			System.out.print("\n");
    			System.out.println("The sum is: " +sum);
    			System.out.println("The product is: " +product);
    			System.out.println("The min is: " +min);
    			System.out.println("The max is: " +max);
				
			}
		}
    }
}
