import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a sentence");
		String inp = sc.nextLine();
		
		if(inp.indexOf(" ") == -1){
			System.out.println(inp);
			System.exit(0);
		}
		int takefrom = 0;
		String x = "";
		String y = "";
		while(takefrom<inp.indexOf(" ",takefrom)){
			y = (inp.substring(takefrom,inp.indexOf(" ",takefrom))+ " ");
			x = y + x;
			takefrom = inp.indexOf(" ",takefrom)+1;
		}
		
		System.out.println(inp.substring(takefrom)+ " " + x);
		
	}
}
