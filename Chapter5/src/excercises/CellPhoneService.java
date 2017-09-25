package excercises;

import java.util.Scanner;

public class CellPhoneService {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		String planType;
		String choiceYes;
		
		System.out.println("Thank you for chosing Horizen Phones");
		System.out.println("What type of plan are you looking for? A, B, C, D, E, or F >> "); 
		planType = input.nextLine();
		
		if("A".equalsIgnoreCase(planType))
		{
			System.out.println("Thats less than 500 minutes of talk with no text or data at $49 a month. Do you want this plan?");
			choiceYes = input.nextLine();
			
			if("yes".equalsIgnoreCase(choiceYes))
			{
				System.out.println("Thank you!");
			}
			else
			System.out.println("Please resart the program");
		}	
	
		if("B".equalsIgnoreCase(planType))
		{
			System.out.println("Thats less than 500 minutes of talk with text at $55 a month. Do you want this plan?");
			choiceYes = input.nextLine();
			
			if("yes".equalsIgnoreCase(choiceYes))
			{
				System.out.println("Thank you!");
			}
			else
			{
			System.out.println("Please resart the program");
			}		
		}
		if("C".equalsIgnoreCase(planType))
		{
			System.out.println("Thats 500 or more minutes of talk with no data at $61 a month. Do you want this plan?");
			choiceYes = input.nextLine();
			
			if("yes".equalsIgnoreCase(choiceYes))
			{
				System.out.println("Thank you!");
			}
			else
			{
			System.out.println("Please resart the program");
			}		
		}
		if("D".equalsIgnoreCase(planType))
		{
			System.out.println("Thats 500 or more minutes of talk with 100 text messages at $70 a month. Do you want this plan?");
			choiceYes = input.nextLine();
			
			if("yes".equalsIgnoreCase(choiceYes))
			{
				System.out.println("Thank you!");
			}
			else
			{
			System.out.println("Please resart the program");
			}		
		}
		if("E".equalsIgnoreCase(planType))
		{
			System.out.println("This plan is for if you need data. This plan has 2 gigabytes of data at $79. "
					+ "Do you want this plan?");
			choiceYes = input.nextLine();
			
			if("yes".equalsIgnoreCase(choiceYes))
			{
				System.out.println("Thank you!");
			}
			else
			{
			System.out.println("Please resart the program");
			}		
		}
		if("F".equalsIgnoreCase(planType))
		{
			System.out.println("This plan is for if you need data. This plan has 2 gigabytes or more of data at $87. "
					+ "Do you want this plan?");
			choiceYes = input.nextLine();
			
			if("yes".equalsIgnoreCase(choiceYes))
			{
				System.out.println("Thank you!");
			}
			else
			{
			System.out.println("Please resart the program");
			}		
		}
		

	}
}