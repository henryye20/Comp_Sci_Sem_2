package pkg;

public class Robot {
	
	private boolean fowardMoveBlocked(){
		if(facingRight&&(pos==hall.length)) {
			return true;
		}
		else if((facingRight==false)&&(pos==0)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	private void move() {
		if(hall[pos]>0) {
			x[pos] -= 1;
		}
		
		if(hall[pos]>0) {
			return;
		}
		else if(forwardMoveBlocked==false) {
			if(facingRight) {
				pos = pos+=1;
			}
			else {
				pos = pos-=1;
			}
		}
		else {
			if(facingRight) {
				facingRight = false;
			}
			else {
				facingRight = true;
			}
		}
	}
	
	public int clearHall() {
		while(hallIsClear()==false) {
			move();
			moves +=1;
		}
		return moves;
	}
}
