import pkg.*;
import java.util.Scanner;
import java.util.Random;


public static int[] getCubeTosses(NumberCube cube, int numTosses ) {
	int[]x = new int[numTosses];
	//numTosses>0 how tf is this supposed to work ????
	while(numTosses>0) {
		x[numTosses] = cube.toss();
		numTosses--;
	}
}
