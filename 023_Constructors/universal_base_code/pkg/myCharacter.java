package pkg;
import java.util.Scanner;
import java.util.Random;


public class myCharacter {
	String role;
	
	public myCharacter() {
		role = new String("No Role");

		}
		
	public myCharacter(String pick) {
		boolean wizard = (pick.equals("wizard"))||(pick.equals("Wizard"));
		boolean warrior = (pick.equals("warrior"))||(pick.equals("Warrior"));
		boolean rogue = (pick.equals("rogue"))||(pick.equals("Rogue"));
		
		if(wizard)
		{
			System.out.println("You've chosen the Wizard! Excelsior!");
			role = new String("Wizard");
		}
		else if(warrior)
		{
			System.out.println("You've chosen the Warrior! For honor!");
			role = new String("Warrior");
		}
		else if(rogue)
		{
			System.out.println("You've chosen the Rogue! How cunning!");
			role = new String("Rogue");
		}
		else
		{
			System.out.println("You've decided not to choose a role. Rerun program.");
			role = new String("No Role");

		}
		
		}
		
	}

