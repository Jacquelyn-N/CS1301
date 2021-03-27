package CS1301Homework;

///////////////////////////////////////////////////////
//CS 1301 - Homework 05                              //
//Name: Jacquelyn Nguyen                             //
//Lab Time: Wednesday 9:00-10:40                     //
//Program Description: Homework 05 - Program #1      //
///////////////////////////////////////////////////////

public class payroll

{

	public static void main (String[] args)
	
	{
			
			String empName = "Jacquelyn";
			int hoursWorked = 80;
			double hourlyRate = 25.5;
			double fedTax = 8;
			
			double grossPay;
			grossPay = hourlyRate * hoursWorked;
				
			double taxDeduct;
			taxDeduct = (fedTax/100) * grossPay;
			
			double netPay;
			netPay = grossPay - taxDeduct;
			
			System.out.println("Employee's First Name: " +empName);
			System.out.println("Total Hours Worked Biweekly: " +hoursWorked);
			System.out.println("Hourly Pay Rate: $" +hourlyRate);
			System.out.println("Gross Pay: $" +grossPay);
			System.out.println("Tax Deducted: $" +taxDeduct);
			System.out.println("Net Pay: $" +netPay);
	
	}
	
}
