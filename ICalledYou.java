package CS1301Homework;

///////////////////////////////////////////////////////
//CS 1301 - Homework 05                              //
//Name: Jacquelyn Nguyen                             //
//Lab Time: Wednesday 9:00-10:40                     //
//Program Description: Homework 05 - Program #2      //
///////////////////////////////////////////////////////

public class ICalledYou

{
	
	public static void main(String[] args)
	
	{
		printInitials();
		System.out.println("\n");
		printProduct();
		System.out.println("\n");
		printBinary();
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
	
	public static void printProduct()
	
	{

		int one = 7;
		int two = 11;
		int productTotal = one * two;
				
		System.out.println("First Numnber: " +one);
					
		System.out.println("Second Number: " +two);

		System.out.println("Product of Two Numbers: " +productTotal);
	
	}
	

	public static void printBinary() 
	
	{
		int one = 7;
		int two = 11;
		String binary = Integer.toBinaryString(one * two);
		
		System.out.println("Binary Representation of Product: " +(binary));
	}
	
}
