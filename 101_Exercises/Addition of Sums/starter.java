import java.util.*;



class starter {
	
	public static int function(int x,int y){
		if(x==1) {
		return x+y;
		}
		else {
			return x + function(x-1, y);
		}
	
	}
	public static void main(String args[]) {
		System.out.print(function(5,2));
}



		
	}
