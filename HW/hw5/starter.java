import java.util.Scanner;
import java.util.Random;

class starter {
	static int money;
	
	public static void rules() {
		System.out.println("Slot Machine Rules: ");
		System.out.println("1. Each player starts with $100.");
		System.out.println("2. Input a wager less than your total amount of money.");
		System.out.println("3. The slot machine will roll 3 numbers from 1 to 10.");
		System.out.println("	a. If two numbers match, you double your money.");
		System.out.println("	b. If three numbers match, you triple your money.");
		System.out.println("	c. If none match, you lose your money.");
		System.out.println("--------------------------------------------------");
		System.out.println(" ");
		System.out.print("Would you like to play the slots? (Yes/yes/Y/y) : ");
		return;
	}
	
	public static void main(String args[]) {
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		rules();
		String yes = sc.nextLine();
		money = 100;
		int wager;
		int ran1;
		int ran2;
		int ran3;
		ran1 = 0;
		ran2 = 0;
		ran3 = 0;
		
		boolean flag = true;
		while(money!=0) {
			while(flag) {
			if(yes.equals("yes")||yes.equals("Yes")||yes.equals("Y")||yes.equals("y")) {
				flag = false;
			}
			else if(yes.equals("no")||yes.equals("No")||yes.equals("N")||yes.equals("n")) {
				System.out.println("Sad to see you go! You still have $100 left. Come again soon! Thanks!");
				System.exit(0);
			}
			else {
				System.out.println("That wasn't quite the correct answer. Try again.");
				System.out.println("--------------------------------------------------");
				System.out.println(" ");
				System.out.print("Would you like to play the slots (Yes/yes/Y/y) : ");
				String yes1 = sc.nextLine();
				yes = yes1;
			}
			
			}
			
			
			
			
			if(money==0) {
				System.out.println("You have no money.");
				System.exit(0);
			}
			
			System.out.print("You have " + "$" + money + " How much would you like to wager? ");
			wager = sc.nextInt();
			
			if(wager<=money) {
			money = money - wager;
			ran1 = rand.nextInt(10)+1;
			ran2 = rand.nextInt(10)+1;
			ran3 = rand.nextInt(10)+1;
			
			System.out.println("Your rolls are: ");
			System.out.println("_______________________");
			System.out.println(" | " + ran1 + " | " + ran2 + " | " + ran3 + " |");
			System.out.println("_______________________");
			}
			
			else if (wager>money) {
				System.out.print("You only have $" + money +"! Please enter a smaller number : " );
				wager = sc.nextInt();
			
			}
			
			if((ran1==ran2)||(ran1==ran2)||(ran2==ran3)) {
					money = money + (wager * 2);
					System.out.println("You got two of the same number! You're wager has now been doubled!");
					System.out.println("You now have $" + wager);
				}
			else if((ran1==ran2)&&(ran2==ran3)) {
					money = money + (wager * 3);
					System.out.println("You got three of the same number! You're wager has now been doubled!");
					System.out.println("You now have $" + wager);
				}
			
			}
			System.out.println("You've run out of money! Thanks for coming! Come back soon!");

		
		}
		
		
	}

