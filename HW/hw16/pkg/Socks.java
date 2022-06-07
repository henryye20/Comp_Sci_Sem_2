package pkg;
import java.util.Scanner;
import java.util.Random;


public class Socks extends Clothing{
	private String type = "";
	
	public Socks() {
		this(7.90,"default","striped");
	}
	
	public Socks(double price, String clothingproducer,String type) {
		super(price,clothingproducer);
		this.type = type;
	}
	public void dumbMethod() {
		System.out.println("this is a not as dumb method but Socks version");
	}
	

}
