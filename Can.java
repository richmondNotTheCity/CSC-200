/* Implement a can class with methods getSurfaceArea() and getVolume(). In the constructor 
supply the height and radius of the can. */

public class Can{
	
	private double height;
	private double radius;
	private double surfaceArea;
	private double volume;
	final double pi = 3.14159;	 
	
	public Can(double h, double r){
		this.height = h;
		this.radius = r;
	}
	private void calcSurfaceArea(){
		surfaceArea = (2 * pi * radius * height) + (2 * pi * (radius * radius));
	}
	private void calcVolume(){
		volume = (pi * (radius * radius) * height);
	}
	public double getSurfaceArea(){	
		this.calcSurfaceArea();
		return surfaceArea;
	}
	public double getVolume(){	
		this.calcVolume();
		return volume;
	}
	public getHeight(){
		return height;
	}
	public double getRadius(){	
		return radius;
	}
	public static void main(String[] args) {
		Can Campbells = new Can(15, 4);
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("I will demo the Can Class I made by creating one instance of a can object.");
		System.out.println("I will then find surface area and volume of the object.");
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("Height is: " + Campbells.getHeight());
		System.out.println("Radius is: " + Campbells.getRadius());
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("Surface Area is: " + Campbells.getSurfaceArea());
		System.out.println("Volume is: " + Campbells.getVolume());
		System.out.println("----------------------------------------------------------------------------------");
	}
}