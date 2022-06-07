package pkg;
import java.util.Scanner;
import java.util.Random;


public class Fish implements Pet {
	String name;
	int age;
	boolean trained;
	
	public Fish() {
		this("bigFish",21,true);
	}
	public Fish(int age) {
		this("bigFish",age,true);
	}
	public Fish(boolean trained) {
		this("bigFish",21,trained);
	}
	public Fish(String name) {
		this(name,21,true);
	}
	public Fish(String name,boolean trained) {
		this(name,21,trained);
	}
	public Fish(String name,int age,boolean trained) {
		this.name = name;
		this.age = age;
		this.trained = trained;
		this.interact();
	}
	
	public void setName(String name) {
		this.name = name;
	}
    public void setAge(int age) {
    	this.age = age;
    }           	
    public void setIsTrained(boolean trained) {
    	this.trained = trained;
    }  
    public String getName() {
    	return name;
    }               	
    public int getAge() {
    	return age;
    }                  	
    public boolean getIsTrained() {
    	return trained;
    }             
    public void interact() {
    	System.out.println(this.getName() + " bubble");
    }                
	public void trick() {
		if(trained) {
			System.out.println(this.getName() + "fish tr i c k");
		}
		else {
			System.out.println(this.getName() + "no fish trick");
		}
	}
	
	

}

