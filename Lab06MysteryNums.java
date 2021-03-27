package CS1301Lab;
/*
*Jacquelyn Nguyen
*CS 1301
*February 18, 2021
*
*Lab06 Question 1B
*/

public class Lab06MysteryNums {
	public static void main(String[] args) {
		int x = 15; sentence(x, 42); //
		int y = x - 5; sentence(y, x + y); //
		}
		public static void sentence(int num1, int num2) {
		System.out.println(num1 + " " + num2); }
		
}

/*
The two values printed are:
(15,42)
(10,25)
*/