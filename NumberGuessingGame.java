package CS1301Homework;

///////////////////////////////////////////////////////
//CS 1301 - Homework 08                              //
//Name: Jacquelyn Nguyen                             //
//Lab Time: Wednesday 9:00-10:40                     //
//Program Description: Homework 08                   //
///////////////////////////////////////////////////////

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame 

{

	public static void main(String[] args)
	
	{
		
		Random random = new Random();
		Scanner input = new Scanner(System.in);
		
		int randomNumber = 1 + random.nextInt(100);
		int turns = 10;
		
		System.out.println("Welcome to the number guessing game where you will guess a number between 1 and 100.");
		
		while(turns != 0)
			
			{
			
			System.out.println();
			System.out.println("What is your guess?");
			int guess = input.nextInt();
			
			if(guess > randomNumber)
				
				{
				
				System.out.println("Too high!");
				
				}
			
			if(guess < randomNumber)
				
				{
					
					System.out.println("Too low!");
					
				}
			
			else if(guess == randomNumber)
				
				{
					
					winnerMethod(turns);
					
				}
			
			turns--;
			
			}
		
		loserMethod();
		
	}
	
	public static void winnerMethod(int turns) 
	
	{
		
		System.out.println();
		System.out.println("Congratulations, you won the game! You guessed my number in " +(10 - turns +1)+ " guesses!");
		System.out.println();
		System.out.println("Thanks for playing the guessing game!");
		System.exit(0);
		
		
	}
	
	public static void loserMethod()
	
	{
		
		System.out.println();
		System.out.println("Sorry, you lost the game!");
		System.out.println();
		System.out.println("Thanks for playing the number guessing game!");
		System.exit(0);
		
	}
	
}
