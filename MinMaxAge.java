/* Write a program that reads the ages of three persons from the user, 
and decides who is the oldest, and who the youngest person is: */

import java.util.Scanner;
public class MinMaxAge{	
	public static void main(String[] args){
		
		int maxAge = 0;
		int minAge = 0;
		int youngest = 0;
		int oldest = 0;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("If you tell me the ages of 3 individuals, I will tell you which one is the oldest and which one is the youngest.");
		System.out.print("Please enter the age of individual number 1: ");
		int individual1 = keyboard.nextInt();
		System.out.print("Please enter the age of individual number 2: ");
		int individual2 = keyboard.nextInt();
		System.out.print("Please enter the age of individual number 3: ");
		int individual3 = keyboard.nextInt();
		if (individual1 > individual2 && individual1 > individual3){
			maxAge = individual1;
			oldest = 1;
		}
		if (individual2 > individual1 && individual2 > individual3){
			maxAge = individual2;
			oldest = 2;
		}
		if (individual3 > individual1 && individual3 > individual2){
			maxAge = individual3;
			oldest = 3;
		}
		if (individual1 < individual2 && individual1 < individual3){
			minAge = individual1;
			youngest = 1;
		}
		if (individual2 < individual1 && individual2 < individual3){
			minAge = individual2;
			youngest = 2;
		}
		if (individual3 < individual2 && individual3 < individual1){
			minAge = individual3;
			youngest = 3;
		}
		System.out.println("The youngest person's age is " + minAge + " and the oldest one is " + maxAge + " years old");
		System.out.println("Individual " + youngest + " is the youngest");
		System.out.println("Individual " + oldest + " is the oldest");
	}
}