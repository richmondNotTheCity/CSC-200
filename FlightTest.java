public class FlightTest{
	public static void main (String[] args)
{
	Flight f1 = new Flight ();
	Flight f2 = new Flight ("Moscow Air", 403, "Bangkok", "Glasgow");
	Flight f3 = new Flight ("Spirit", 205, "Orlando", "D.C.");
	
	System.out.println(f1.toString());
	System.out.println(f2.toString());
	System.out.println(f3.toString());
	
	f1.setairlineName("Tokyo Air");
	f2.setairlineName("Singapore Airlines");
	f3.setairlineName("Delta");
	
	f1.setFlightNumber(428);
	f2.setFlightNumber(420);
	f3.setFlightNumber(666);
	
	f1.setOrigin("Tokyo");
	f2.setOrigin("Jakarta");
	f3.setOrigin("Miami");
	
	f1.setDestination("New York");
	f2.setDestination("London");
	f3.setDestination("Atlanta");

	System.out.println(f1.toString());
	System.out.println(f2.toString());
	System.out.println(f3.toString());
	
	System.out.println("----------------------------------------------------------------------------------");
	System.out.println("Flight 1 old flight number: " + f1.getFlightNumber());
	System.out.println("f1.setFlightNumber(456)");
	f1.setFlightNumber(456);
	System.out.println ("Flight 1 new flight number: " + f1.getFlightNumber());
	System.out.println("----------------------------------------------------------------------------------");

	System.out.println("Flight 3 old destination place: " + f3.getDestination());
	System.out.println("f3.setDestination(\"Winchester\")");
	f3.setDestination("Winchester");
	System.out.println ("Flight 3 new destination place: " + f3.getDestination());
	}
}