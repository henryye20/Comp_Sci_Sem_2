import pkg.*;
import java.util.*;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		ArrayList<Integer> arr = new ArrayList<Integer>();
		addValuesInt(arr,200);
		for(int c = 0;c<arr.size();c++) {
			System.out.print(arr.get(c) + " ");
		}
		selectionSort(arr);
		System.out.println();
		System.out.println();
		for(int c = 0;c<arr.size();c++) {
			System.out.print(arr.get(c) + " ");
		}
		
	}
	public static void selectionSort(ArrayList<Integer> arr) {
		int outer, inner, min_index;
		
		for(outer = 0; outer < arr.size(); outer++) {
			min_index = outer;
			for(inner = outer+1;inner < arr.size();inner++) {
				if(arr.get(inner) < arr.get(min_index)) {
					min_index = inner;
				}
			}
			int temp = arr.get(outer);
			arr.set(outer,arr.get(min_index));
			arr.set(min_index,temp);
		}
	}
	public static void addValuesInt(ArrayList<Integer> arr, int num){
		for(int i = 0; i < num; i++){
			arr.add(new Integer((int)(Math.random()*100)));
		}
	}
}
