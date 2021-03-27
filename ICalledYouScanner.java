package CS1301Homework;

import java.util.Scanner;

///////////////////////////////////////////////////////
//CS 1301 - Homework 05                              //
//Name: Jacquelyn Nguyen                             //
//Lab Time: Wednesday 9:00-10:40                     //
//Program Description: Homework 05 - Program #2      //
///////////////////////////////////////////////////////

public class ICalledYouScanner 

{
	
	public static void main(String[] args)
	
	{
		
		printInitials();
		System.out.println("\n");
		int x = printProduct();
		System.out.println("\n");
		printBinary(x);
	
	}
	
	public static void printInitials() 
	
		{
		
		System.out.println("    ___  _________");
		System.out.println("   |\\  \\|\\   ___  \\");    
		System.out.println("   \\ \\  \\ \\  \\\\ \\  \\");   
		System.out.println(" ___\\ \\  \\ \\  \\\\ \\  \\");
		System.out.println("|\\  \\\\_\\  \\ \\  \\\\ \\  \\"); 
		System.out.println("\\ \\________\\ \\__\\\\ \\__\\");
		System.out.println(" \\|________|\\|__| \\|__|");
		
		}
	
	public static int printProduct()
	
		{
		
		try (Scanner input = new Scanner(System.in)) 
		
			{
			
			int firstNumber = 0;
			int secondNumber = 0;
					
			System.out.print("Enter First Numnber: ");
			firstNumber = input.nextInt();
						
			System.out.print("Enter Second Number: ");
			secondNumber = input.nextInt();
					
			int productTotal =0;
			productTotal = firstNumber * secondNumber;

			System.out.println("Product of Entered Two Numbers: " +productTotal);
				
			return productTotal;
			
			}
		
		}

	public static void printBinary(int z) 
	
		{
		
		String s = Integer.toBinaryString(z);
		
		System.out.println("Binary Representation: " +(s));
		
		}
	
}
