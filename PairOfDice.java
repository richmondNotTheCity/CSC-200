/* Using the Die class defined in the document, Die.java, design and implement a class called PairOfDice, 
composed of two Die objects. Include methods to set and get the individual die values, a method to 
roll the dice, and a method that returns the current sum of the two die values. Create a driver class 
called RollingDice2 to instantiate and use a PairOfDice object. */

public class PairOfDice {

    public int die1;
    public int die2;
    
    public PairOfDice(){
        roll();
    }
	public void setDie1(int die1){
		this.die1 = die1;
	}
	public void setDie2(int die2){
		this.die2 = die2;
	}
	public int getDie1(){
		return die1;
	}
	public int getDie2(){
		return die2;
	}
	public int getDieTotal(){
		return (die1 + die2);
	}
    public PairOfDice(int val1, int val2){
        die1 = val1; 
        die2 = val2; 
    }
    public void roll(){
        die1 = (int)(Math.random()*6) + 1;
        die2 = (int)(Math.random()*6) + 1;
    }
}