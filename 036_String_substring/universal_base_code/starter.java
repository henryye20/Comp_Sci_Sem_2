import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word");
		String inp = sc.nextLine();
		int count = 0;
		while(count!=inp.length()) {
			System.out.print(inp.substring(count,count+1) + " ");
			count++;
		}

		
	}
}
