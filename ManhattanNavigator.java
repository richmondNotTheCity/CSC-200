/* This problem is the Problem 4 in Module 2 for the algorithm project. Now you already have the algorithm 
and you can copy it here. You still need to write the source code and take a screenshot of the running program. 
Imagine yourself in the middle of Manhattan, where the streets are perpendicular on avenues. You are in a grid 
of streets, somewhat lost, and you randomly pick one of four directions and walk to the next intersection. Not 
knowing where you really want to go, you again randomly pick one of the four directions, and so on. After repeating 
the same movement for a number of times, you may want to know how far you got from the original point.
Represent locations as integer pairs(x,y). Create an algorithm that implements your movement through New York City, 
over 100 intersections, starting at (0,0) and print the ending location, taking into consideration that each movement, 
from one intersection to another will be one mile. */

import java.util.Scanner;
public class ManhattanNavigator{	
	public static void main(String[] args) {
		
		int x = 0;
		int y = 0;
		int i = 0;
		String North = "North";
		String South = "South";
		String East = "East";
		String West = "West";
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("I will help you navigate Manhattan.");
		System.out.println("Assuming your starting coordinates are 0,0, enter the direction you choose to go and repeat after each mile.");
		System.out.println("Please enter the full name of the direction with no whitespace or symbols. Case sensitivity is not needed.");
		System.out.println("----------------------------------------------------------------------------------");
		for(i = 0; i < 100; i++) {
			System.out.println("You are here: (" + x + " , " + y + ")");
			System.out.println("Enter the direction you are going to walk to the next intersection. North, South, East, or West.");
			System.out.println("----------------------------------------------------------------------------------");
			System.out.print("Direction: ");
			String Entry = keyboard.nextLine();
			if(Entry.equalsIgnoreCase(North)){
				y ++;
			}
			else if(Entry.equalsIgnoreCase(South)){
				y --;
			}
			else if(Entry.equalsIgnoreCase(East)){
				x ++;
			}
			else if(Entry.equalsIgnoreCase(West)){
				x --;
			}
			else{
				System.out.println("Invalid entry; will not be counted . Please try again and enter North, South, East, or West");
				i --;
			}
			System.out.println("----------------------------------------------------------------------------------");
		}
		System.out.println("You have now walked 100 blocks. WOW!");
		System.out.println("Here are your final coordinates: (" + x + " , " + y + ")");
	}
}