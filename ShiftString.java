/* Read a word from the user and display the string with the letters shifted 
to the right by two positions and with the letters shifted to the left by two 
positions in the string. Save all of the three strings in separate variables 
and display all three of them at the end of the program. */

import java.util.Scanner;
public class ShiftString{
	public static void main(String[] args){
		
	int length;
	String word, leftShift, rightShift = new String();
	Scanner kbd = new Scanner(System.in);
	
	System.out.print("Enter a word or phrase: ");
	word = kbd.nextLine();
	length = word.length();
	rightShift = word.substring( 0, length - 2);
	leftShift = word.substring(2, length);
	System.out.println("-------------------------------------------------------");
	System.out.println("2 to the right: " + rightShift);
	System.out.println("2 to the left: " + leftShift);
	}
}