import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Random rand = new Random();
		
		int[]x = new int[20];
		for(int c = 0;c<x.length;c++) {
			x[c] = rand.nextInt(10)+1;
			System.out.print(x[c] + " ");
		}
		int num = rand.nextInt(10)+1;
		System.out.println("");
		System.out.println("num is " + num);
		int dups = 0;
		for(int c = 0;c<x.length;c++) {
			if(num==x[c]) {
				System.out.println("Duplicate at index of " + c);
				dups++;
			}
		}
		System.out.println(dups + " duplicate(s) of " + num);
		int neigh = 0;
		for(int c = 0;c<(x.length-1);c++) {
			if(x[c]==x[c+1]) {
				System.out.println("Neighbors at index of " + c + " and " + (c+1) + " were both " + x[c]);
				neigh++;
			}
		}
		System.out.println(neigh + " neighbor(s)");
	}
}
