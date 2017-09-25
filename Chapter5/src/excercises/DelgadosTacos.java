package excercises;
import java.util.Scanner;
import java.text.DecimalFormat;
public class DelgadosTacos {

	public static void main(String[] args) 
	{
		int choice1;
		int foodNumber;
		Scanner input = new Scanner(System.in);
		System.out.print("Please choose a 1 for taco, 2 for burrito, 3 for enchilada, ");
		System.out.println(" 4 for posole stew, 5 for guacamole and chips, 6 for quesadilla, ");
		System.out.println(" 7 for nachos, 8 for tamales, 9 for rice pudding, or 10 for a vampire taco. >> ");
		choice1 = input.nextInt();
		if(choice1 == 1)
		{
			System.out.println("You chose tacos.");
			System.out.println("How many do you want?: ");
			foodNumber = input.nextInt();
			displayPrice(choice1, foodNumber);
		}
		if(choice1 == 2)
		{
			System.out.println("You chose burritos.");
			System.out.println("How many do you want?: ");
			foodNumber = input.nextInt();
			displayPrice(choice1, foodNumber);
		}
		if(choice1 == 3)
		{
			System.out.println("You chose enchiladas.");
			System.out.println("How many do you want?: ");
			foodNumber = input.nextInt();
			displayPrice(choice1, foodNumber);
		}
		if(choice1 == 4)
		{
			System.out.println("You chose posle stew.");
			System.out.println("How many do you want?: ");
			foodNumber = input.nextInt();
			displayPrice(choice1, foodNumber);
		}
		if(choice1 == 5)
		{
			System.out.println("You chose guacamole and chips.");
			System.out.println("How many do you want?: ");
			foodNumber = input.nextInt();
			displayPrice(choice1, foodNumber);
		}
		if(choice1 == 6)
		{
		System.out.println("You chose quesadillas.");
		System.out.println("How many do you want?: ");
		foodNumber = input.nextInt();
		displayPrice(choice1, foodNumber);
		}
		if(choice1 == 7)
		{
		System.out.println("You chose nachos.");
		System.out.println("How many do you want?: ");
		foodNumber = input.nextInt();
		displayPrice(choice1, foodNumber);
		}
		if(choice1 == 8)
		{
		System.out.println("You chose tamales.");
		System.out.println("How many do you want?: ");
		foodNumber = input.nextInt();
		displayPrice(choice1, foodNumber);
		}
		if(choice1 == 9)
		{
		System.out.println("You chose rice pudding.");
		System.out.println("How many do you want?: ");
		foodNumber = input.nextInt();
		displayPrice(choice1, foodNumber);
		}
		if(choice1 == 10)
		{
		System.out.println("You chose vampire tacos.");
		System.out.println("How many do you want?: ");
		foodNumber = input.nextInt();
		displayPrice(choice1, foodNumber);
		}
	}
	public static void displayPrice(int choice1, int foodNumber)
	{
		DecimalFormat df = new DecimalFormat("0.00");
		
		double tacoPrice = 1.99;
		double burritoPrice = 2.99;
		double enchiladaPrice = 2.99;
		double posoleStewPrice = 2.50;
		double guacChipsPrice = 1.99;
		double quesadillasPrice = 2.99;
		double nachosPrice = 2.50;
		double TamalesPrice = 2.50;
		double ricePuddingPrice = 1.50;
		double vampTacoPrice = 3.99;
		
		if(choice1 == 1)
		{
			
			double TAX_RATE = .75;
			double total;
			tacoPrice = tacoPrice * foodNumber;
			total = tacoPrice + TAX_RATE;
			System.out.println("That will cost $" + total);
		}
		if(choice1 == 2)
		{
			double TAX_RATE = .75;
			double total;
			burritoPrice = burritoPrice * foodNumber;
			total = burritoPrice + TAX_RATE;
			System.out.println("That will cost $" + total);
		}
		if(choice1 == 3)
		{
			double TAX_RATE = .75;
			double total;
			enchiladaPrice = enchiladaPrice * foodNumber;
			total = enchiladaPrice + TAX_RATE;
			System.out.println("That will cost $" + total);
		}
		if(choice1 == 4)
		{
			double TAX_RATE = .75;
			double total;
			posoleStewPrice = posoleStewPrice * foodNumber;
			total = posoleStewPrice + TAX_RATE;
			System.out.println("That will cost $" + total);
		}
		if(choice1 == 5)
		{
			double TAX_RATE = .75;
			double total;
			guacChipsPrice = guacChipsPrice * foodNumber;
			total = guacChipsPrice + TAX_RATE;
			System.out.println("That will cost $" + total);
		}
		if(choice1 == 6)
		{
			double TAX_RATE = .75;
			double total;
			quesadillasPrice = quesadillasPrice * foodNumber;
			total = quesadillasPrice + TAX_RATE;
			System.out.println("That will cost $" + total);
		}
		if(choice1 == 7)
		{
			double TAX_RATE = .75;
			double total;
			nachosPrice = nachosPrice * foodNumber;
			total = nachosPrice + TAX_RATE;
			System.out.println("That will cost $" + total);
		}
		if(choice1 == 8)
		{
			double TAX_RATE = .75;
			double total;
			TamalesPrice = TamalesPrice * foodNumber;
			total = TamalesPrice + TAX_RATE;
			System.out.println("That will cost $" + total);
		}
		if(choice1 == 9)
		{
			double TAX_RATE = .75;
			double total;
			ricePuddingPrice = ricePuddingPrice * foodNumber;
			total = ricePuddingPrice + TAX_RATE;
			System.out.println("That will cost $" + total);
		}
		if(choice1 == 10)
		{
			double TAX_RATE = .75;
			double total;
			vampTacoPrice = vampTacoPrice * foodNumber;
			total = vampTacoPrice + TAX_RATE;
			System.out.println("That will cost $" + total);
		}
	}


}
