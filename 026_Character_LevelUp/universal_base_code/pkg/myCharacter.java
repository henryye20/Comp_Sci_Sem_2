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
	int level;
	int points;
	
	public myCharacter() {
		level = 0;
		points = 0;
	}
	public void myToString() {
		System.out.println("Your role is " + role);
		System.out.println("Your strength trait is " + strength);
		System.out.println("Your dexterity trait is " + dexterity);
		System.out.println("Your intelligence trait is " + intelligence);
		System.out.println("Your constitution trait is " + constitution);
		System.out.println("Your charisma trait is " + charisma);
	}
	public boolean checkPoints(int a) {
		boolean flag = true;
		if((a>10)||(a<0)) {
			flag = false;
		}
		else if(a>points) {
			flag = false;
		}
		return flag;
	}
	public static void levelup() {
		Scanner sc = new Scanner(System.in);
		if(level==0) {
			level = level +1;
			points = points + 25;
		}
		if(level>0) {
			level = level +1;
			points = points + 10;
		}
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
	private int setStrength(int a) {
		strength = a;
		return strength;
	}
	
	private int setDexterity(int a) {
		dexterity = a;
		return dexterity;
	}
	
	private int setIntelligence(int a) {
		intelligence = a;
		return intelligence;
	}
	
	private int setConstitution(int a) {
		constitution = a;
		return constitution;
	}
	
	private int setCharisma(int a) {
		charisma = a;
		return charisma;
	}
	public boolean setAll(String pick, int a, int b, int c, int d, int e) {
		
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
		
		setStrength(a);
		setDexterity(b);
		setIntelligence(c);
		setConstitution(d);
		setCharisma(e);
		
		return true;
	}
}
	
