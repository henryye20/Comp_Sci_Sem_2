import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.print("Please input your first number: ");
		int num1 = sc.nextInt();
		System.out.print("Please input your second number: ");
		int num2 = sc.nextInt();
		System.out.print("Please input your third number: ");
		int num3 = sc.nextInt();
		//Greatest
		boolean oneG;
		oneG = ((num1>num2)&&(num1>num3));
		boolean twoG;
		twoG = ((num2>num1)&&(num2>num3));
		boolean threeG;
		threeG = ((num3>num1)&&(num3>num2));
		//Smallest
		boolean oneS;
		oneS = ((num1<num2)&&(num1<num3));
		boolean twoS;
		twoS = ((num2<num1)&&(num2<num3));
		boolean threeS;
		threeS = ((num3<num1)&&(num3<num2));
		//Greatest Print
		if(oneG)
		{
			System.out.println("Your first number is the largest of the three");
			System.out.println("The number was " + num1);
		}
		if(twoG)
		{
			System.out.println("Your second number is the largest of the three");
			System.out.println("The number was " + num2);
		}
		if(threeG)
		{
			System.out.println("Your third number is the largest of the three");
			System.out.println("The number was " + num3);
		}
		//Smallest Print
		if(oneS)
		{
			System.out.println("Your first number is the smallest of the three");
			System.out.println("The number was " + num1);
		}
		if(twoS)
		{
			System.out.println("Your second number is the smallest of the three");
			System.out.println("The number was " + num2);
		}
		if(threeS)
		{
			System.out.println("Your third number is the smallest of the three");
			System.out.println("The number was " + num3);
		}
	}
}
