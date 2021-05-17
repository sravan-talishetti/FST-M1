package activities;

public class Activity1 {
	public static void main(String args[]) {
		Car toyota = new Car();
		toyota.make = 2014;
		toyota.Color = "Black";
		toyota.Transmission = "manual";
		
		toyota.displayCharacteristics();
		toyota.accelerate();
		toyota.brake();
	}
}
