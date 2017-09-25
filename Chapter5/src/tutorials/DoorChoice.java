package tutorials;

import javax.swing.JOptionPane;

public class DoorChoice {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String choiceString;
		int doorChoice;
		
		choiceString = JOptionPane.showInputDialog(null, "Pick a door any door, 1, 2, 3, 4",
				"Door Choice", JOptionPane.INFORMATION_MESSAGE);
		doorChoice = Integer.parseInt(choiceString);
		
		//if statement for door choice
		if(doorChoice == 1)
		{
			JOptionPane.showMessageDialog(null, "You win nothing!");
		}
		if(doorChoice == 2)
		{
			JOptionPane.showMessageDialog(null, "You win a new bike!");
		}
		if(doorChoice == 3)
		{
			JOptionPane.showMessageDialog(null, "You win a fish!");
		}
		if(doorChoice == 4)
		{
			JOptionPane.showMessageDialog(null, "You win nothing!");
		}
		if(doorChoice == 999)
		{
			JOptionPane.showMessageDialog(null, "This is a secret to everyone, don't tell!");
		}
	}
	

}
