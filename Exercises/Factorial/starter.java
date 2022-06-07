
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.println("Input an integer");
		int num = sc.nextInt();
		int c = num - 1;
		while(true) {
			num = num * c;
			if(c == 1) {
				System.out.println(num);
				break;
			}
			c = c - 1;
		}

		
	}
}
