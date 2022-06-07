
import java.util.Scanner;
import java.util.Random;

class Dog {
	String name;
	int age;
	String breed;

	public Dog() {
		name = new String("Clifford");
		age = 3;
		breed = new String("big red dog");
	}
	public Dog(String a) {
		name = a; 
		age = 1;
		breed = new String("dog dog");
	}
	public Dog(String a,String b) {
		name = a; 
		age = 1;
		breed = b;
	}
	public Dog(String a,int b) {
		name = a; 
		age = b;
		breed = new String("dog dog");
	}
	public void setName(String a) {
		name = a;
	}
	public void setAge(int a) {
		age = a;
	}
	public void setBreed(String a) {
		breed = a;
	}
	public String getName()  {
		return name;
	}
	public int getAge()  {
		return age;
	}
	public String getBreed()  {
		return breed;
	}
	public boolean isSleeping() {
		Random rand = new Random();
		int x = rand.nextInt(2);
		boolean flag = true;
		if(x==0) {
			flag = true;
		}
		if(x==1) {
			flag = false;
		}
		return flag;
	}
	public void bark() {
		System.out.println(name + " barks");
	}
}
class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Dog dog1 = new Dog("✩Xx_🔥gamergod5523🔥_xX✩");
		dog1.setAge(11);
		Dog dog2 = new Dog("꧁࿇ÐɑʀҟƑîʀɛ࿇꧂","scorpio,gemini on wednesdays >;)");
		boolean flag = true;
		boolean sleep1 = dog1.isSleeping();
		if(sleep1) {
			System.out.println(dog1.name + " is sleeping");
		}
		else{
			dog1.bark();
		}
		
		boolean sleep2 = dog2.isSleeping();
		if(sleep1 == false) {
			dog2.bark();
		}
		
	}
}
