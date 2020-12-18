/* Write a program that prompts the user for a measurement in meters, 
and then converts it into miles, feet, and inches. */

import java.util.Scanner;
public class PrintVertInt{
	public static void main(String[] args){
		
		int length;
		int inputNumber;
		Scanner kbd = new Scanner(System.in);
		
		System.out.println("If you input a positive integer I will print it vertically");
		System.out.print("Please enter the integer: ");
		inputNumber = kbd.nextInt();
		String InputAsString = String.valueOf(inputNumber);
		length = InputAsString.length();
		System.out.println("----------------------------------------------------------------------------------");
		for (int i = 0; i < length; i++){
			System.out.println(InputAsString.charAt(i));
		}
		System.out.println("----------------------------------------------------------------------------------");
	}
}