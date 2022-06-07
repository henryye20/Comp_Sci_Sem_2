package pkg;
import java.util.Scanner;
import java.util.Random;


public class Apprentice extends Musician {
	String school;
	int yearsOfExperience;

	public Apprentice() {
		this("guitar","CVHS",0);
	}
	public Apprentice(String school,int yearsOfExperience) {
		this("guitar",school,yearsOfExperience);
	}
	public Apprentice(String instrument,String school,int yearsOfExperience) {
		this("billy",15,instrument,school,yearsOfExperience);
	} 
	public Apprentice(String name,int age,String instrument,String school,int yearsOfExperience) {
		super(name,age,instrument);
		this.school = school;
		this.yearsOfExperience = yearsOfExperience;
	}
	
	public void playInstrument() {
		System.out.println(this.getName() + " (apprentice) plays instrument");
	}
	public void practice() {
		System.out.println(this.getName() + "(apprentice) has " + this.yearsOfExperience + " yearsOfExperience and is practicing");
	}
	public void preform() {
		System.out.println(this.getName() + "(apprentice) is preforming the " + this.instrument);
	}
	public void practiceAtUniversity() {
		System.out.println(this.getName() + "(apprentice) has " + this.yearsOfExperience + " yearsOfExperience and is practicing at " + this.school);
	}
 }

