package pkg;
import java.util.Scanner;
import java.util.Random;


public interface Creature {
	boolean isDead();
	boolean takeDamage(int x);
	String getName();
	void attack(Role x);
	void talk();

}

