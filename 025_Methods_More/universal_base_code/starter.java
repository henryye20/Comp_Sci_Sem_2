import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		myCharacter rol = new myCharacter();
		rol.myToString();
		System.out.println("Would you like to be a Wizard, Warrior, or Rogue?");
		String pick = sc.nextLine();
		String role = rol.setRole(pick);
		myCharacter frika = new myCharacter();
		boolean all = frika.setAll(role,1,2,3,4,5);
		
		
	}
}
