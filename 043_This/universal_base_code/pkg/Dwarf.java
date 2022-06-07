package pkg;
import java.util.Scanner;
import java.util.Random;


public class Dwarf {
	String name;
	int age;

	public Dwarf() {
		name = "";
		age = 0;
	}
	
	public Dwarf(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public boolean isSameName(String name) {
		boolean flag = false;
		if(name == this.name)
			flag = true;
		return flag;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setName(String a) {
		name = a;
	}
	
	public void setAge(int a) {
		age = a;
	}
	

}

