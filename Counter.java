/* Define a class called Counter. An object of this class is used to count things so it records a count 
that is a non-negative whole number. Include methods to set the counter to 0, to increase the counter 
by 1, and to decrease the counter by 1. Be sure that no method allows the value of the counter to become 
negative. Also include an accessor method that returns the current count value, as well as a method 
that displays the count on the screen. Do not define an input method. The only method that can set the 
counter is the one that sets it to zero. Write a program to test your class definition. 
(Hint: you need only one instance variable). */

public class Counter{
	
	private int counterVal = 0;

	private void resetCounter(){
		counterVal = 0;
	}
	private void increaseCounter(){
		counterVal = counterVal + 1;
	}
	private void decreaseCounter(){
		
		if (counterVal >= 1){
			counterVal --;
		}
		else{	
			System.out.println("Counter is currently at zero. Negative values are forbidden.");
		}
	}
	private int getCounterValue(){
		return counterVal;
	}
	private void tostringCounter(){
		System.out.println("Currently the counter reads: " + counterVal);
	}
	public static void main (String[] args){
		Counter demoCounter = new Counter();
		System.out.println("Initial counter value is: " + demoCounter.getCounterValue());

		for (int i = 0; i < 5; i++){
			demoCounter.increaseCounter();
			System.out.println("Increase by 1: " + demoCounter.getCounterValue());
		}
		System.out.println("Counter has been increased 5 times");
		demoCounter.tostringCounter();
		for (int i = 0; i < 5; i++){
			demoCounter.decreaseCounter();
			System.out.println("Decrease by 1: " + demoCounter.getCounterValue());
		}
		System.out.println("The Counter has been decreased 5 times now");
		demoCounter.tostringCounter();
		System.out.println("The Counter cannot go below 0 ");
		System.out.println("Here is what we see if we try to go below 0");
		demoCounter.decreaseCounter();
		for (int i = 0; i < 5; i++){
			demoCounter.increaseCounter();
			System.out.println("Increase by 1: " + demoCounter.getCounterValue());
		}
		System.out.println("Now we can reset the counter using method resetCounter()");
		demoCounter.tostringCounter();
		demoCounter.resetCounter();
		System.out.println("Let's check the Counter value after resetting using demoCounter.tostringCounter(): ");
		demoCounter.tostringCounter();
	}
 }