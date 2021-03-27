package CS1301Homework;

///////////////////////////////////////////////////////
//CS 1301 - Homework 07                              //
//Name: Jacquelyn Nguyen                             //
//Lab Time: Wednesday 9:00-10:40                     //
//Program Description: Homework 07 Program 2         //
///////////////////////////////////////////////////////

import java.util.Scanner;

public class GradeReporting 

{

	public static void main(String[] args) 
	
	{
        
		Scanner scanner = new Scanner(System.in);
        int Grade = 0;

        System.out.println("Please Enter Grade:");
        Grade = scanner.nextInt();
        
        while(Grade<0 | Grade>100)
        	
        {
        	
        	System.out.println("Please Enter Grade between 0 and 100");
        	Grade = scanner.nextInt();
        	
        }
               	

        switch ((int) Grade/10) 
        
        {
            case 10: System.out.println ("Perfect Score!");
            System.exit(0);
            
            case 9: System.out.println ("Well above Average. Excellent!");
            System.exit(0);
            
            case 8: System.out.println ("Above Average, Nice Job!");
            System.exit(0);
            
            case 7: System.out.println ("Average."); 
            System.exit(0);
           
            case 6: System.out.println ("Below Average. See Instructor.");
            System.exit(0);
           
            default: System.out.println ("You are not comprehending I see.");
            System.exit(0);
        
        }
    
	}	

}
