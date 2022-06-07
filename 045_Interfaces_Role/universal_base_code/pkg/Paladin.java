package pkg;
import java.util.Scanner;
import java.util.Random;

public class Paladin implements Role {
	Random rand = new Random();
	String name;
	int health;
	int attack;

	public Paladin() {
		Random rand = new Random();
		name = "Paladin";
		health = rand.nextInt(15)+1;
		attack = rand.nextInt(15)+1;
		
	}
	
	public Paladin(String name) {
		Random rand = new Random();
		this.name = name;
		health = rand.nextInt(15)+1;
		attack = rand.nextInt(15)+1;
	}
	
	public void setHealth(int health) {
		this.health = health;
	}
	
	public int getHealth() {
		return health;
	}
	
	public String getName() {
		return name;
	}
	
	public void attack(Role x){
		int h = x.getHealth();
		int damage = rand.nextInt(this.attack)+1;
		x.setHealth(h-damage);
	}
	
	public void printArt() {
		System.out.println(" art ");
		System.out.println(" art ");
		System.out.println(" art ");
		System.out.println(" art ");
	}
}

