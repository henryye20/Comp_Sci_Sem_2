
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void times(int a, int b) {
		
		int sum = a * b;
		if((sum%3)==0) {
			System.out.println("The product " + sum + " is divisible by 3");
		
		}
		else {
			System.out.println("The product " + sum + " is not divisible by 3");

		}
		return;
	}
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.println("input an integer");
		int num1 = sc.nextInt();
		System.out.println("input an integer");
		int num2 = sc.nextInt();
		times(num1,num2);
		
		
	}
}
