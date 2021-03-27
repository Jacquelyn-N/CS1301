package CS1301Homework;

///////////////////////////////////////////////////////
//CS 1301 - Homework 06                              //
//Name: Jacquelyn Nguyen                             //
//Lab Time: Wednesday 9:00-10:40                     //
//Program Description: Homework 06 Program 3         //
///////////////////////////////////////////////////////

public class MyGrades

{

	public static void main(String[] args)

	{
	
		int score = 92;
	
		switch ((int) score / 10)
	
		{
	
		case 10:
			System.out.println("Grade: A");
			break;
	
		case 9:
			System.out.println("Grade: A");
			break;
	
		case 8:
			System.out.println("Grade: B");
			break;
	
		case 7:
			System.out.println("Grade: C");
			break;
	
		case 6: 
			System.out.println("Grade: D");
			break;
	
		case 5:
			System.out.println("Grade: F");
			break;
	
		default:
			System.out.println("print invalid grade");
			break;
	
		}  

	} 

}

