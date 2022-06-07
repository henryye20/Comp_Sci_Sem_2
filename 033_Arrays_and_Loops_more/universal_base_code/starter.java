import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		
		Random rand = new Random();
		int[]x;
		x = new int[100];
		System.out.println("There are " + x.length + " elements");
		int c = 0;
		while(c<x.length) {
			x[c] = rand.nextInt(100)+1;
			c++;
		}
		//min
		c = 0;
		int min = 1000;
		while(c<x.length) {
			if(x[c]<min) {
				min = x[c];
			}
			c++;
		}
		System.out.println("the min is " + min);
		//max
		c = 0;
		int max = -10000;
		while(c<x.length) {
			if(x[c]>max) {
				max = x[c];
			}
			c++;
		}
		System.out.println("the max is " + max);
		//avg
		c = 0;
		int avg;
		int sum = 0;
		while(c<x.length) {
			 sum = sum + x[c];
			 c++;
		}
		avg = sum/x.length;
		System.out.println("the avg is " + avg);
	}
}
