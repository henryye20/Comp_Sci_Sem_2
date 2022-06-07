import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		System.out.print("Pick a number between 1 - 1000: ");
		int num = sc.nextInt();
		
		int numR = rand.nextInt(999) + 1;
		boolean correct;
		correct = num==numR;
		if(correct)
		{
			System.out.print("Your number was the random number.");
			System.out.println(" The number was " + numR);
		}
		else
		{
			System.out.print("Your number wasn't the random number.");
			System.out.println(" The number was " + numR);
		}
	}
}
