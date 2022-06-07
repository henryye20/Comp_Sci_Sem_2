package pkg;
import java.util.Scanner;
import java.util.Random;


public class History extends Course{
	private int era;

	public History(String teacher,int grade,int era) {
		super(teacher,grade);
		this.era = era;
		
	}
	
	public String toString() {
		return (teacher+" "+credit+" "+era);
	}

}

