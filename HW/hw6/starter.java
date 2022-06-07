
import java.util.Scanner;
import java.util.Random;


class starter {
	public static boolean checkPrime(int a) {
		int num1 = a;
		int counter = num1 - 1;
		boolean flag = true;
		while(counter!=1) {
			if((num1%counter)==0) {
				flag = false;
				break;
			}
			counter = counter - 1;
		}
		return flag;
	}
	public static void printPrimes(int b) {
		int num1 = b;
		while(num1!=1){
			boolean prime = checkPrime(num1);
			if(prime) {
				System.out.println(num1);
			}
			
			num1 = num1 - 1;
		}
		return;
	}
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in); 
		System.out.print("Input a number: ");
		int inp = sc.nextInt();
		printPrimes(inp);
		
		
	}
}
