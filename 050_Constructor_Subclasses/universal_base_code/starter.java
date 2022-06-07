import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Musician x = new Musician("bob","guitar");
		System.out.println(x.getName() + " " + x.getInstrument());
		x.practice();

		
	}
}
