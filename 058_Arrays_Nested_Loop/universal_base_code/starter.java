import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.print("symbol: ");
		String t = sc.nextLine();
		System.out.print("length: ");
		int x = sc.nextInt();
		System.out.print("Width: ");
		int y = sc.nextInt();
		System.out.println("");
		for(int c=0;c<x;c++) {
			for(int z=0;z<y;z++) {
				System.out.print(t);
			}
			System.out.println("");
		}
		
	}
}
