package pkg;
import java.util.Scanner;
import java.util.Random;


public class Musician extends Preformer {
	String instrument;

	public Musician() {
		instrument = "chello";
		
	}
	public Musician(String instrument) {
		this.instrument = instrument;
		
	}
	
	public String getInstrument() {
		return instrument;
	}
	
	public void playInstrument() {
		System.out.println("AAAAAAAAAAAH");
		
	}

}

