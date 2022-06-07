import java.util.*;

class starter {
	//Methods go here
	public static void printArrayList(ArrayList<Integer> arr) {
		for(int c = 0;c<arr.size();c++) {
			System.out.print(arr.get(c)+" ");
		}
		return;
	}
	public static void addValuesArrayList(int n, ArrayList<Integer> arr) {
		for(int c = 0;c<n;c++) {
			arr.add((int)(Math.random()*100+1));
		}
		return;
	}

	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		ArrayList <Integer> arr = new ArrayList <Integer>();
		System.out.println("how many values");
		int v = sc.nextInt();
		addValuesArrayList(v,arr);
		printArrayList(arr);
	}
}
