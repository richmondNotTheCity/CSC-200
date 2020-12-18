/* Write a program that initializes an array with ten random integers and then prints out the following:
•	Every element at an even index;
•	Every even element
•	All elements in reverse order;
•	Only the first and last elements;
•	The minimum and maximum element
•	The sum of all elements
•	The alternating sum of all elements, where the alternating sum contains all elements at even index 
added, and the elements at odd index subtracted. */

import java.util.Random;
import java.util.Arrays;
public class RandIntArray{
	
    private int [] randArr = new int [10];
	private int arrLength = randArr.length;
	private int max;
	private int min;
	private int sum = 0;
	private int altSum = 0;
	
	private static int randomEntry(){
		return (new Random()).nextInt(100);
	}
	public void fillArr(){
		for (int i = 0; i < 10; i++){
			randArr[ i ] = randomEntry();
		}
	}
	public void printArr(){
		for (int i = 0; i < 10; i++){ 
			System.out.println("Index " + i + ": " + randArr[ i ]);
		}
	}
	public void printReverse(){
		for (int i = 9; i > -1; i--){ 
			System.out.println("Index " + i + ": " + randArr[ i ]);
		}
	}
	public void findMax(){
		max = randArr[0];
		for (int i = 0; i < 10; i++){
			if (max < randArr[i]){
				max = randArr[i];
			}
			else{
				continue;
			}
		}
		System.out.println("Maximum value in array is: " + max);
	}
	public void findMin(){
		min = randArr[0];
		for (int i = 0; i < 10; i++){
			if (min > randArr[i]){
				min = randArr[i];
			}
			else{
				continue;
			}
		}
		System.out.println("Minimum value in array is: " + min);
	}
	public void printEvenIndex(){
		System.out.println("Even indexes are: ");
		for (int i = 0; i < 10; i++){ 
			if(i == 0){
				System.out.println("Index " + i + ": " + randArr[ i ]);
			}
			else if(i % 2 == 0){
				System.out.println("Index " + i + ": " + randArr[ i ]);
			}
			else{
				continue;
			}
		}
	}
	public void printOddIndex(){
		System.out.println("Odd indexes are: ");
		for (int i = 0; i < 10; i++){ 
			if(i % 2 != 0){
				System.out.println("Index " + i + ": " + randArr[ i ]);
			}
			else{
				continue;
			}
		}
	}
	public void getFirstLast(){
		System.out.println("First element is: " + randArr[0]);
		System.out.println("Last element is: " + randArr[9]);
	}
	public void printEvenElements(){
		System.out.println("Here are all of the even elements: ");
		for (int i = 0; i < 10; i++){ 
			if((randArr[i] + 2) % 2 == 0){
				System.out.println(randArr[ i ]);
			}
			else{
				continue;
			}
		}
	}
	public void printSum(){
		for (int i = 0; i < 10; i++){ 
			sum += (randArr[i]);
		}
		System.out.println("Sum of all elements is: " + sum);		
	}
	public void printAltSum(){
		for (int i = 0; i < 10; i++){ 
			if((i + 2) % 2 == 0){
					altSum = (altSum + randArr[i]);
			}
			else if ((i + 2) % 2 != 0){
				altSum = (altSum - randArr[i]);
			}
		}
		System.out.println("Sum of all elements where even indexed elements are added");		
		System.out.println("and odd indexed elements are subtracted is: " + altSum);		
	}	
	public static void main(String[] args) {
		RandIntArray item1 = new RandIntArray();
		item1.fillArr();
		System.out.println("I will create an integer array and fill it with 10 random values");
		System.out.println("I will then  print all output required for the assignment");
		System.out.println("----------------------------------------------------------------------------------");
		item1.printArr();
		System.out.println("----------------------------------------------------------------------------------");
		item1.printReverse();
		System.out.println("----------------------------------------------------------------------------------");
		item1.findMax();
		item1.findMin();
		System.out.println("----------------------------------------------------------------------------------");
		item1.printEvenIndex();
		System.out.println("----------------------------------------------------------------------------------");
		item1.printOddIndex();
		System.out.println("----------------------------------------------------------------------------------");
		item1.getFirstLast();
		System.out.println("----------------------------------------------------------------------------------");
		item1.printEvenElements();
		System.out.println("----------------------------------------------------------------------------------");
		item1.printSum();
		System.out.println("----------------------------------------------------------------------------------");
		item1.printAltSum();
	}
}