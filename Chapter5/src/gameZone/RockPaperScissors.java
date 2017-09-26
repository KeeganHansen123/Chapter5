package gameZone;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) 
	{
		Random rand = new Random();
		Scanner input = new Scanner(System.in);
		int choiceRPS;
		int compChoice = rand.nextInt(3)+1;
		
		
		System.out.println("Lets play Rock, Paper, Scissors!");
		System.out.println("Choose 1 for Rock, 2 for Paper, or 3 for Scissors (The computer will follow the same rules) >> ");
		choiceRPS = input.nextInt();
		
		if(choiceRPS == 1)
		{
			if(compChoice == 1)
			{
				System.out.println("It's a tie. The computer chose " + compChoice);
			}
			if(compChoice == 2)
			{
				System.out.println("You lose! HaHa! The computer chose " + compChoice);
			}
			if(compChoice == 3)
			{
				System.out.println("You win! Good Job! The computer chose " + compChoice);
			}
			
		}
		
		if(choiceRPS == 2)
		{
			if(compChoice == 2)
			{
				System.out.println("It's a tie. The computer chose " + compChoice);
			}
			if(compChoice == 3)
			{
				System.out.println("You lose! HaHa! The computer chose " + compChoice);
			}
			if(compChoice == 1)
			{
				System.out.println("You win! Good Job! The computer chose " + compChoice);
			}
			
		}
		
		if(choiceRPS == 3)
		{
			if(compChoice == 3)
			{
				System.out.println("It's a tie. The computer chose " + compChoice);
			}
			if(compChoice == 1)
			{
				System.out.println("You lose! HaHa! The computer chose " + compChoice);
			}
			if(compChoice == 2)
			{
				System.out.println("You win! Good Job! The computer chose " + compChoice);
			}
			
		}
		
		
	}

}
