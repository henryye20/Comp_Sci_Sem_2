import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		int n = 5;
		if(n==1) {
			System.out.print(1);
		}
		if(n>1||n<13) {
			int fact = 1;
			for(int c = 1;c<=n;c++) {
				fact = fact * c;
			}
			System.out.println(fact);
		}
		


		
	}
}
