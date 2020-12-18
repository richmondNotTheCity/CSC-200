/* Implement a class Car with the following properties. A car has a certain fuel efficiency 
(measured in miles/gallon) and a certain amount of fuel in the gas tank. The efficiency is 
specified in the constructor, and the initial fuel level is 0. Supply a method drive that 
simulates driving the car for a cartain distance, reducing the fuel level in the gas tank, 
and methods getGasLevel, to return the current fuel level and addGas, to tank up. Sample usage:

Car myHybrid = new Car(50); //50 miles per gallon
myHybrid.addGas(20); // Tank 20 gallons
myHybrid.drive(100); // Drive 100 miles
System.out.println(myHybrid>.getGasLevel()); // Print fuel remaining. */

public class Car{

	private double fuelEfficiency;
	private double amountOfFuel;
	
	public Car(double fuelEfficiency){
		this.fuelEfficiency = fuelEfficiency;
		amountOfFuel = 0;
	}
	public void addGas(double addFuel){
		amountOfFuel = amountOfFuel + addFuel;
	}
	public void drive(double miles){
		amountOfFuel = amountOfFuel - (miles / fuelEfficiency);
	}
	public double getGasLevel(){
		return amountOfFuel;
	}
	public static void main(String[] args){
		Car redMustang = new Car(14);
		redMustang.addGas(13);
		redMustang.drive(28);
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("I will demo the Car Class I made by creating one instance of a car object named redMustang");
		System.out.println("Using (14) as the argument will declare that it gets 14 miles per gallon");
		System.out.println("Using redMustang.addGas(13) will add 13 gallons of fuel to tank");
		System.out.println("Using redMustang.drive(28) will simulate driving 28 miles at 14 mpg");
		System.out.println("Now how much is left in the tank?");
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println(redMustang.getGasLevel() + " gallons left in tank");
	}
}