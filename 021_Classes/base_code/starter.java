import java.util.Scanner;
import java.util.Random;

class Character {
	String Rogue = new String("Rogue");
	int str = 4;
	int dex = 8;
	int itl = 7;
	int con = 5;
	int chr = 7;
}
class starter {
	public static void main(String args[]) {
		// Your code goes below here
	Character x = new Character();
	System.out.println("Your role is " + x.Rogue);
	System.out.println("Your strength trait is " + x.str);
	System.out.println("Your dexterity trait is " + x.dex);
	System.out.println("Your intelligence trait is " + x.itl);
	System.out.println("Your constitution trait is " + x.con);
	System.out.println("Your charisma trait is " + x.chr);
	


		
	}
}
