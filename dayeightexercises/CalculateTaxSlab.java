package dayeightexercises;

import java.util.Scanner;

public class CalculateTaxSlab {

	public static void main(String[] args) {
		// variables user will enter
		String gender;
		double incomeEntered;
		Scanner genderScan = new Scanner(System.in);
		Scanner incomeScan = new Scanner(System.in);

		System.out.println("Please enter your gender, M for male and F for female:");
		// will loop if user does not enter m, M, f, F
		do {
			gender = genderScan.nextLine();
			// male income tax slab
			if (gender.toUpperCase().equals("M")) {
				System.out.println("Please enter your income: ");
				// will loop if user enters negative value
				do {
					incomeEntered = incomeScan.nextDouble();
					
					if (incomeEntered < 0) {
						System.out.println("Please enter a positive value");
					} else if (incomeEntered <= 180000) {
						System.out.println("No tax payable");
					} else if (incomeEntered <= 500000) {
						System.out.println("You pay 10% of your income as taxes");
					} else if (incomeEntered <= 800000) {
						System.out.println("You pay 20% of your income as taxes");
					} else {
						System.out.println("You pay 30% of your income as taxes");
					}
				} while (incomeEntered > 0);
			// female income tax slab
			} else if (gender.toUpperCase().equals("F")) {
				System.out.println("Please enter your income: ");
				// will loop if user enters negative value
				do {
					incomeEntered = incomeScan.nextDouble();
					
					if (incomeEntered < 0) {
						System.out.println("Please enter a positive value");
					} else if (incomeEntered <= 190000) {
						System.out.println("No tax payable");
					} else if (incomeEntered <= 500000) {
						System.out.println("You pay 10% of your income as taxes");
					} else if (incomeEntered <= 800000) {
						System.out.println("You pay 20% of your income as taxes");
					} else {
						System.out.println("You pay 30% of your income as taxes");
					}
				} while (incomeEntered > 0);
			} else {
				System.out.println("Please enter an M or an F");
			}
		} while (!gender.toUpperCase().equals("M") || !gender.toUpperCase().equals("F"));

		genderScan.close();
		incomeScan.close();
	}

}
