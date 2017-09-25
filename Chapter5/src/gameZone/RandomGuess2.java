package gameZone;

import java.util.Scanner;
import java.util.Random;

public class RandomGuess2 {

	public static void main(String[] args) 
	{
		Random rand = new Random();
		
		int Num;
		int numberGuess = rand.nextInt(10);
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter a number between 1 and 10 >> ");
		Num = input.nextInt();
		System.out.println("The number is " + numberGuess);
		
		if(Num == numberGuess)
		{
			System.out.println("You got it right!");
		}
		if(Num >= numberGuess)
		{
			System.out.println("Your guess was to high.");
		}
		if(Num <= numberGuess)
		{
			System.out.println("Your guess was to low.");
		}
	
	}

}
