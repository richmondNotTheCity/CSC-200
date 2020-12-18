/* A theater seating chart is implemented as a two-dimensional array of ticket prices 
like presented below. Write a program that prompts the users to pick either a seat 
or a price. Mark sold seats by changing the price to zero. When a user specifies a 
seat, make sure it is available. When a user specifies a price, find any seat with 
that price. Verify that the price is among those offered by the theater.
10 10 10 10 10 10 10 10 10 10
10 10 10 10 10 10 10 10 10 10
10 10 10 10 10 10 10 10 10 10
10 10 20 20 20 20 20 20 10 10
10 10 20 20 20 20 20 20 10 10
10 10 20 20 20 20 20 20 10 10
20 20 30 30 40 40 30 30 20 20
20 30 30 40 50 50 40 30 30 20
30 40 50 50 50 50 50 50 40 30 */

import java.util.Scanner;
import java.util.Arrays;
public class MovieSeats1{
	
	private int price = 0;
	private char row;
	private int column = 0;
	private static boolean empty = true;
	public static Scanner kbd = new Scanner(System.in);
	
	public MovieSeats1(){
		price = 0;
		row = 'a';
		column = 0;
	}
	private void fillSeat(){
			empty = false;
	}
	private static void initializeChart(MovieSeats1[][] item1){
		for (int a = 0; a < item1.length; a++){
			for (int b = 0; b < item1[a].length; b++){
				item1[a][b] = new MovieSeats1();
			}
		}
		for (int c = 0; c < item1.length; c++){
			for (int d = 0; d < item1[c].length; d++){
				item1[c][d].column = (d + 1);
			}
		}
		for (int y = 0; y < item1.length; y++){
			for (int z = 0; z < item1.length; z++){
				if (y == 0){
					item1[y][z].row = 'a';
				}
				else if (y == 1){
					item1[y][z].row = 'b';
				}
				else if (y == 2){
					item1[y][z].row = 'c';
				}
				else if (y == 3){
					item1[y][z].row = 'd';
				}
				else if (y == 4){
					item1[y][z].row = 'e';
				}
				else if (y == 5){
					item1[y][z].row = 'f';
				}
				else if (y == 6){
					item1[y][z].row = 'g';
				}
				else if (y == 7){
					item1[y][z].row = 'h';
				}
				else if (y == 8){
					item1[y][z].row = 'i';
				}
				else if (y == 9){
					item1[y][z].row = 'j';
				}
			}
		}
		for (int aa = 0; aa < item1.length; aa++){
			for (int bb = 0; bb < item1.length; bb++){
				if (aa == 0){
					item1[aa][bb].price = 10;
				}
				else if (aa == 1){
					item1[aa][bb].price = 10;
				}
				else if (aa == 2){
					item1[aa][bb].price = 10;
				}
				else if (aa == 3){
					item1[aa][bb].price = 30;
				}
				else if (aa == 4){
					item1[aa][bb].price = 30;
				}
				else if (aa == 5){
					item1[aa][bb].price = 30;
				}
				else if (aa == 6){
					item1[aa][bb].price = 20;
				}
				else if (aa == 7){
					item1[aa][bb].price = 20;
				}
				else if (aa == 8){
					item1[aa][bb].price = 20;
				}
				else if (aa == 9){
					item1[aa][bb].price = 20;
				}
			}
		}	
	}
	private static void printPrice(MovieSeats1[][] item1){
		System.out.println("------------SCREEN-------------");
		for(int i = 0; i < 10; i++){
			for(int j = 0; j < 10; j++){
				System.out.printf(" " + item1[i][j].price);
			}
			System.out.println();
		}
		System.out.println();
	}
	private static void printSeats(MovieSeats1[][] item1){
		System.out.println("------------SCREEN-------------");
		for(int i = 0; i < 10; i++){
			for(int j = 0; j < 10; j++){
				System.out.printf(" " + item1[i][j].row + item1[i][j].column);
			}
			System.out.println();
		}
		System.out.println();
	}
	private static void buyByPrice(MovieSeats1[][] item1){
		System.out.println("Enter the price of the seat you want ($10, $20, or $30) and the first available one will be purchased");
		System.out.print("$");
		int priceInput = kbd.nextInt();
		for(int i = 0; i < 10; i++){
			for(int j = 0; j < 10; j++){
				if(item1[i][j].price == priceInput){
					System.out.println("Great! You have bought seat " + item1[i][j].row + item1[i][j].column + " for $" + item1[i][j].price);
					item1[i][j].price = 0;
					item1[i][j].empty = false;
					i = 10;
					j = 10;
				}
				else{
					continue;
				}
			}
		}
		startMenu(item1);
	}
	private static void buyBySeat(MovieSeats1[][] item1){
		System.out.println("Enter the row letter of the seat you would like to purchase");
		char aa = kbd.next().charAt(0);
		int a = 0;
		if (aa == 'a'){
			a = 0;
		}
		else if (aa == 'b'){
			a = 1;
		}
		else if (aa == 'c'){
			a = 2;
		}
		else if (aa == 'd'){
			a = 3;
		}
		else if (aa == 'e'){
			a = 4;
		}
		else if (aa == 'f'){
			a = 5;
		}
		else if (aa == 'g'){
			a = 6;
		}
		else if (aa == 'h'){
			a = 7;
		}
		else if (aa == 'i'){
			a = 8;
		}
		else if (aa == 'j'){
			a = 9;
		}
		else {
			System.out.println("ERROR");
			startMenu(item1);
		}
		System.out.println("Enter the column number of the seat you would like to purchase");
		int b = (kbd.nextInt() - 1);
		if (item1[a][b].price != 0){
			System.out.println("Great! You have bought seat " + item1[a][b].row + item1[a][b].column + " for $" + item1[a][b].price);
			item1[a][b].price = 0;
			item1[a][b].empty = false;
			startMenu(item1);
		}
		else if (item1[a][b].price == 0){
			System.out.println("Seat is taken. Try again.");
			startMenu(item1);
		}
	}
	private static void startMenu(MovieSeats1[][] item1){
		System.out.println("Below is a grid of available seats by number and then a matching grid by price.");
		printPrice(item1);
		printSeats(item1);
		System.out.println("Enter 1 to buy by seat number");
		System.out.println("Enter 2 to buy by price");
		System.out.println("Enter 0 to exit the program");
		int startEntry = kbd.nextInt();
		if (startEntry == 0){
			System.out.println("EXIT PROGRAM");
			System.exit(0);
		}
		if (startEntry == 1){
			buyBySeat(item1);
		}
		if (startEntry == 2){
			buyByPrice(item1);
		}
		else{
			System.out.println("Ridiculous! What have you done? Starting over...");
			startMenu(item1);
		}
	}
	public static void main(String[] args){
		MovieSeats1[][] item1 = new MovieSeats1[10][10];
		initializeChart(item1);
		startMenu(item1);
	}	
}