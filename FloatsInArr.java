/* Write a program that reads a set of floating-point values. Ask the user to enter the values, then print:
•	The average of the values
•	The smallest of the values
•	The largest of the values
•	The range, that is the difference between the smallest and the largest
Of course, you may only prompt for the values once. */

import java.util.ArrayList;
import java.util.Scanner;
public class FloatsInArr {	
	public static void main(String[] args) {
		
		ArrayList<Float> inputArr = new ArrayList<Float>();
		Scanner keyboard = new Scanner(System.in);
		boolean continueInput = true;
		float min;
		float max;
		float sum = 0.0f;
		float avg;
	 
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("Enter as many numbers as you please. Integers or decimals are acceptable. Please limit decimals to 1/10,000 place to preserve accuracy.");
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("When done entering values, leave the field blank and press Enter to continue.");
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("I will tell you the average, minimum/maximum values, and the range of the listed values.");
		System.out.println("----------------------------------------------------------------------------------");
		while(continueInput = true) {
			String Entry = keyboard.nextLine();
			if(Entry.trim().length() == 0){
				continueInput = false;
				break;
			}
			try{
				inputArr.add(Float.valueOf(Entry));
			}
			catch(Exception e){
				System.out.println("Invalid Entry; will not be counted . Please try again and enter an integer or decimal.");
			}
		}	
		min = inputArr.get(0);
		max = inputArr.get(0);
		for(int i = 0; i < inputArr.size(); i++){
			sum += inputArr.get(i);
			if (inputArr.get(i) <= min){
				min = inputArr.get(i);
			}
			if (inputArr.get(i) >= max){
				max = inputArr.get(i);
			}
		}
		avg = (sum / inputArr.size());
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("Average of entered values is: " + avg);
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("Minimum value is: " + min);
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("Maximum value is: " + max);
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("Range of entered values is: " + (max - min));
		System.out.println("----------------------------------------------------------------------------------");
	}
}