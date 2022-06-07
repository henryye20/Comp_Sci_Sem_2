import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Paladin p = new Paladin();
		System.out.println(p.getName());
		p.printArt();
		Warrior wa = new Warrior();
		System.out.println(wa.getName());
		wa.printArt();
		Wizard wi = new Wizard();
		System.out.println(wi.getName());
		wi.printArt();

		
	}
}
