package pkg;

public class CVMath {		
	public static int findMid(int one, int two, int three)
	{
		return (one + two + three - Math.min(one,Math.min(two,three)) - Math.max(one,Math.max(two,three)));
	}
	
	private static boolean checkSpec(int n) {
		int c = 0;
		int sum = 0;
		while(true) {
			sum = sum + c;
			if(sum==n)
				return true;
			if(sum>n)
				return false;
			c++;
		}
		
	}
	
	private static boolean checkSqr(int n) {
		int c = 0;
		int sum = 0;
		while(true) {
			sum = c*c;
			if(sum==n)
				return true;
			if(sum>n) 
				return false;
			c++;
		}
		
	}
	
	public static void specialSquare(int n) {
		int c = 0;
		int num = 1;
		while(c<n) {
			if(checkSpec(num)&&checkSqr(num)) {
				System.out.println(num);
				c++;
			}
			num++;
		}
		return;
	}
	
}
