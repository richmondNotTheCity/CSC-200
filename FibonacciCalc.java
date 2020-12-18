/* The Fibonacci numbers are defined by the sequence:
f1 = 1
f2 = 1
fn = fn-1 + fn-2.
Reformulate that as
Fold1 = 1;
Fold2=1;
Fnew=fold1+fold2;
After that, discard fold2, which is no longer needed, and set fold2 to fold1, and fold1 to fnew. 
Repeat an appropriate number of times.
Implement a program that prompts the user for an integer n and prints the nth Fibonacci number, using the above algorithm. */

import java.util.Scanner;
public class FibonacciCalc{	
	public static void main(String[] args){
		
		int i = 0;
		int fold1 = 0;
		int fold2 = 1;
		int fNew = fold1 + fold2;
		Scanner keyboard = new Scanner(System.in);
				 
		System.out.print("Enter any number and I will tell you the value at it's place in the Fibonacci sequence: ");
		int entry = keyboard.nextInt();
		for(i = 0; i < entry; i++){
			fNew = fold1 + fold2;
			fold2 = fold1;
			fold1 = fNew;
		}
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println(fNew + " is at place number " + entry + " in the Fibonacci sequence.");
		System.out.println("----------------------------------------------------------------------------------");
	}
}