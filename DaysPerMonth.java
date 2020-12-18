/* Write a program asks the user to enter a month (1 for January, 2 for February, and so on) 
and then prints the number of days in the month. For February, print "28 or 29 days".
For example:
Enter a month: 5
30 days
Do not use a separate if/else branch for each month. Use Boolean operators. */

import java.util.Scanner;
public class DaysPerMonth{	
	public static void main(String[] args) {
		
		int monthInput;
		Scanner keyboard = new Scanner(System.in);
				 
		System.out.println("Enter the number of a month (1-12) and I will tell you how many days it has.");
		System.out.print("Enter month number: ");
		monthInput = keyboard.nextInt();
		
		if (monthInput == 1 | monthInput == 3 | monthInput == 5 | monthInput == 7 | monthInput == 8 | monthInput == 10 | monthInput == 12){
			System.out.println("The month you entered has 31 days.");
		}
		else if (monthInput == 4 | monthInput == 6 | monthInput == 9 | monthInput == 11){
			System.out.println("The month you entered has 30 days.");
		}	
		else if (monthInput == 2){
			System.out.println("The month you entered has either 28 or 29 days; depending on leap year.");
		}
		else{
			System.out.println("Invalid Entry. END PROGRAM");
		}
	}
}