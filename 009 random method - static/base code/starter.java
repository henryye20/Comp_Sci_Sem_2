import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Random rand = new Random();
		int num1 = rand.nextInt(10);
		int num2 = rand.nextInt(100);
		double num3 = rand.nextDouble();
		int num4 = rand.nextInt(576);
		double num4b = rand.nextDouble();
		System.out.println("A number between 0 - 9: " + num1);
		System.out.println("A number between 1 - 100: " + num2 + 1);
		System.out.println("A number between 2.5 - 3.5: " + num3 + 2.5);
		System.out.println("A number between 14 - 589: " + num4 + num4b + 14);
		
		
	}
}
