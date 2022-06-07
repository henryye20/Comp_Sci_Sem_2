import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Preformer[]x = new Preformer[4];
		x[0] = new Preformer();
		x[0].preform();
		x[0].practice();
		
		x[1] = new Musician("mus","flute");
		x[1].preform();
		x[1].practice();

		x[2] = new Apprentice();
		((Apprentice)x[2]).practiceAtUniversity();
		((Apprentice)x[2]).playInstrument();
	
		x[3] = new Actor();
		((Actor)x[3]).monologue();
		x[3].preform();
	}
}
