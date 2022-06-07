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
			x[c] = new Dwarf();
			x[c].setName(z);
			x[c].setAge(rand.nextInt(100)+1);
		}
		for(int c = 0;c<x.length;c++) {
			name = x[c].getName();
			System.out.println(name);
			age = x[c].getAge();
			System.out.println("age: " + age);
		}
	}
}
