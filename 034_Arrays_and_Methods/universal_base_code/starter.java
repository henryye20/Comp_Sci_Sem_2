import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void toStringArray(int[]x) {
		int c = 0;
		while(c<x.length) {
			System.out.println(x[c]);
			c++;
		}
		return;
	}
	public static int getArrayAverage(int[]x) {
		int c = 0;
		int avg;
		int sum = 0;
		while(c<x.length) {
			 sum = sum + x[c];
			 c++;
		}
		avg = sum/x.length;
		return avg;
	}
	public static int getArrayMax(int[]x) {
		int c = 0;
		int max = -10000;
		while(c<x.length) {
			if(x[c]>max) {
				max = x[c];
			}
			c++;
		}
		return max;
	}
	public static int getArrayMin(int[]x) {
		int c = 0;
		int min = 10000;
		while(c<x.length) {
			if(x[c]<min) {
				min = x[c];
			}
			c++;
		}
		return min;
	}	
	public static void main(String args[]) {
		// Your code goes below here
		Random rand = new Random();
		int[]y;
		y = new int[100];
		int c = 0;
		while(c<y.length) {
			y[c] = rand.nextInt(100)+1;
			c++;
		}
		int avg = getArrayAverage(y);
		int max = getArrayMax(y);
		int min = getArrayMin(y);
		toStringArray(y);
		System.out.println("avg is " + avg);
		System.out.println("max is " + max);
		System.out.println("min is " + min);
	}
}
