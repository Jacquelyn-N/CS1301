package CS1301Homework;

///////////////////////////////////////////////////////
//CS 1301 - Homework 06                              //
//Name: Jacquelyn Nguyen                             //
//Lab Time: Wednesday 9:00-10:40                     //
//Program Description: Homework 06 Program 2         //
///////////////////////////////////////////////////////

public class PrintNumberToWordie2SwitchOnly

{
	
	public static void main(String[] args)
	
	{
		int num = 10;
		int divisible = num % 2;
		
		switch(num)
		
		{
			
		case 1:
			System.out.println("Enter number: " +num);
			System.out.println("ONE");
		break;
			
		case 2:
			System.out.println("Enter number: " +num);
			System.out.println("TWO");
		break;
				
		case 3:
			System.out.println("Enter number: " +num);
			System.out.println("THREE");
		break;	
		
		case 4:
			System.out.println("Enter number: " +num);
			System.out.println("FOUR");
		break;	
			
		case 5:
			System.out.println("Enter number: " +num);
			System.out.println("FIVE");
		break;	
			
		case 6:
			System.out.println("Enter number: " +num);
			System.out.println("SIX");
		break;	
			
		case 7:
			System.out.println("Enter number: " +num);
			System.out.println("SEVEN");
		break;	

		case 8:
			System.out.println("Enter number: " +num);
			System.out.println("EIGHT");
		break;	
			
		case 9:
			System.out.println("Enter number: " +num);
			System.out.println("NINE");
		break;	
			
		case 10:
			System.out.println("Enter number: " +num);
			System.out.println("TEN");
		break;	
			
		}
		
		switch (divisible)
		
		{
		
		case 0:
			System.out.println(num+ " is divisible by 2");
		break;
		
		default:
			System.out.println(num+ " is not divisible by 2");
		break;
		
		}
			
	}

}
