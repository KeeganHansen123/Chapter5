package tutorials;

import java.util.Scanner;

public class enterYourAge {

	public static void main(String[] args) 
	{
		int age; //
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your age? >>>>>");
		age = input.nextInt();
		if(age <=18)
		{
			System.out.println("User is less than 18.");
		}
		if (age >= 23 & age <= 30)
		{
			System.out.println("Your a legal adult.");
		}
		if (age >= 31 & age <= 50)
		{
			System.out.println("Your old.");
		}
		if (age >= 50 & age <= 65)
		{
			System.out.println("Your really old.");
		}
		if (age >= 66 & age <= 100)
		{
			System.out.println("Your really really old.");
		}
	}

}
