import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
	Random rand = new Random();
	int count = 0;
	int randomnum;
	while(count!=100) {
    randomnum = rand.nextInt(100+1);
    System.out.println(randomnum);
    count++;
		}
	}
}
