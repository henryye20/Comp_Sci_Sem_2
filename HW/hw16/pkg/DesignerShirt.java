package pkg;
import java.util.Scanner;
import java.util.Random;


public class DesignerShirt extends Shirt{
	private String brand = "";
	public DesignerShirt() {
		this(70.89,"**default**","cloth","brand");
	}
	
	public DesignerShirt(double price,String clothingproducer,String material,String brand) {
		super(material,price,clothingproducer);
		this.brand = brand;
	}
	public void dumbMethod() {
		System.out.println("this is a not as dumb method**");
	}
	

}
