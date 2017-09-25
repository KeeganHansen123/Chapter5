package excercises;
import java.util.Scanner;
public class PizzaChoice {

	public static void main(String[] args) 
	{
		String choiceYes;
		String toppingsChoice;
		String size;
		String pizzaKind;
		String choiceHotDog;
		double mediumCost = 9.99;
		double largeCost = 12.99;
		double smallCost = 6.99;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Would you like a pizza? Yes or No?>>>> ");
		choiceYes = input.nextLine();
		//this is where I am asking if they really want a pizza
		if("No".equalsIgnoreCase(choiceYes) || "N".equalsIgnoreCase(choiceYes))
		{
			System.out.print("Have a nice day!");
		}
		if("Yes".equalsIgnoreCase(choiceYes) || "Y".equalsIgnoreCase(choiceYes))
		{
			System.out.println("You said " + choiceYes + " to having pizza.");
			System.out.print("Please choose a size small, medium, or large? >>>>");
			size = input.nextLine();
			if("small".equals(size)||"Small".equals(size))
			{
				displayPizzaSize(size);
				displayPizzaType();
				displayPizzaPrice(size);
			}
			if("medium".equalsIgnoreCase(size) || "M".equalsIgnoreCase(size))
			{
				displayPizzaSize(size);
				displayPizzaType();
				displayPizzaPrice(size);
			}
			if("Large".equalsIgnoreCase(size) || "L".equalsIgnoreCase(size))
			{
				displayPizzaSize(size);
				displayPizzaType();
				displayPizzaPrice(size);
			}	
		}				
	}
	public static void displayPizzaSize(String size)
	{
		String pizzaKind;
		Scanner input = new Scanner(System.in);
		System.out.println("You said " + size + " pizza size.");
	}
	public static void displayPizzaType()
	{
		Scanner input = new Scanner(System.in);
		System.out.print("What kind of pizza do you want? Pepperoni, Sausage, Cheese?");
		String pizzaKind = input.nextLine();
		if(("Pepperoni".equalsIgnoreCase(pizzaKind) || "Sausage".equalsIgnoreCase(pizzaKind)) ||
				 "Cheese".equalsIgnoreCase(pizzaKind))
		{
			
		}
	}
	public static void displayPizzaPrice(String size)
	{
		double mediumCost = 9.99;
		double largeCost = 12.99;
		double smallCost = 6.99;
		
		if("small".equalsIgnoreCase(size))
		{
			System.out.print("Your total is " + smallCost);
		}
		if("medium".equalsIgnoreCase(size))
		{
			System.out.print("Your total is " +mediumCost);
		}
		if("large".equalsIgnoreCase(size))
		{
			System.out.print("Your total is " +largeCost);
		}
	}
	


}

