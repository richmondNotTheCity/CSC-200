/* Design and implement a class called Flight that represents an airline flight. 
It should contain instance data that represents the airline name, flight number, 
and the flight’s origin and destination cities. Define the Flight constructor to 
accept and initialize all instance data. Include getter and setter methods for all 
instance data. Include a toString method that returns a one-line description of the flight. 
Create a driver class calledFlightTest, whose main method instantiates and updates several 
Flight objects. */

public class Flight{
	private String airlineName, origin, destination;
	private int flightNumber = 0;

	public Flight (String a,int b, String c, String d){
		airlineName = a;
		flightNumber = b;
		origin = c;
		destination = d;
	}
	public Flight (){
		airlineName = "Delta";
		flightNumber = 533;
		origin = "London";
		destination = "Cairo";
	}
	public String getairlineName (){
		return airlineName;
	}
	public int getFlightNumber (){
		return flightNumber;
	}
	public String getOrigin (){
		return origin;
	}
	public String getDestination (){
		return destination;
	}
	public void setairlineName (String airlineName){
		this.airlineName = airlineName;
	}
	public void setFlightNumber (int flightNumber){
		this.flightNumber = flightNumber;
	}
	public void setOrigin (String origin){
		this.origin = origin;
	}
	public void setDestination (String destination){
		this.destination = destination;
	}
	public String toString (){
		return (airlineName + ", " + flightNumber + " -- From: " + origin +", To: " + destination);
	}
}