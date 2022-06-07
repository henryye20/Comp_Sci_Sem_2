package pkg;
import java.util.Scanner;
import java.util.Random;


public class CombinedTable {
	private int totalseats = 0;
	SingleTable[] singles = new SingleTable[2];
	
	
	public CombinedTable(SingleTable a, SingleTable b) {
		totalseats = (a.getNumSeats + b.getNumSeats)-2;
		singles[0] = a;
		singles[1] = b;
		
	}
	
	public boolean canSeat(int x) {
		int h1 = singles[0].getNumSeats();
		int h2 = singles[1].getNumSeats();
		int comb = h1+h2-2;
		totalseats = comb;
		if(x<=totalseats) {
			return true;
		}
		else {
			return false;
		}
	}

	public double getDesirability() {
		int h1 = singles[0].getHeight();
		int h2 = singles[1].getHeight();
		double v1 = singles[0].getViewQuality();
		double v2 = singles[1].getViewQuality();
		double avg = (v1+v2)/2;
		
		if(h1=h2) {
			return avg;
		}
		else {
			return avg-10;
		}
	}
}

