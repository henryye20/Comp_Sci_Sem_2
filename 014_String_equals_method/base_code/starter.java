import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("Would you like to be a Wizard, Warrior, or Rogue?");
		String pick = sc.nextLine();
		
		boolean wizard = (pick.equals("wizard"))||(pick.equals("Wizard"));
		boolean warrior = (pick.equals("warrior"))||(pick.equals("Warrior"));
		boolean rogue = (pick.equals("rogue"))||(pick.equals("Rogue"));
		
		if(wizard)
		{
			System.out.print("You've chosen the Wizard! Excelsior!");
		}
		else if(warrior)
		{
			System.out.print("You've chosen the Warrior! For honor!");
		}
		else if(rogue)
		{
			System.out.print("You've chosen the Rogue! How cunning!");
		}
		else
		{
			System.out.print("You've decided not to choose a role. Rerun program.");
		}
	}
}
