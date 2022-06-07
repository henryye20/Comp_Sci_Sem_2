import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Random rand = new Random();
		int[]numbers;
		int count = 0;
		numbers = new int[1000];
		while(count<numbers.length) {
			numbers[count] = rand.nextInt(1000);
			System.out.println(numbers[count]);
			count++;
		}
		
		
	}
}
