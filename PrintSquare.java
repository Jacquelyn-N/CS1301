package CS1301Lab;

import java.util.Scanner;

/*
*Jacquelyn Nguyen
*CS 1301
*March 10, 2021
*
*Lab08 Program 1
*/

public class PrintSquare

{
	
	public static void main(String[] args)

	{
		
		try (Scanner input = new Scanner(System.in)) 
		
			{
			
			int number = 0;
					
			System.out.print("Please type a number: ");
			number = input.nextInt();
					
			int squareTotal =0;
			squareTotal = number * number;

			System.out.println("The square of that number is " +squareTotal);
				
			
			}
		
		}

}
