import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a number");
		int num1 = sc.nextInt();
		int num2 = num1+5;
		while(num1<num2)
		{
			System.out.println(num1); 
			if(num1==num2)
			{
				break;
			}
			num1 = num1+1;
		}
		
	}
}
