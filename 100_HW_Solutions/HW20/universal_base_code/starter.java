import java.util.*;

class starter {
	public static void bubbleSort(ArrayList<Integer> arr) {
		for(int outer=0;outer<arr.size()-1;outer++) {
			for(int inner=0;inner<arr.size()-outer-1;inner++) {
				if(arr.get(inner) > arr.get(inner+1)) {
					int temp = arr.get(inner);
					arr.set((inner),(arr.get(inner+1)));
					arr.set((inner+1),temp);
					
				}
			}
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
			arr.add((int)(Math.random()*100));
		}
	}
	public static void printArrList(ArrayList<Integer> arr) {
		for(int c = 0;c<arr.size();c++) {
			System.out.print(arr.get(c) + ", ");
		}
	}
	public static int findMedian(ArrayList<Integer> arr) {
		int median = arr.get(arr.size()/2);
		if(arr.size()%2==0) {
			return median;
		}
		else {
			return arr.get((arr.get(median) + arr.get(median+1))/2);
		}
	}
	public static void line() {
		System.out.println();
	}
	
	public static void main(String args[]) {
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		ArrayList<Integer> arr2 = new ArrayList<Integer>();
		ArrayList<Integer> arr3 = new ArrayList<Integer>();
		addValuesInt(arr1,100);
		addValuesInt(arr2,100);
		addValuesInt(arr3,100);
		
	
		System.out.print("Array 1: ");
		printArrList(arr1);
		line();
		line();
		System.out.print("Array 2: ");
		printArrList(arr2);
		line();
		line();
		System.out.print("Array 3: ");
		printArrList(arr3);
		line();
		line();
		
		bubbleSort(arr1);
		System.out.print("Array 1(bubble): ");
		printArrList(arr1);
		line();
		line();
		System.out.println("Median: " +findMedian(arr1));
		line();
		
		selectionSort(arr2);
		System.out.print("Array 2(selection): ");
		printArrList(arr2);
		line();
		line();
		System.out.println("Median: " +findMedian(arr2));
		line();
		
		insertionSort(arr3);
		System.out.print("Array 3(insertion): ");
		printArrList(arr3);
		line();
		line();
		System.out.println("Median: " +findMedian(arr3));
		line();
	}
}