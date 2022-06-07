package pkg;
import java.util.Scanner;
import java.util.Random;


public class Zombie implements Creature {
	String name;
	int health;
	int attack;
	
	public Zombie() {
		Random rand = new Random();
		name = "Zack";
		health = rand.nextInt(6)+5;
		attack = rand.nextInt(6)+5;
	}
	
	public boolean isDead() {
		if(health <= 0) {
			return true;
		}
		return false;
	}
	
	public boolean takeDamage(int dmg) {
		health = health - dmg;
		return this.isDead();
	}
	
	public String getName() {
		return name;
	}
	
	public void attack(Role x) {
		x.setHealth(x.getHealth() - attack);
	}
	
	public void talk() {
		System.out.println("test");
	}
	

}

