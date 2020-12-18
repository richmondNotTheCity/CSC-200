/* Write a program that prompts the user for a measurement in meters, 
and then converts it into miles, feet, and inches. */

import java.util.Scanner;
public class ConvertDistance{
	public static void main(String[] args){
		
		double meters;
		double miles;
		double feet;
		double inches;
		double metersToMiles = 0.000621371;
		double metersToFeet = 3.28084;
		double metersToInches = 39.2701;
		Scanner kbd = new Scanner(System.in);
		
		System.out.println("I will convert a distance in meters to inches, feet, and miles");
		System.out.print("Enter a number of meters (fractions are acceptable) in decimal format: ");
		meters = kbd.nextDouble();
		miles = meters * metersToMiles;
		feet = meters * metersToFeet;
		inches = meters * metersToInches;
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("You entered " + meters + " meters");
		System.out.println("That is equal to " + miles + " miles");
		System.out.println("Or " + feet + " feet");
		System.out.println("Or " + inches + " inches");
		System.out.println("----------------------------------------------------------------------------------");
		
	}
}