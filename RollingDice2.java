public class RollingDice2{	
	public static void main(String[] args) {
		
		PairOfDice DiceTwice = new PairOfDice();
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("I will simulate the rolling of two six-sided dice.");
		System.out.println("----------------------------------------------------------------------------------");
		DiceTwice.setDie1(21);
		DiceTwice.setDie2(21);
		DiceTwice.roll();
		DiceTwice.getDieTotal();
		System.out.println("The total value of of the roll for both dice is: " + DiceTwice.getDieTotal());
		System.out.println("die1: " + DiceTwice.getDie1());
		System.out.println("die2: " + DiceTwice.getDie2());
	}
}