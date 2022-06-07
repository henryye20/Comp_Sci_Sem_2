import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Preformer[]x = new Preformer[4];
		x[0] = new Preformer();
		x[1] = new Musician("mus","flute");
		x[2] = new Apprentice();
		x[3] = new Actor();
		
		System.out.println(x[0].equals(x[3]));
		
		System.out.println(x[0]);
		System.out.println(x[1]);
		System.out.println(x[2]);
		System.out.println(x[3]);
		
	}
}
