package pkg;
import java.util.Scanner;
import java.util.Random;



	public Hangman() {
		guessingWord = generateWord();
		numTries = 5;
		
	}
	public Hangman(int a) {
		guessingWord = generateWord();
		numTries = a;
	}
	public int guessFirst(String b, int c) {
		int count = -1;
		while(count<b.length()) {
			if(b == guessingWord.substring(count,count+1)) {
				count =	
			}
			count++
		}
		
		
	}
	public booleancheckWin(boolean[]x) {
		
	}


