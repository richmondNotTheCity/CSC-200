/* Design and implement an application that reads a sequence of up to 25 pairs of names and 
postal (ZIP) codes for individuals. Store the data in an object designed to store a first 
name (string), last name (string), and postal code (integer). Assume each line of input will 
contain two strings followed by an integer value, each separated by a tab character. Then, 
after the input has been read in, print the list in an appropriate format to the screen */

import java.util.Scanner;
public class FirstLastZip{

	public static Scanner kbd = new Scanner(System.in);
	private String First;
	private String Last;
	private int zipCode;
	
	public FirstLastZip(String A,	String B,	int postCode){
		First = A;
		Last = B;
		zipCode = postCode;
	}
	public String getFirst(){
		return First;
	}
	public String getLast(){
		return Last;
	}
	public int getZipCode(){
		return zipCode;
	}
	public static void main(String[] args){
		
		FirstLastZip[] item1 = new FirstLastZip[25];
		
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("This program will accept the first name, last name, and zip code of up to 25 individuals");
		System.out.println("It will store the info in an array and will print it neatly afterwards");
		System.out.println("How many entries (up to 25) would you like to make?");
		int x = kbd.nextInt();
		System.out.println("Cool. Please make " + x + " entries of firstname/lastname/zipcode and separate values with TAB");
		System.out.println("----------------------------------------------------------------------------------");
		for (int i = 0; i < x; i++){
			System.out.println("Please make entry #" + (i+1));	
			item1[i] = new FirstLastZip(kbd.next(), kbd.next(), kbd.nextInt());
			System.out.println("----------------------------------------------------------------------------------");
		}
		System.out.println("Now I will print your entries in the order they were entered");
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("FIRST" + "\t" + "LAST" + "\t" + "ZIP");
		System.out.println("----------------------------------------------------------------------------------");
		for (int i = 0; i < x; i++){
			System.out.println(item1[i].getFirst() + "\t" + item1[i].getLast() + "\t" + item1[i].getZipCode());
		}
	}
}