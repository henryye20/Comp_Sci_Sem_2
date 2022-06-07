package pkg;
import java.util.Scanner;
import java.util.Random;


public class Actor extends Preformer{
	String type;

	public Actor() {
		type = "theater";
		
	}
	
	public void practice() {
		System.out.println(super.getName() + " practicing(actor)");
		
	}
	
	public void preform() {
		System.out.println(super.getName() + " is acting(actor)");
		
	}
	
	public void monologue() {
		System.out.println(super.getName() + ": MONOLOGUE");
	}
}

