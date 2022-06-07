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
		System.out.println();
		System.out.println();
		insertionSort(arr);
		for(int c = 0;c<arr.size();c++) {
			System.out.print(arr.get(c) + " ");
		}
		


		
	}
	public static void insertionSort(ArrayList<Integer> arr) {
		int outer, inner, key;
		
		for(outer = 1; outer < arr.size(); outer++) {
			key = arr.get(outer);
			inner = outer-1;
			
			while(inner >= 0 && arr.get(inner) > key) {
				arr.set(inner+1,arr.get(inner));
				inner = inner - 1;
			
			}
			arr.set(inner+1,key);
		}
	}
	public static void addValuesInt(ArrayList<Integer> arr, int num){
		for(int i = 0; i < num; i++){
			arr.add(((int)(Math.random()*100)));
		}
	}
}
