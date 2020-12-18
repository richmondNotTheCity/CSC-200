/* Write a program that reads in the name and salary of an employee. Here the salary will denote an hourly wage, 
such as $9.25. Then ask how many hours the employee worked in the past week. Be sure to accept fractional hours. 
Compute the pay. Any overtime work (over 40 hours per week) is paid at 150 percent of the regular wage. Print a 
paycheck for the employee: */

import java.util.Scanner;
public class WeekPaycheck{	
	public static void main(String[] args) {
		
		double payAmount = 0;
		double otPayAmount = 0;
		double totalPay = 0;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("I can calculate your weekly pay.");
		System.out.print("Please enter your hourly wage in US dollars, you can enter fractions too: $");
		final double DOLLARS_PER_HOUR = keyboard.nextDouble();
		System.out.print("Please enter how many hours you worked this week, you can enter decimal places too: ");
		final double HOURS_WORKED = keyboard.nextDouble();
		if (HOURS_WORKED > 40){ 
			payAmount = DOLLARS_PER_HOUR * 40 ;
			otPayAmount = (HOURS_WORKED - 40 ) * (DOLLARS_PER_HOUR * 1.5) ;
			totalPay = payAmount + otPayAmount ;
		}
		else{
			totalPay = DOLLARS_PER_HOUR * HOURS_WORKED ;
		} 
		System.out.println("You worked " + HOURS_WORKED + " hours and your normal rate of pay is: $" + DOLLARS_PER_HOUR + " per hour.");
		System.out.println("Your overtime pay is: $" + otPayAmount + " and your total paycheck for this week is: $" + totalPay);
	}
}