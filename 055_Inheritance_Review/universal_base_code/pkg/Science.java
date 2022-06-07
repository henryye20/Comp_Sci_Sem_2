package pkg;
import java.util.Scanner;
import java.util.Random;


public class Science extends Course{
	public String field;

	public Science(String teacher,int grade,String field) {
		super(teacher,grade);
		this.field = field;
		
	}
	
	public String toString() {
		return (teacher+" "+credit+" "+field);
	}

}

