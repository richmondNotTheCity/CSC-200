/* Implement a class Address. An address has a house number, a street, an optional 
apartment number, a city, a state, and a postal code. Supply two constructors: one with
an apartment number and one without. Supply a print method that prints the address
with the street on one line and the city, state, and postal code on the next line. Supply a 
method public boolean comesBefore (Address other) that tests whether this address 
comes before another when the addresses are compared by postal code. */

public class Address{
	
	private String Street;
	private String City;
	private String State;
	private int ApartmentNumber;
	private int HouseNumber;
	private int PostalCode;

	public Address(int HouseNum,String street,int aptNumber, String city, String state, int postalCode){
		HouseNumber=HouseNum; Street=street; ApartmentNumber=aptNumber;
		City=city; State=state; PostalCode=postalCode;
	}
	public Address(int HouseNum,String street, String city, String state, int postalCode){
		HouseNumber=HouseNum; Street=street; ApartmentNumber=-666;
		City=city; State=state; PostalCode=postalCode;
	}
	public void printAddress(){
		if(ApartmentNumber != -666){
			System.out.println(HouseNumber + " " + Street);
			System.out.println("APT: " + ApartmentNumber);
			System.out.println(City + ", " + State + " " + PostalCode);
		}
		else if(ApartmentNumber == -666){
		System.out.println(HouseNumber + " " + Street);
		System.out.println(City + ", " + State + " " + PostalCode);
		}
	}
	public boolean comesBefore(Address Comparable){
	if(this.PostalCode < Comparable.PostalCode){
		return true;
	}
	return false;
	}
	public static void main(String[] args) {
		Address Home = new Address(420, "Jingleberry Lane", 710, "Denver", "Colorado", 80014);
		Address VacationHouse = new Address(360, "Kickflip Court", "Hart", "Michigan", 49420);
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("I will demo the Address Class I made by creating two instances of the object and comparing them by postal code.");
		System.out.println("----------------------------------------------------------------------------------");
		Home.printAddress();
		System.out.println("----------------------------------------------------------------------------------");
		VacationHouse.printAddress();
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("Let's test comesBefore() method");
		System.out.println("Does Colorado address come before Michigan address when compared by zip code?");
		System.out.println("Result: " + Home.comesBefore(VacationHouse));
	}
}