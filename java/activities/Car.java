package activities;

public class Car {

	String Color;
	String Transmission;
	int make;
	int tyres;
	int doors;
	
	Car() {
		tyres = 4;
		doors = 4;
	}
	
	public void displayCharacteristics() {
		System.out.println("Color of the Car - " + Color );
		System.out.println("Transmission of the Car - " + Transmission );
		System.out.println("Make of the Car - " + make );
		System.out.println("Number of tyres of the Car - " + tyres );
		System.out.println("Number of doors of the Car - " + doors );
		
	}
	
	public void accelerate() {
		System.out.println("Car is moving forward" );
	}
	
	public void brake() {
		System.out.println("Car has stopped");
	}
}
