/* The original US income tax of 1913 was quite simple. The tax was:
•	1 percent on the first $50,000
•	2 percent on the amount over $50,000 up to $75,000
•	3 percent on the amount over $75,000 up to $100,000
•	4 percent on the amount over $100,000 up to $250,000
•	5 percent on the amount over $250,000 up to $500,000
•	6 percent on the amount over $500,000.
There was no separate schedule for single or married taxpayers. 
Write a program that computes the income tax according to this schedule. */

import java.util.Scanner;
public class IncomeTax1913{	
	public static void main(String[] args) {
		
		double incomeLevel1 = 0;
		double incomeLevel2 = 0;
		double incomeLevel3 = 0;
		double incomeLevel4 = 0;
		double incomeLevel5 = 0;
		double incomeLevel6 = 0;
		double incomeTax = 0;
		Scanner keyboard = new Scanner(System.in);
		 
		System.out.println("I will tell you how much you would owe in income taxes in 1913");
		System.out.print("Please enter your yearly income: $");
		final double INCOME_INPUT = keyboard.nextDouble();
		if (INCOME_INPUT <= 50000){ 
			incomeLevel1 = (INCOME_INPUT * .01);
		}
		else if (INCOME_INPUT > 50000 && INCOME_INPUT <= 75000){ 
			incomeLevel1 = 50000 * .01;
			incomeLevel2 = (INCOME_INPUT - 50000) * .02;
		}	
		else if (INCOME_INPUT > 75000 && INCOME_INPUT <= 100000){ 
			incomeLevel1 = 50000 * .01;
			incomeLevel2 = 25000 * .02;
			incomeLevel3 = (INCOME_INPUT - 75000) * .03;
		}
		else if (INCOME_INPUT > 100000 && INCOME_INPUT <= 250000){ 
			incomeLevel1 = 50000 * .01;
			incomeLevel2 = 25000 * .02;
			incomeLevel3 = 25000 * .03;
			incomeLevel4 = (INCOME_INPUT - 100000) * .04;
		}
		else if (INCOME_INPUT > 250000 && INCOME_INPUT <= 500000){ 
			incomeLevel1 = 50000 * .01;
			incomeLevel2 = 25000 * .02;
			incomeLevel3 = 25000 * .03;
			incomeLevel4 = 150000 * .04;
			incomeLevel5 = (INCOME_INPUT - 150000) * .05;
		}
		else if (INCOME_INPUT > 500000){ 
			incomeLevel1 = 50000 * .01;
			incomeLevel2 = 25000 * .02;
			incomeLevel3 = 25000 * .03;
			incomeLevel4 = 150000 * .04;
			incomeLevel5 = 250000 * .05;
			incomeLevel6 = (INCOME_INPUT - 250000) * .06;
		}
		incomeTax = incomeLevel1 + incomeLevel2 + incomeLevel3 + incomeLevel4 + incomeLevel5 + incomeLevel6;	 
		System.out.println("Your income was: $" + INCOME_INPUT );
		System.out.println("In 1913 you would owe: $" + incomeTax + " in taxes.");
	}
}
