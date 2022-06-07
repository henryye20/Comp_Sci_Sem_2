package pkg;
import java.util.Scanner;
import java.util.Random;


public class Mathe extends Course{
	private String difficulty;

	public Mathe(String teacher,int grade,String difficulty) {
		super(teacher,grade);
		this.difficulty = difficulty;
		
	}
	
	public String toString() {
		return (teacher+" "+credit+" "+difficulty);
	}

}

