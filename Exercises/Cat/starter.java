import pkg.*;
import java.util.Scanner;
import java.util.Random;

class Cat {
	String name;

	public Cat() {
		name = new String("Garfield");
	}
	public Cat(String a) {
		name = a; 
	}
	public void meow() {
		System.out.println("meow said " + name);
	}
}
class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Cat x = new Cat();
		x.meow();
		Cat y = new Cat("Bartholomew");
		y.meow();
	}
}
