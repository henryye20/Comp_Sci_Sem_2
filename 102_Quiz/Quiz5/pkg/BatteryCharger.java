package pkg;
import java.util.Scanner;
import java.util.Random;


public class BatteryCharger {

	private int getChargingCost(int startHour, int chargeTime) {
		int start = startHour;
		int cost = 0;
		if(0<=startHour&&startHour<=23) {
			for(int hours=chargeTime;hours>0;hours--) {
				if(start==24){
					start = 0;
				}
				cost += rateTable[start];
				start++;
			}
			
		}
		return cost;
	}
	
	public int getChargeStartTime(int chargeTime) {
		int check = 0;
		int best = getChargingCost(0,chargeTime);
		for(int c = 0;while c<rateTable.length;c++) {
			check = getChargingCost(c,chargeTime);
			if(check<best) {
				best = c;
			}
		}
		return best;
	}

}

