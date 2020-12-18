/* Write a program that reads a word and prints each character of the word on a separate line. 
For example, if the user provides the input "Harry", the program prints:
H
a
r
r
y */

import java.util.Scanner;
public class VertString{	
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);		 
		System.out.println("Enter any word or phrase and I will print it vertically.");		
		String Entry = keyboard.nextLine();
		int stringSize = Entry.length();
		System.out.println("----------------------------------------------------------------------------------");
		for(int i = 0; i < stringSize; i++){
			System.out.println(Entry.charAt(i));
		}
		System.out.println("----------------------------------------------------------------------------------");
	}
}