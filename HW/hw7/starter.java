
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in); 
		Random rand = new Random();
		int[]x;
		x = new int[20];
		int c = 0;
		while(c<x.length) {
			x[c] = rand.nextInt(x.length);
			System.out.println(x[c]);
			c++;
		}
		System.out.println("reverse");
		int[]y = new int[x.length];
		int c2 = 0;
		c = 19;
		while(c!=0) {
			y[c2] = x[c];
			System.out.println(y[c2]);
			c2++;
			c--;
		}
	}
}
