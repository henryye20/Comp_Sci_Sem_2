import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Role pal = new Paladin();
		Creature zom = new Zombie();
		Creature spider = new Spider();
		while(zom.isDead() == false) {
			pal.attack(zom);	
		}

		
	}
}
