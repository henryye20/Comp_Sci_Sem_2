package pkg;
import java.util.Scanner;
import java.util.Random;


public class Bird implements Pet {
	String name;
	int age;
	boolean trained;
	
	public Bird() {
		this("bigbird",21,true);
	}
	public Bird(int age) {
		this("bigbird",age,true);
	}
	public Bird(boolean trained) {
		this("bigbird",21,trained);
	}
	public Bird(String name) {
		this(name,21,true);
	}
	public Bird(String name,boolean trained) {
		this(name,21,trained);
	}
	public Bird(String name,int age,boolean trained) {
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
    	System.out.println(this.getName() + " squack");
    }                
	public void trick() {
		if(trained) {
			System.out.println(this.getName() + "t r i c k");
		}
		else {
			System.out.println(this.getName() + "no trick");
		}
	}
	
	

}

