import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Musician one = new Apprentice();
		Apprentice two = new Apprentice("UCLA",23);
		Apprentice three = new Apprentice("trumpet","USC",13);
		Apprentice four = new Apprentice("bob",500,"drums","CV",20);
		
		one.playInstrument();
		two.practice();
		three.preform();
		four.practiceAtUniversity();
		
	}
}
