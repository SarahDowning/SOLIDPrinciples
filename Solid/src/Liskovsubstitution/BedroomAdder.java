package Liskovsubstitution;

public class BedroomAdder {
	
	
	// Both penthouses and studios should be able to expand in size
	// So addSqft method can take the parent class 'Apartment'
	public void addSqft(Apartment apartment) {
		apartment.setSquareFootage(apartment.getSquareFootage() + 60);
	}

	public void addBedroom(Penthouse penthouse) {
		penthouse.setNumberOfBedrooms(penthouse.getNumberOfBedrooms() + 1);
		System.out.println();
	}
	
}