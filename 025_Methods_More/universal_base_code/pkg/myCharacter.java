package pkg;
import java.util.Scanner;
import java.util.Random;


public class myCharacter {
	String role = new String("no role");
	int strength = 0;
	int dexterity = 0;
	int intelligence = 0;
	int constitution = 0;
	int charisma = 0;
	
	public void myToString() {
		System.out.println("Your role is " + role);
		System.out.println("Your strength trait is " + strength);
		System.out.println("Your dexterity trait is " + dexterity);
		System.out.println("Your intelligence trait is " + intelligence);
		System.out.println("Your constitution trait is " + constitution);
		System.out.println("Your charisma trait is " + charisma);
	}

	public String setRole(String pick) {
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
		return role;
	}
	public int setStrength(int a) {
		strength = a;
		return strength;
	}
	
	public int setDexterity(int a) {
		dexterity = a;
		return dexterity;
	}
	
	public int setIntelligence(int a) {
		intelligence = a;
		return intelligence;
	}
	
	public int setConstitution(int a) {
		constitution = a;
		return constitution;
	}
	
	public int setCharisma(int a) {
		charisma = a;
		return charisma;
	}
	public boolean setAll(String ab, int a, int b, int c, int d, int e) {
		System.out.println("Your role is " + ab);
		System.out.println("Your Strength is " + a);
		System.out.println("Your Dexterity is " + b);
		System.out.println("Your Intelligence is " + c);
		System.out.println("Your Constitution is " + d);
		System.out.println("Your Charisma is " + e);
		return true;
	}
}
	
