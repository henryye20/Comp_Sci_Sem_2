import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("Input an Integer");
		int num1 = sc.nextInt();
		System.out.println("Input another Integer");
		int num2 = sc.nextInt();
		int num11 = num1%2;
		int num22 = num2%2;
		//ODD EVEN
		if(num11==0)
		{
			System.out.println("The first integer is even");
		}
		else
		{
			System.out.println("The first integer is odd");	
		}
		if(num22==0)
		{
			System.out.println("The second integer is even");
		}
		else
		{
			System.out.println("The second integer is odd");	
		}
		//num 1 divisible
		if((num1%3)!=0)
		{
			System.out.println("The first integer is not divisible by 3");
		}
		if((num1%4)!=0)
		{
			System.out.println("The first integer is not divisible by 4");
		}
		if((num1%5)!=0)
		{
			System.out.println("The first integer is not divisible by 5");
		}
		//num 2 divisible
		if((num2%3)!=0)
		{
			System.out.println("The second integer is not divisible by 3");
		}
		if((num2%4)!=0)
		{
			System.out.println("The second integer is not divisible by 4");
		}
		if((num2%5)!=0)
		{
			System.out.println("The second integer is not divisible by 5");
		}
		
		
	}
}
