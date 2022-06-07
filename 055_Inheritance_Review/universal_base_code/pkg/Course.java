package pkg;
import java.util.Scanner;
import java.util.Random;


public class Course {
	public String teacher;
	public int grade;
	public int credit;
	
	public Course(String teacher,int grade) {
		this.teacher = teacher;
		this.grade = grade;
		calcCredit(grade);
	}

	private void calcCredit(int grade) {
		if(grade>=90)
			credit = 4;
		else if(grade>=80)
			credit = 3;
		else if(grade>=70)
			credit = 2;
		else if(grade>=60)
			credit = 1;
		else if(grade<60)
			credit=0;
	}
	
	
	public String getTeacher() {
		return teacher;
	}
	public int getGrade() {
		return grade;
	}
	public int getCredit() {
		return credit;
	}
	
	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}
	public void getGrade(int grade) {
		this.grade = grade;
		calcCredit(grade);
	}
	
	
	public String toString() {
		return (teacher+" "+credit);
	}
	public boolean equals(Object o) {
		return this.teacher == ((Course)o).teacher;
	}
	
}

