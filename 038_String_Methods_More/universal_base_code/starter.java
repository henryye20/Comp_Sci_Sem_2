import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.println("Input your first and last name ex: \"First Last\"");
		String nom = sc.nextLine();
		System.out.println("The last name is:" +  nom.substring(nom.indexOf(" ")));
		System.out.println(nom.substring(0,0));
		
	}
}
