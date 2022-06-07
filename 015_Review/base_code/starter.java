import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// basic stuff
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = sc.nextLine();
		System.out.println("What is your title? Ex: Slayer of Dragons");
		String title = sc.nextLine();
		System.out.println("Would you like to be a Wizard, Warrior, or Rogue?");
		String pick = sc.nextLine();
		//roles
		boolean wizard = (pick.equals("wizard"))||(pick.equals("Wizard"));
		boolean warrior = (pick.equals("warrior"))||(pick.equals("Warrior"));
		boolean rogue = (pick.equals("rogue"))||(pick.equals("Rogue"));
		
		if(wizard)
		{
			System.out.println("You've chosen the Wizard! Excelsior!");
		}
		else if(warrior)
		{
			System.out.println("You've chosen the Warrior! For honor!");
		}
		else if(rogue)
		{
			System.out.println("You've chosen the Rogue! How cunning!");
		}
		else
		{
			System.out.println("You've decided not to choose a role. Rerun program.");
		}
		//skill points :(
		int pts = 25;
		System.out.println(" ");
		System.out.println("You have 25 skill points to spend in the following: Strength, Dexterity, Intelligence, Constitution, and Charisma. Spend them wisely.");
		System.out.println(" ");
		System.out.print("Strength (1-10): ");
		int str = sc.nextInt();
		sc.nextLine();
		if((str>10)||(str>pts))
		{
			System.out.print("Please input a smaller value. Strength (1-10): ");
			int str2 = sc.nextInt();
			str = str2;
		}
		System.out.println("You have " + (pts-str) + " left to spend.");
		System.out.println(" ");
		//
		System.out.print("Dexterity (1-10): ");
		int dex = sc.nextInt();
		sc.nextLine();
		if((dex>10)||(dex>(pts-str)))
		{
			System.out.print("Please input a smaller value. Dexterity (1-10): ");
			int dex2 = sc.nextInt();
			dex = dex2;
		}
		System.out.println("You have " + (pts-str-dex) + " left to spend.");
		System.out.println(" ");
		//
		System.out.print("Intelligence (1-10): ");
		int itl = sc.nextInt();
		sc.nextLine();
		if((itl>10)||(itl>(pts-str-dex)))
		{
			System.out.print("Please input a smaller value. Intelligence (1-10): ");
			int itl2 = sc.nextInt();
			itl = itl2;
		}
		System.out.println("You have " + (pts-str-dex-itl) + " left to spend.");
		System.out.println(" ");
		//
		System.out.print("Constitution (1-10): ");
		int con = sc.nextInt();
		sc.nextLine();
		if((con>10)||(con>(pts-str-dex-itl)))
		{
			System.out.print("Please input a smaller value. Constitution (1-10): ");
			int con2 = sc.nextInt();
			con = con2;
		}
		System.out.println("You have " + (pts-str-dex-itl-con) + " left to spend.");
		System.out.println(" ");
		//
		System.out.print("Charisma (1-10): ");
		int chr = sc.nextInt();
		sc.nextLine();
		if((chr>10)||(chr>(pts-str-dex-itl-con)))
		{
			System.out.print("Please input a smaller value. Charisma (1-10): ");
			int chr2 = sc.nextInt();
			chr = chr2;
		}
		System.out.println(" ");
		System.out.println(" ");
		//
		System.out.println("--------------------------------------------------");
		System.out.println("You are " + name + ", the " + title + " of CVHS");
		System.out.println("You're a " + title + " with the following stats!");
		System.out.println("Strength - " + str);
		System.out.println("Dexterity - " + dex);
		System.out.println("Intelligence - " + itl);
		System.out.println("Constitution - " + con);
		System.out.println("Charisma - " + chr);
	}
}
