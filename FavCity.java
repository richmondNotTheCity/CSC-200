/* Write a program that asks the user to enter the name of his or her favorite city. 
use a String variable to store the input. The program should display the following:

•	The number of characters in the city name
•	the name of the city in all uppercase letters
•	the name of the city in all lower case letters
•	the first character in the name of the city */

import java.util.Scanner;
public class FavCity{
	public static void main(String[] args){
	
		int length;
		int charCount;
		String city = new String();
		String charOnly = new String();
		Scanner kbd = new Scanner(System.in);
		
		System.out.print("Enter your favorite city: ");
		city = kbd.nextLine();
		charOnly = city.replaceAll("\\s", "");
		length = city.length();
		charCount = charOnly.length();
		System.out.println("The city you entered is: " + city);
		System.out.println("It has " + charCount + " characters");
		System.out.println("Uppercase: " + city.toUpperCase());
		System.out.println("Lowercase: " + city.toLowerCase());
		System.out.println("First character: " + city.charAt(0));
	}
}