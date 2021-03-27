package CS1301Homework;

///////////////////////////////////////////////////////
//CS 1301 - Homework 05                              //
//Name: Jacquelyn Nguyen                             //
//Lab Time: Wednesday 9:00-10:40                     //
//Program Description: Homework 05 - Bonus           //
///////////////////////////////////////////////////////

public class NumberGrid 

{

	public static void printGrid(int row, int column)
	
	{
		
		for(int one = 1; one <= row;one++)
			
		{
			for(int two = 1; two <= column;two++)
				
			{
				
			System.out.print(((one-row) + (row * two) +"\t"));
			
			}
			
			System.out.println();
		}
		
	}
	public static void main(String[] args)
		
	{
			
	printGrid(7, 11);
			
	}
		
}
	