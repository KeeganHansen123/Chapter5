package excercises;

import java.util.Scanner;

public class AscendingAndDescending {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num;
		int num2;
		int num3;
		
		System.out.println("Enter a number: ");
		num = input.nextInt();
		System.out.println("Enter another number: ");
		num2 = input.nextInt();
		System.out.println("Enter another number: ");
		num3 = input.nextInt();
		
		System.out.println(num + "       " + num3);
		System.out.println(num2 + "      " + num2);
		System.out.println(num3 + "      " + num);
	}

}
