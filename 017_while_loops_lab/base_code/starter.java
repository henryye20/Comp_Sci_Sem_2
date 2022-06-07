import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = sc.nextLine();
		System.out.println("How many times do I print: " + name);
		int num = sc.nextInt();
		while(num>0)
		{
			System.out.println(name); 
			if(num==0)
			{
				break;
			}
			num = num-1;
		}
		
	}
}
