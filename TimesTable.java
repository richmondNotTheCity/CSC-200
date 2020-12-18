/* Write a program that prints a multiplication table, like this:
1 2 3 4 5 6 7 8 9 10
2 4 6 8 10 12 14 16 18 20
3 6 9 12 15 18 21 24 27 30
…
10 20 30 40 50 60 70 80 90 100 */

public class TimesTable{	
	public static void main(String[] args) {
				 
		System.out.println("Get ready to learn multiplication!");
		for(int i = 1; i < 11; i++){
			System.out.println("----------------------------------------------------------------------------------");
			System.out.print(i * 1 + " ");
			System.out.print(i * 2 + " ");
			System.out.print(i * 3 + " ");
			System.out.print(i * 4 + " ");
			System.out.print(i * 5 + " ");
			System.out.print(i * 6 + " ");
			System.out.print(i * 7 + " ");
			System.out.print(i * 8 + " ");
			System.out.print(i * 9 + " ");
			System.out.print(i * 10);
			System.out.println(" ");
		}
	}
}