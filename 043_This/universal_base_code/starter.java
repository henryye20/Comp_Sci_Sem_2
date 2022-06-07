import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Random rand = new Random();
		Dwarf[] x = new Dwarf[100];
		String z = "";
		int y = 0;
		String name = "";
		int age = 0;
		for(int c = 0;c<x.length;c++) {
			y = rand.nextInt(7)+1;
			if(y==1) 
				z = "Grumpy"; 
			if(y==2) 
				z = "Dopey";
			if(y==3) 
				z = "Doc";
			if(y==4) 
				z = "Happy";
			if(y==5) 
				z = "Bashful";
			if(y==6) 
				z = "Sneezy";
			if(y==7) 
				z = "Sleepy";
			x[c] = new Dwarf(z,rand.nextInt(100)+1);
		}
		int dupe = 0;
		for(int c = 0;c<x.length;c++) {
			name = x[c].getName();
			System.out.println(name);
			age = x[c].getAge();
			System.out.println("age: " + age);
		}
		String name2 = x[0].getName();
		for(int c = 1;c<x.length;c++) {
			
			if(x[c].isSameName(name2))
				dupe++;
		}
		System.out.println(x[0].getName() + " was the name with " + dupe + " duplicates");
	}
}
