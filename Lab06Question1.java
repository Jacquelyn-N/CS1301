package CS1301Lab;
/*
*Jacquelyn Nguyen
*CS 1301
*February 18, 2021
*
*Lab06 Question 1
*/

public class Lab06Question1 {
	public static void main(String[] args) 
	{
		int exp1=(101+0)/3;
		double exp2=3.0e-6*10000000.1;
		boolean exp3=true && true;
		boolean exp4=false && true;
		boolean exp5=(false && false) || (true && true);
		boolean exp6=(false || false) && (true && true);
		
		System.out.println("(101+0)/3 = "+exp1);
		System.out.println("3.0e-6*10000000.1 = "+exp2);
		System.out.println("true && true = "+exp3);
		System.out.println("false && true = "+exp4);
		System.out.println("(false && false) || (true && true) = "+exp5);
		System.out.println("(false || false) && (true && true) = "+exp6);
}
}