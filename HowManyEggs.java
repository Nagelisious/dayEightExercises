package dayeightexercises;

import java.util.Scanner;

public class HowManyEggs {

	public static void main(String[] args) {
		// variable user will enter
		int numOfEggs;
		int grossEggs;
		int dozenEggs;
		Scanner eggInput = new Scanner(System.in);

		System.out.println("Enter how many eggs you have");
		numOfEggs = eggInput.nextInt();
		// calculate gross = 144
		grossEggs = numOfEggs / 144;
		numOfEggs %= 144;
		// calculate dozen = 12
		dozenEggs = numOfEggs / 12;
		numOfEggs %= 12;
		// syso eggs
		System.out.println("Your number of eggs is " + grossEggs + " gross, " + dozenEggs + " dozen eggs, and " + numOfEggs);

		eggInput.close();
	}

}
