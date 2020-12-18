/* Write a program that creates a two-dimensional array initialized with test data. Use any primitive 
data type that you wish. The program should have the following methods:
•	getTotal. This method should accept a two-dimensional array as its argument and return the 
total of all the values in the array.
•	getAverage. This method should accept a two-dimensional array as its argument and return the 
average of all the values in the array.
•	getRowTotal. This method should accept a two-dimensional array as its first argument and an 
integer as its second argument. The second argument should be the subscript of a row in the array. 
The method should return the total of the values in the specified row.
•	getColumnTotal. This method should accept a two-dimensional array as its first argument and an 
integer as its second argument. The second argument should be the subscript of a column in the array. 
The method should return the total of the values in the specified column.
•	getHighestInRow. This method should accept a two-dimensional array as its first argument and an 
integer as its second argument. The second argument should be the subscript of a row in the array. 
The method should return the highest value in the specified row of the array.
•	getLowestInRow. This method should accept a two-dimensional array as its first argument and an 
integer as its second argument. The second argument should be the subscript of a row in the array. 
The method should return the lowest value in the specified row of the array.
Demonstrate each of the methods in this program. */

import java.util.Random;
public class IntArrDemo{

	private static int total = 0;
	private static double avg = 0;
	private static int rowTotal = 0;
	private static int columnTotal = 0;
	private static int rowMax;
	private static int columnMax;
	
	public static void initializeArr(int[][] item1){
		for (int c = 0; c < item1.length; c++) {
			for (int d = 0; d < item1[c].length; d++){
				item1[c][d] = (new Random()).nextInt(100);
			}
		}
	}
	public static void printArr(int[][] item1){
		for(int i = 0; i < item1.length; i++){
			for(int j = 0; j < item1.length; j++){
				System.out.print(" " + item1[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}
	public static void getTotal(int[][] item1){
		total = 0;
		for(int i = 0; i < item1.length; i++){
			for(int j = 0; j < item1.length; j++){
				total += item1[i][j];
			}
		}
		System.out.println("Total is: " + total);
	}
	public static void getAverage(int[][] item1){
		total = 0;
		for(int i = 0; i < item1.length; i++){
			for(int j = 0; j < item1.length; j++){
				total += item1[i][j];
			}
		}
		double dblTotal = total;
		avg = dblTotal / (item1.length * item1.length);
		System.out.println("Average is: " + avg);
	}
	public static void getRowTotal(int[][] item1, int a){
		rowTotal = 0;
		for(int i = 0; i < item1.length; i++){
			rowTotal += item1[a - 1][i];
			}
		System.out.println("Rows will start 1 in this program");
		System.out.println("Total of row " + a + " is: " + rowTotal);
	}
	public static void getColumnTotal(int[][] item1, int a){
		columnTotal = 0;
		for(int i = 0; i < item1.length; i++){
			columnTotal += item1[i][a - 1];
			}
		System.out.println("Columns will start 1 in this program");
		System.out.println("Total of column " + a + " is: " + columnTotal);
	}
	public static void getHighestInRow(int[][] item1, int a){
		rowMax = 0;
		for(int i = 0; i < item1.length; i++){
			if (item1[a - 1][i] > rowMax){
				rowMax = item1[a - 1][i];
			}
		}
		System.out.println("Highest value in row " + a + " is: " + rowMax);
	}
	public static void getHighestInColumn(int[][] item1, int a){
		columnMax = 0;
		for(int i = 0; i < item1.length; i++){
			if (item1[i][a - 1] > columnMax){
				columnMax = item1[i][a - 1];
			}
		}
		System.out.println("Highest value in column " + a + " is: " + columnMax);
	}
	public static void main(String[] args){
		System.out.println("I will create a 2d int array with 25 total elements");
		System.out.println("I will fill it with 25 random values of int 0-100");
		int[][] item1 = new int[5][5];
		initializeArr(item1);
		System.out.println("----------------------------------------------------------------------------------");
		printArr(item1);
		getTotal(item1);
		getAverage(item1);
		getRowTotal(item1, 3);
		getColumnTotal(item1, 2);
		getHighestInRow(item1, 4);
		getHighestInColumn(item1, 1);
	}
}