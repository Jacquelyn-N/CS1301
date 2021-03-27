package CS1301Lab;

import java.util.Scanner;

/*
*Jacquelyn Nguyen
*CS 1301
*March 10, 2021
*
*Lab08 Program 2
*/

public class Add2Integers

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

    			int sum = integerOne + integerTwo;

    			System.out.print("\n");
    			System.out.println("The sum is: " +sum);
				
			}
		}
    }
}
