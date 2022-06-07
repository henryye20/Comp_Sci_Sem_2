import pkg.*;
import java.util.*;


class starter {
	public static void toStringArrayList(ArrayList<Integer> arr) {
		for(int c = 0;c<arr.size();c++) {
			System.out.print(arr.get(c)+" ");
		}
		return;
	}
	public static int getArrayListAverage(ArrayList<Integer> arr) {
		int avg = 0;
		for(int c = 0;c<arr.size();c++) {
			avg += arr.get(c);
		}
		return avg/arr.size();
	}
	public static int getArrayListMax(ArrayList<Integer> arr) {
		int max = 0;
		for(int c = 0;c<arr.size();c++) {
			if(arr.get(c)>max) {
				max = arr.get(c);
			}
		}
		return max;
	}
	public static int getArrayListMin(ArrayList<Integer> arr) {
		int min = arr.get(0);
		for(int c = 0;c<arr.size();c++) {
			if(arr.get(c)<min) {
				min = arr.get(c);
			}
		}
		return min;
	}
	
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		ArrayList <Integer> arr = new ArrayList <Integer>();
		while(true) {
			System.out.print("Input a value: ");
			int x = sc.nextInt();
	
			for(int c = 0;c<x;c++) {
				arr.add((int)(Math.random()*100+1));
			}
			System.out.print("arraylist: ");
			toStringArrayList(arr);
			System.out.println();
			System.out.println("avg: " + getArrayListAverage(arr));
			System.out.println("max: " + getArrayListMax(arr));
			System.out.println("min: " + getArrayListMin(arr));
			
			while(arr.size()>0){
				arr.remove(0);
			}
			System.out.println();
		}
	}
}
