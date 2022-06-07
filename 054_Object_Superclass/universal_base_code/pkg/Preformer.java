package pkg;
import java.util.Scanner;
import java.util.Random;


public class Preformer {
	String name;
	int age;

	public Preformer() {
		name = "Doja Cat";
		age = 26;
		
	}
	public Preformer(String name,int age) {
		this.name = name;
		this.age = age;
	}
	public Preformer(String name) {
		this(name,26);
	}
	
	public String toString() {
		return (name+" "+age);
	}
	public boolean equals(Object o) {
		return this.name == ((Preformer)o).name;
	}
	
	public String getName() {
		return name;
	}
	
	public void practice() {
		System.out.println(this.name + " is practicing (preformer)");
	}

	public void preform() {
		System.out.println(this.name + " is preforming (preformer)");
	}
}

