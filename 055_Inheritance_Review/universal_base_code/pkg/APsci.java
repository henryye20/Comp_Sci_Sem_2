package pkg;
import java.util.Scanner;
import java.util.Random;


public class APsci extends Science{

	public APsci(String teacher,int grade,String field) {
		super(teacher,grade,field);
		credit = credit+1;
	}
	
	public String toString() {
		return (teacher+" "+credit+" "+field);
	}

}

