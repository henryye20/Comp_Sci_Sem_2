import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void bubblesort(int[]arr) {
		for(int outer=0;outer<arr.length-1;outer++) {
			for(int inner=0;inner<arr.length-outer-1;inner++) {
				if(arr[inner] > arr[inner+1]) {
					int temp = arr[inner];
					arr[inner] = arr[inner+1];
					arr[inner+1] = temp;
					
				}
			}
		}
	}
	
	public static void main(String args[]) {
		// Your code goes below here
		int[]arr = new int[100];
		for(int c=0;c<arr.length;c++) {
			arr[c] = (int)(Math.random()*100);
			System.out.print(arr[c] +" ");
		}
		bubblesort(arr);
		System.out.println();
		for(int c=0;c<arr.length;c++) {
			System.out.print(arr[c] + " ");
		}


		
	}
}
