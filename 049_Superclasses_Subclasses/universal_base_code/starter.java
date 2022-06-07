import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Preformer empty = new Preformer();
		Preformer StrInt = new Preformer("HI",10);
		Musician empty1 = new Musician();
		Musician Str = new Musician("some cool instrument");
		
		System.out.println(empty.getName());
		empty.practice();
		System.out.println("");
		
		System.out.println(StrInt.getName());
		StrInt.preform();
		System.out.println("");
		
		System.out.println(empty1.getName());
		empty1.preform();
		empty1.playInstrument();
		System.out.println("");
		
		System.out.println(Str.getName());
		Str.practice();
		System.out.println(Str.getInstrument());
		System.out.println("");
	}
}
