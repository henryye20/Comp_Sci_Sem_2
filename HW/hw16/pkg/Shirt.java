package pkg;
import java.util.Scanner;
import java.util.Random;


public class Shirt extends Clothing{
	private String material;
	
	public Shirt() {
		this(7.99,"default","paper");
	}
	
	public Shirt(double price, String clothingproducer,String material) {
		super(price,clothingproducer);
		this.material = material;
	}
	public void dumbMethod() {
		System.out.println("this is a not as dumb method");
	}
	

}
