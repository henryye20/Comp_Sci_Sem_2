import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		//gaming
		int num = rand.nextInt(1000);
		System.out.print("Guess a number: ");
		int pick = sc.nextInt();
		while(true)
		{
			if (num==pick)
			{
				System.out.print("You guessed it!");
				break;
			}
			else if(pick>num)
			{
				System.out.println("You're a little too high");
				System.out.println(" ");
				System.out.print("Guess a number: ");
				int pick1 = sc.nextInt();
				pick = pick1;
			}
			else if(pick<num)
			{
				System.out.println("You're a little too low");
				System.out.println(" ");
				System.out.print("Guess a number: ");
				int pick2 = sc.nextInt();
				pick = pick2;
			}
		}
		
		
		
	}
}
