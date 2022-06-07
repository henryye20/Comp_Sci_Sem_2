package pkg;
import java.util.Scanner;
import java.util.Random;


public class HorseBarn() {
	
	public int findHorseSpace(String name) {
		String nam = "";
		for(int c = 0;c<spaces.length();c++) {
			nam = spaces[c].getName();
			if(name.equals(nam)) {
				return c;
			}
		}
		return -1;
	}
	
	public void consolidate() {
		int c = 0;
		int i = 0;
		for(c = 0;c<spaces.length;c++) {
			if(spaces[c] = null) {
				for(i = c+1;i<spaces.length;i++) {
					if(spaces[i] != null) {
						spaces[c] = spaces[i];
						spaces[i] = null;
					}
				}
			}
		}
		
		//or
		
		Horse[]newarray = new Horse[spaces.length];
		int c = 0;
		for(int i =0;i<spaces.length;i++) {
			if(spaces[i]!=null) {
				newarray[x] = spaces[i];
				x++;
			}
		}
		for(int i = 0;i<spaces.length;i++) {
			spaces[i] = newarray[i];
		}
	}


}

}
