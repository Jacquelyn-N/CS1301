package CS1301Lab;

import java.util.Scanner; 
import java.util.Random;

/*
*Jacquelyn Nguyen
*CS 1301
*March 24, 2021
*
*Lab09 Program 1
*/

public class Blackjack_Jr 

{
	
public static void main (String[] args)

	{
	
	Scanner humanCard = new Scanner(System.in);
	
	Random rand = new Random();
		
		{		
			System.out.println("Blackjack Jr!");
			System.out.println("");
			System.out.println("Please enter two card values between 1-10: ");
			int humanCard1 = humanCard.nextInt();            
			int humanCard2 = humanCard.nextInt();
			
			
			while((humanCard1 < 1 || humanCard1 > 10) || (humanCard2 < 1 || humanCard2 > 10))
			
				{
					System.out.println("Please enter two card values between 1-10: ");
					
					humanCard1 = humanCard.nextInt();
					humanCard2 = humanCard.nextInt();
				
				}
	
			int humanTotal = humanCard1 + humanCard2;
			
			int dealerCard1 = 1 + rand.nextInt(10);
			int dealerCard2 = 1 + rand.nextInt(10);
			int dealerTotal = dealerCard1 + dealerCard2;
			
			System.out.println();
			System.out.println("You drew " +humanCard1+ " and " +humanCard2+ ".");
			System.out.println("Your total is " +humanTotal+ ".");
			System.out.println();
			System.out.println("The dealer drew " +dealerCard1+ " and " +dealerCard2+ ".");
			System.out.println("The dealer's total is " +dealerTotal+ ".");
			System.out.println();
			
			if(humanTotal > dealerTotal)
				System.out.println("You win!");
			
			else if(dealerTotal > humanTotal)
				System.out.println("You lose!");
			
			else
				System.out.println("Draw!");
			
		}
		
	}
	
}
