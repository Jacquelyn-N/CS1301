package CS1301Homework;

///////////////////////////////////////////////////////
//CS 1301 - Homework 06                              //
//Name: Jacquelyn Nguyen                             //
//Lab Time: Wednesday 9:00-10:40                     //
//Program Description: Homework 06 Program 4         //
///////////////////////////////////////////////////////

public class MyConversion 

{
	
	public static void main(String[] args)
	
	{
		int grade = 95;
		System.out.println("Enter Numerical Grade: " +grade);
	
		if(grade >= 90 && grade <= 100)
			System.out.println("Grade: A");
				    
		else if(grade >= 80 && grade <= 89)
			System.out.println("Grade: B");
			
		else if(grade >= 70 && grade <= 79)
			System.out.println("Grade: C");
		
		else if(grade >= 60 && grade <= 69)
			System.out.println("Grade: D");
		 
		else if(grade >= 50 && grade <= 59)	
			System.out.println("Grade: F");
		
		else	
			System.out.println("print invalid grade");
			
	}
			
}
