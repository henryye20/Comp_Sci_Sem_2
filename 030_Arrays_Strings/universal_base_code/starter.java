import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		String[]striings;
		striings = new String[10];
		striings[0] = "Somebody once told me the world is gonna roll me";
		striings[1] = "I ain't the sharpest tool in the shed";
		striings[2] = "She was looking kind of dumb with her finger and her thumb";
		striings[3] = "In the shape of an 'L' on her forehead";
		striings[4] = "Well the years start coming and they don't stop coming";
		striings[5] = "Fed to the rules and I hit the ground running";
		striings[6] = "Didn't make sense not to live for fun";
		striings[7] = "Your brain gets smart but your head gets dumb";
		striings[8] = "So much to do, so much to see";
		striings[9] = "So what's wrong with taking the back streets";
		int count = 0;
		while(count!=10) {
			System.out.println(striings[count]);
			count++;
		}

		
	}
}
