/* Write a program that reads a sequence of input values and displays a bar chart of the values in data, 
using asterisks, like this:
*********************
*************************
*********
**************************
You may assume that all values are positive. First figure out the maximum value in data. That value's 
bar should be drawn with 40 asterisks. Shorter bars should use proportionally fewer asterisks. 
Improve your program by adding caption to your bar. Prompt the user for the captions and data values. 
The output should look like this:
Egypt *********************
France *************************
Norway *********
Germany ************************** */

import java.util.Scanner;
public class AstGraph{

	private String[] Name = new String[5];
	private int[] value = new int[5];
	private int max;
	public Scanner kbd = new Scanner(System.in);
	public void setName(int a){
			System.out.println("Please enter name of student #" + (a + 1));
			Name[a] = kbd.next();
	}
	public void setValue(int a){
			System.out.println("Please enter test score (out of 40) for student #" + (a + 1));
			value[a] = kbd.nextInt();
	}
	public void setBoth(){
		for (int i = 0; i < 5; i++){
			this.setName(i);
			this.setValue(i);
		}
	}
	public void findMax(){
		max = value[0];
		for (int i = 0; i < 5; i++){
			if(max < value[i]){
				max = value[i];
			}
			else{
				continue;
			}
		}
		System.out.println("Maximum value is: " + max);
	}
	public void printAst(int a){
		for (int i = 0; i < value[a]; i++){
			System.out.print("*");
		}
	}
	public void displayOutput(){
		for (int i = 0; i < 5; i++){	
			System.out.println(Name[i]);
			this.printAst(i);
			System.out.println();
		}
	}
	public static void main(String[] args){

	AstGraph item1 = new AstGraph();
	
	System.out.println("----------------------------------------------------------------------------------");
	System.out.println("I will calculate the test scores of five students and print them as a graph");
	System.out.println("I will ask for the first name of each of the five students");
	System.out.println("and for the number of questions they got right out of 40");
	System.out.println("----------------------------------------------------------------------------------");
	item1.setBoth();
	System.out.println();
	System.out.println();
	System.out.println();
	item1.displayOutput();
 	item1.findMax();
	}
}