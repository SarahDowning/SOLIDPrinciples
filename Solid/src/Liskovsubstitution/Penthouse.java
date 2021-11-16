package Liskovsubstitution;

// child class
public class Penthouse {

	private int squareFootage;
	private int numberOfBedrooms;

	public Penthouse() {
		this.setNumberOfBedrooms(4);
	}

	// Getters and Setters
	public int getNumberOfBedrooms() {
		return numberOfBedrooms;
	}

	public void setNumberOfBedrooms(int numberOfBedrooms) {
		this.numberOfBedrooms = numberOfBedrooms;
	}

	public int getSquareFootage() {
		return squareFootage;
	}

	public void setSquareFootage(int sqft) {
		this.squareFootage = sqft;
	}
}