package pkg;
import java.util.Scanner;
import java.util.Random;


public class Combinatorics {
	
	public static int factorial(int n) {
		if(n==1) {
			return 1;
		}
		if(n>1||n<13) {
			int fact = 1;
			for(int c = 1;c<=n;c++) {
				fact = fact * c;
			}
			return fact;
		}
		return -1;
	}
		
	public static void numCombinations(int n, int r) {
		if(r>n) {
			System.out.println("There are 0 ways of choosing " + r + " items from " + n " choices.");
			return;
		}
		else {
			int ans = factorial(n)/(factorical(r)*factorical((n-r)));
			System.out.println("There are " + ans " ways of choosing " + r + " items from " + n " choices.");
			return;
		}
	}

}
