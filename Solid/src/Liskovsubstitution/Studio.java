package Liskovsubstitution;

// child class
public class Studio {

	private int squareFootage;
	private int numberOfBedrooms;

	public Studio() {
		this.setNumberOfBedrooms(0);
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

	public void setSquareFootage(int squareFootage) {
		this.squareFootage = squareFootage;
	}

}
