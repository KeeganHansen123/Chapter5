package excercises;

import java.util.Scanner;

public class Pay {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int skillLevel;
		int hoursWorked;
		double regularPay;
		double overtime;
		double overtimeWorked;
		String askOTime;
		
		System.out.println("What is their skill level? >> ");
		skillLevel = input.nextInt();
		
		if(skillLevel == 1)
		{
			double hourlyPay1 = 17.00;
			System.out.println("How many hours have they worked? >> ");
			hoursWorked = input.nextInt();
			regularPay = hourlyPay1 * 40;
			overtime = hourlyPay1 * 1.5; 
			
			
			System.out.println("You have worked " + hoursWorked + " hours. You are paid $" + hourlyPay1 + " an hour."
					+ " Your regular pay for 40 hours worked is $" + regularPay);
		}
		if(skillLevel == 2)
		{
			double hourlyPay1 = 20.00;
			System.out.println("How many hours have they worked? >> ");
			hoursWorked = input.nextInt();
			regularPay = hourlyPay1 * 40;
			overtime = hourlyPay1 * 1.5;
		
			System.out.println("You have worked " + hoursWorked + " hours. You are paid $" + hourlyPay1 + " an hour."
					+ " Your regular pay is for 40 hours worked is $" + regularPay);
		}
		if(skillLevel == 3)
		{
			double hourlyPay1 = 22.00;
			System.out.println("How many hours have they worked? >> ");
			hoursWorked = input.nextInt();
			regularPay = hourlyPay1 * 40;
			overtime = hourlyPay1 * 1.5;
			
			System.out.println("You have worked " + hoursWorked + " hours. You are paid $" + hourlyPay1 + " an hour."
					+ " Your regular pay is for 40 hours worked is $" + regularPay);
		}
		
	}


}
