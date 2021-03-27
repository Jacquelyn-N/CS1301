package CS1301Lab;

import java.util.Scanner;

/*
*Jacquelyn Nguyen
*CS 1301
*March 10, 2021
*
*Lab08 Program 2
*/

public class GradesAverage

{
	
    public static void main(String[] args) 
    
    {
    	try (Scanner input = new Scanner(System.in)) 
    	
    	{
				
    		{
    			System.out.println("Enter your name: ");
    			String name = input.next();
				    
    			System.out.println("Enter grades in three subjects: ");
    			double gradeOne = input.nextDouble();            
    			double gradeTwo = input.nextDouble();
    			double gradeThree = input.nextDouble();

    			double gradeAverage = (gradeOne + gradeTwo + gradeThree) / 3;

    			System.out.print("\n");
    			System.out.println("Name: " +name);
    			System.out.println("Average: " +gradeAverage);
				
			}
		}
    }
}
