package pkg;
import java.util.Scanner;
import java.util.Random;


public class Clothing {
	private double price;
	private String clothingproducer;
	
	public Clothing() {
		price = 9.99;
		clothingproducer = "default:)";
	}
	public Clothing(int price, String clothingproducer) {
			this.price = price;
			this.clothingproducer = clothingproducer;
	}
	
	public double getPrice() {
		return price;
	}
	
	public String getProducer() {
		return clothingproducer;
	}
	
	public void dumbMethod() {
		System.out.println("this is a dumb method");
	}
	

}
