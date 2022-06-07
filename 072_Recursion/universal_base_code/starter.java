import pkg.*;
import java.util.*;

class starter {
	public static void factorial(int n){
		if(n==1) {
			return;
		}
		
		else {
			System.out.println(n * factorial(n-1));
		}
	}
	public static void recurPower(int base, int n){
		if(n==1) {
			return;
		}
		else {
			System.out.println(base * recurPower(base,n-1));
			
		}
	}	

	public static void main(String args[]) {
		factorial(4);
		recurPower(5,3);
	}
}
