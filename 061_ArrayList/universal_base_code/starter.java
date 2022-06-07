import pkg.*;
import java.util.*;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
	Scanner sc = new Scanner(System.in);
	ArrayList <String> arr = new ArrayList <String>();
	
	int x = sc.nextInt();
	
	for(int c = 0;c<x;c++) {
		arr.add("cookie" + c);
		System.out.print(arr.get(c)+" ");
	}
	//for(int c = 0;c<arr.size();c++) {
	//	System.out.print(arr.get(c)+" ");
	//}
}

}
