package excercises;

import java.util.Scanner;

public class CondoSales2 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String choiceView; 
		String addPart;
	
		System.out.println("Welcome to Summerdale Condo's");
		System.out.println("What type of view would you like. Park, Golf, or Lake? >> ");
		choiceView = input.nextLine();
		System.out.println("Would you like a garage or parking space? Y/N >> ");
		addPart = input.nextLine();
		
		if("park".equalsIgnoreCase(choiceView))
		{
			int parkPrice = 150000;
			int garage = 5000;
			System.out.println("You chose " + choiceView + ".");
			
			if("yes".equalsIgnoreCase(addPart) || "Y".equalsIgnoreCase(addPart))
			{
				int totalPrice = parkPrice + garage;
				System.out.println("You chose to add a garage");
				System.out.println("Your total is $" + totalPrice);
			}
			else
			System.out.println("Your total is $" + parkPrice);						
		}
		if("golf".equalsIgnoreCase(choiceView))
		{
			int golfPrice = 170000;
			int garage = 5000;
			System.out.println("You chose " + choiceView + ".");
			
			if("yes".equalsIgnoreCase(addPart) || "Y".equalsIgnoreCase(addPart))
			{
				int totalPrice = golfPrice + garage;
				System.out.println("You chose to add a garage");
				System.out.println("Your total is $" + totalPrice);
			}
			else
			System.out.println("Your total is $" + golfPrice);
		}
		if("lake".equalsIgnoreCase(choiceView))
		{
			int lakePrice = 210000;
			int garage = 5000;
			System.out.println("You chose " + choiceView + ".");
			
			if("yes".equalsIgnoreCase(addPart) || "Y".equalsIgnoreCase(addPart))
			{
				int totalPrice = lakePrice + garage;
				System.out.println("You chose to add a garage");
				System.out.println("Your total is $" + totalPrice);
			}
			else
			System.out.println("Your total is $" + lakePrice);
		}
	
	}


}
