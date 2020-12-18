/* Consider a class Movie that contains information about a movie. The class has the following attributes:
•	The movie name
•	The MPAA rating (e.g. G, PG, PG-13, R)
•	The number of people that have rated this movie as a 1 (Terrible)
•	The number of people that have rated this movie as a 2 (Bad)
•	The number of people that have rated this movie as a 3 (OK)
•	The number of people that have rated this movie as a 4 (Good)
•	The number of people that have rated this movie as a 5 (Great)
Implement the class with accessors and mutators for the movie name and MPAA rating. Write a method 
addRating that takes an integer as an input parameter. The method should verify that the parameter 
is a number between 1 and 5, and if so, increment by one the number of people rating the movie that 
matches the input parameter. For example, if 3 is the input parameter, then the number of people that 
rated the movie as a 3 should be incremented by one. Write another method, getAverage, that returns 
the average value for all the movie ratings.
Test the class by writing a main method that creates at least two movie objects, adds at least five 
ratings for each movie, and output the movie name, MPAA rating, and average rating for each movie object. */

public class Movie{
	
	private String name;
	private String rating;
	private int terrible = 0;
	private int bad = 0;
	private int ok = 0;
	private int good = 0;
	private int great = 0;
	private double avgReview = 0;

	public Movie(){
		name = "movie_Placeholder";
		rating = "Unrated";
	}
	public Movie(String placeholderName){
		name = placeholderName;
		rating = "Unrated";
	}
	public Movie(String placeholderName, String initialRating){
		name = placeholderName;
		rating = initialRating;
	}
	public void setName(String newName){
		name = newName;
	}
	public void setRating(String newRating){
		rating = newRating;
	}
	public String getName(){
		return name;
	}
	public String getRating(){
		return rating;
	}
	public void addRating(int newReview){
		switch (newReview){
			case 1: 
				terrible ++;
				break;
			case 2: 
				bad ++;
				break;
			case 3: 
				ok ++;
				break;
			case 4: 
				good ++;
				break;
			case 5: 
				great ++;
				break;
			default: 
				System.out.println("Please only enter a value of 1, 2, 3, 4, or 5. Focus and try again please.");
				break;
		}
	}
	public double getAverage(){
		avgReview = (((terrible * 1) + (bad * 2) + (ok * 3) + (good * 4) + (great * 5))/5.00);
		return avgReview;
	}
	public String toString(){
		return "Name: " + name +
					 "\nRating: " + rating +
					 "\nAverage Review " + avgReview;
	}
	public void writeOutput(){
		System.out.println("Title: " + getName());  
		System.out.println("Rating: " + getRating());
		System.out.println("Average Review " + getAverage());
		System.out.println("People who have rated this movie terrible: " + terrible);
		System.out.println("People who have rated this movie bad: " + bad);
		System.out.println("People who have rated this movie ok: " + ok);
		System.out.println("People who have rated this movie good: " + good);
		System.out.println("People who have rated this movie great: " + great);
	}
	public static void main (String[] args){
		System.out.println("Using this Movie class, I will create two Movie Objects");
		System.out.println("Their instance variables will then be printed to the screen");
		System.out.println("----------------------------------------------------------------------------------");
		Movie Aliens = new Movie("Alien"); 
		Aliens.setName("Aliens");
		System.out.println("First I will set the MPAA rating of the movie ");
		System.out.println("Using the setRating() method");
		Aliens.setRating("R");
		System.out.println("Then I will add 5 ratings for this movie (1-5)");
		System.out.println("Using the addRating() method");
		System.out.println("----------------------------------------------------------------------------------");
		Aliens.addRating(5);
		Aliens.addRating(5);
		Aliens.addRating(5);
		Aliens.addRating(4);
		Aliens.addRating(5);
		Aliens.writeOutput();
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("A second movie will be added now");
		System.out.println("----------------------------------------------------------------------------------");
		Movie Terminator = new Movie("Terminator", "R");
		Terminator.addRating(3);
		Terminator.addRating(4);
		Terminator.addRating(5);
		Terminator.addRating(4);
		Terminator.addRating(5);
		Terminator.writeOutput();
		System.out.println("----------------------------------------------------------------------------------");
	}
 }