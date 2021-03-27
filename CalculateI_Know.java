package CS1301Lab;

import java.util.Scanner;

/*
*Jacquelyn Nguyen
*CS 1301
*March 24, 2021
*
*Lab09 Program 2
*/

public class CalculateI_Know 

{
	public static void main(String[] args)
	
	{
		
		Scanner input = new Scanner(System.in);
				
		System.out.println("Please enter three numbers: ");
		
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		
		System.out.println("");
		System.out.println("Largest sum: " +calcLargestSum(a, b, c));
		System.out.println("");
		System.out.println("Middle number: " +calcMiddleNumber(a, b, c));
		
	}
	
	public static int calcLargestSum(int a, int b, int c)
	
	{
		
			int max = a;
			if (b > max)
			{
				max = b;
			}
			if (c > max)
			{
				max = c;
			}
			
			return (max + calcMiddleNumber(a, b, c));
		
	}
	
	public static int calcMiddleNumber (int a, int b, int c)
	
	{
		
        if ((a < b && b < c) || (c < b && b < a))
            return b;
  
        else if ((b < a && a < c) || (c < a && a < b))
        return a;
  
        else
        return c;
		
	}

}
