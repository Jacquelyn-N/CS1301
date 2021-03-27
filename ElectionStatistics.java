package CS1301Homework;

import java.util.Scanner;

class ElectionStatistics 

{
    public static void main(String[] args) 
    
    {
       
            Scanner input = new Scanner(System.in);
        {
            System.out.println("Enter Party One: ");
            String partyOne = input.next();
            partyOne = partyOne + input.nextLine();
            System.out.println("Enter Party One Votes: ");
            double partyOneVotes = input.nextDouble();

            System.out.println("Enter Party Two: ");
            String partyTwo = input.next();
            partyTwo = partyTwo + input.nextLine();             
            System.out.println("Enter Party Two Votes: ");
            double partyTwoVotes = input.nextDouble();

            System.out.println("Enter Party Three: ");
            String partyThree = input.next();
            partyThree = partyThree + input.nextLine();
            System.out.println("Enter Party Three Votes: ");
            double partyThreeVotes = input.nextDouble();

            double totalVotes = partyOneVotes + partyTwoVotes + partyThreeVotes;
            
            double partyOnePercent = partyOneVotes/totalVotes*100;
            System.out.println("The " +partyOne + " got " + partyOnePercent + " percent of the vote.");

            double partyTwoPercent = partyTwoVotes/totalVotes*100;
            System.out.println("The " +partyTwo + " got " + partyTwoPercent + " percent of the vote.");

            double partyThreePercent = partyThreeVotes/totalVotes*100;
            System.out.println("The " +partyThree + " got " + partyThreePercent + " percent of the vote.");
        
        }

    }
}