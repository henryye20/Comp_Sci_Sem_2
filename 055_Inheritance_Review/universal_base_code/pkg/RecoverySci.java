package pkg;
import java.util.Scanner;
import java.util.Random;


public class RecoverySci extends Science{
	public RecoverySci(String teacher,int grade,String field) {
		super(teacher,grade,field);
		if(grade>60) {
			credit = 4;
			this.grade = 100;
		}
		else{
			credit = 0;
			this.grade = 0;
		}
	}
	
	public String toString() {
		return (teacher+" "+credit+" "+grade);
	}

}

