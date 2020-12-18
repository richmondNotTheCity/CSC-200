/* RetailItem Class Write a class named RetailItem that holds data about an item in a retail 
store. The class should have the following fields:

description. The description field references a String object that holds a brief 
description of the item.

units OnHand. The unitsOnHand field is an int variable that holds the number of units 
currently in inventory.

price. The price field is a double that holds the item’s retail price.

Write a constructor that accepts arguments for each field, appropriate mutator methods that 
store values in these fields, and accessor methods that return the values in these fields. */

public class RetailItem{

	private String Description;
	private int unitsOnHand;
	private double price;
	
	public RetailItem(String description, int UnitsOnHand, double Price){
		this.Description = description;
		this.unitsOnHand = UnitsOnHand;
		this.price = Price;
	}
	public RetailItem(){
	this.Description = "Please set a description";
	this.unitsOnHand = 0;
	this.price = 999;
	}
	public void setDescription(String a){
		this.Description = a;
	}
	public void setunitsOnHand(int b){
		this.unitsOnHand = b;
	}
	public void setprice(double c){
		this.price = c;
	}
	public String getDescription(){
		return Description;
	}
	public int getunitsOnHand(){
		return unitsOnHand;
	}
	public double getprice(){
		return price;
	}
	public void printItem(){
		System.out.println("Description: " + this.getDescription());
		System.out.println("Units on Hand: " + this.getunitsOnHand());
		System.out.println("Price: $" + this.getprice());
	}
	public static void main(String[] args) {
		RetailItem item1 = new RetailItem("Jacket", 12, 59.95);
		RetailItem item2 = new RetailItem("Designer Jeans", 40, 34.95);
		RetailItem item3 = new RetailItem("Shirt", 20, 24.95);
		RetailItem item4 = new RetailItem();
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("I will demo the RetailItem Class I made by creating 3 instances of a RetailItem object");
		System.out.println("The description, unitsOnHand, and price fields will be set with arguments");
		System.out.println("I will create a fourth RetailItem with no arguments to show the empty constructor as well");
		System.out.println("I will then use the printItem() method to print the values for all 4 items");
		System.out.println("----------------------------------------------------------------------------------");
		item1.printItem();
		System.out.println("----------------------------------------------------------------------------------");
		item2.printItem();
		System.out.println("----------------------------------------------------------------------------------");
		item3.printItem();
		System.out.println("----------------------------------------------------------------------------------");
		item4.printItem();
		System.out.println("----------------------------------------------------------------------------------");
	}
}