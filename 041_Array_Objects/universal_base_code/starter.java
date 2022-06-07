import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Wizard[] wizs = new Wizard[100];
		Warrior[] warrs = new Warrior[100];
		int c = 0;
		for(c = 0;c<wizs.length;c++) {
			wizs[c] = new Wizard();
			warrs[c] = new Warrior();
		}
		int x = 0;
		int y = 0;
		while(x<wizs.length&&y<wizs.length) {
			wizs[x].attack(warrs[y]);
			
			if(warrs[y].isDead()) {
				y++;
			}
			if(y==wizs.length) {
				break;
			}
			warrs[y].attack(wizs[x]);
			
			if(wizs[x].isDead()) {
				x++;
			}
			if(x==warrs.length) {
				break;
			}
		}
		if(warrs[99].isDead()) {
			System.out.println("Wizards win!");
			System.out.println("There are " + (100 - x) + " Wizards left");
		}
		if(wizs[99].isDead()) {
			System.out.println("Warriors win!");
			System.out.println("There are " + (100 - y) + " Warriors left");
		}
	}
}
