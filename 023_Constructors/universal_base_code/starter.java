import pkg.*;
import java.util.Scanner;
import java.util.Random;
 
class starter {
	
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		
		myCharacter funk = new myCharacter();
		
		
		System.out.println("Would you like to be a Wizard, Warrior, or Rogue?");
		String pick = sc.nextLine();
		
		myCharacter test = new myCharacter(pick);
		
		

		
	}
}
