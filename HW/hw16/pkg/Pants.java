package pkg;
import java.util.Scanner;
import java.util.Random;


public class Pants extends Clothing{
	private int length = 0;
	
	public Pants() {
		this(7.90,"default",5);
	}
	
	public Pants(double price, String clothingproducer,int length) {
		super(price,clothingproducer);
		this.length = length;
	}
	public void dumbMethod() {
		System.out.println("this is a not as dumb method but pants version");
	}
	

}
