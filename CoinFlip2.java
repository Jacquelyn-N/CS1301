package CS1301Homework;

///////////////////////////////////////////////////////
//CS 1301 - Homework 07                              //
//Name: Jacquelyn Nguyen                             //
//Lab Time: Wednesday 9:00-10:40                     //
//Program Description: Homework 07 Program 1         //
///////////////////////////////////////////////////////

import java.util.Scanner;

public class CoinFlip2 

{
	
	public static void main(String[] args) 
	
	{

        Scanner scanner = new Scanner(System.in);
        boolean finished = false;
        String coinlanded = "";
        String userInput = "";

        while (finished != true) 
        
        	{
	            System.out.println("Enter Heads or Tails: ");
	            userInput = scanner.nextLine();
	
	            if (userInput.equalsIgnoreCase("heads") || userInput.equalsIgnoreCase("tails")) 
	            
	            	{
	            		finished = true;
	            	} 
	            
	            else 
	            	{
	            		System.out.println("Please enter heads or tails");
            
	            	}
        	}

        double randomNumber = Math.random();
       
        if (randomNumber > 0.5) 
        
        	{
            	coinlanded = "heads";
        	} 
        
        else 
        
        	{
            
        	coinlanded = "tails";
        
        	}

       if (coinlanded.equalsIgnoreCase(userInput))
       
       		{
           	
    	   		System.out.println("You win!");
       		}
       
       else 
       		{
           
    	   		System.out.println("You lose!");
       		}

    }

}
