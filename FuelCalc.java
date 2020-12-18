/* Write a program that asks the user to input:

The number of gallons of gas in the tank
The fuel efficiency in miles per gallon
The price of gas per gallon
Then print the cost per 100 miles and how far the car can go with the gas in the car. */

import java.util.Scanner;
public class FuelCalc{
	public static void main(String[] args){
	
		float gallonsInTank;
		float MPG;
		float gasGallonPrice;
		Scanner kbd = new Scanner(System.in);
		
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("I you tell me how much gas is in your tank and how much a gallon of gas costs");
		System.out.println("I will tell you how far you can drive before running out of gas");
		System.out.println("Then how much it costs you to drive 100 miles");
		System.out.println("----------------------------------------------------------------------------------");
		System.out.print("Enter how many of gallons of gas are in your tank: ");
		gallonsInTank = kbd.nextFloat();
		System.out.println("----------------------------------------------------------------------------------");
		System.out.print("Enter your cars fuel efficiency in miles per gallon: ");
		MPG = kbd.nextFloat();
		System.out.println("----------------------------------------------------------------------------------");
		System.out.print("Enter the price of a gallon of gas: $");
		gasGallonPrice = kbd.nextFloat();
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("At $" + gasGallonPrice + " per gallon, driving 100 miles will cost you $" + (100 / MPG) * gasGallonPrice);
		System.out.println("You car gets " + MPG + " MPG and has " + gallonsInTank + " gallons in the tank, you will run out of gas in " + MPG * gallonsInTank + " miles");
	}
}