package excercises;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num;
		
		System.out.println("Plaese enter a number: ");
		num = input.nextInt();
		
		if(num % 2 == 0)
		{
			System.out.println("Your number is even");
		}
		else
		{
			System.out.println("Your number is odd");
		}
	}

}
