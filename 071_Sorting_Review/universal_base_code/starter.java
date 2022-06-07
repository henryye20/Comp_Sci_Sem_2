import pkg.*;
import java.util.*;


class starter {

	//Precondition: A and B are presorted in ascending order. 
	//Sort A and B into C.
	public static void mergeSort3(int [] A, int []B, int [] C){
		int i = 0;
		int k = 0;
		for(int c=0;c<C.length;c++) {
			while(k==B.length) {
				C[c] = A[i];
				c++;
				i++;
			}
			while(i==A.length) {
				C[c] = B[k];
				c++;
				k++;
			}
			if(A[i]<B[k]||k>B.length) {
				C[c] = A[i];
			}
			if(B[k]<=A[i]||i>A.length) {
				C[c] = B[k];
			}
		}
	}

	//A is the full array unsorted. 
	//First is the beginning index of the array A, last is the last index of the array.
	//Split A in two halves and sort independently. Then merge back into A.
	public void mergeSort(int [] A, int first, int last){
	
	}
	
	public static void main(String args[]) {
		int [] A = new int[3];
		int [] B = new int[3];
		int [] C = new int[A.length+B.length];
		A[0] =0;
		A[1] =2;
		A[2] =4;
		
		B[0] =1;
		B[1] =3;
		B[2] =5;
		
		mergeSort3(A,B,C);
		
	}
}
