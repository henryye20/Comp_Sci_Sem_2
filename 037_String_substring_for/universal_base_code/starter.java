import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word");
		String inp = sc.nextLine();
		for(int count = 0;count!=inp.length();count++) {
			System.out.println(inp.substring(count,count+1));
		}
		
	}
}
