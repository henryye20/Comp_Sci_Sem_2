import java.util.Scanner;
import java.util.Random;

class starter {
	public static int pow(int a,int b) {
	int sum = a;
	int counter = 1;
	while(counter!=b)
	{
		sum = sum * a;
		counter = counter + 1;
	}
	return sum;
	}
	public static void main(String args[]) {
		// Your code goes below here
	Scanner sc = new Scanner(System.in);
	System.out.println("What is your base number?");
	int num1 = sc.nextInt();
	System.out.println("What is your exponent number?");
	int num2 = sc.nextInt();
	int power = pow(num1,num2);
	System.out.println("Your answer is: " + power);
	}
}
