import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Ascii empty = new Ascii();
		empty.printArt();
		Ascii string1 = new Ascii("dog");
		string1.printArt();
		Ascii string2 = new Ascii("cactus","꧁࿇ÐɑʀҟƑîʀɛ࿇꧂");
		string2.printArt();
		Ascii string1int1 = new Ascii("other",3);
		string1int1.setAscii("(づ｡◕‿‿◕｡)づ");
		string1int1.printArt();
		Ascii mine = new Ascii("rohin","roh1n");
		mine.printArt();
		

		
	}
}
