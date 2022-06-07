import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Role[] x = new Role[3];
		x[0] = new Paladin();
		x[1] = new Warrior();
		x[2] = new Wizard();
		
		System.out.println(x[0].getName());
		x[0].printArt();
		System.out.println(x[1].getName());
		x[1].printArt();
		System.out.println(x[2].getName());
		x[2].printArt();
		
	}
}
