package CS1301Homework;

///////////////////////////////////////////////////////
//CS 1301 - Homework 05                              //
//Name: Jacquelyn Nguyen                             //
//Lab Time: Wednesday 9:00-10:40                     //
//Program Description: Homework 05 - Program #1      //
///////////////////////////////////////////////////////

import java.util.Scanner;

public class payrollScanner 

{

	public static void main (String[] args)
	
	{
		try (Scanner input = new Scanner(System.in)) 
		
		{
			
			String empName;
			double hoursWorked;
			double hourlyRate;
			double fedTax;
			
			System.out.print("Enter Employee First Name: ");
			empName = input.next();
				
			System.out.print("Enter Total Hours Worked Biweekly: ");
			hoursWorked = input.nextDouble();
				
			System.out.print("Enter Hourly Pay Rate: ");
			hourlyRate = input.nextDouble();
				
			System.out.print("Federal Tax Rate: ");
			fedTax = input.nextDouble();
			
			double grossPay;
			grossPay = hourlyRate * hoursWorked;
				
			double taxDeduct;
			taxDeduct = (fedTax/100) * grossPay;
			
			double netPay;
			netPay = grossPay - taxDeduct;
			
			System.out.println("\n");
			System.out.println("Employee's First Name: " +empName);
			System.out.println("Total Hours Worked Biweekly: " +hoursWorked);
			System.out.println("Hourly Pay Rate: $" +hourlyRate);
			System.out.println("Gross Pay: $" +grossPay);
			System.out.println("Tax Deducted: $" +taxDeduct);
			System.out.println("Net Pay: $" +netPay);
		}
		
	}
	
}
