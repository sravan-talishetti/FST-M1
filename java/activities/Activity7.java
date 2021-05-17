package activities;

interface BicycleParts {
	int gears = 0;
	int currentSpeed = 0;
}

interface BicycleOperations {
	public void applyBrake(int decrement);
	public void speedUp(int increment);
}

class Bicycle implements BicycleOperations, BicycleParts {
	int gears;
	int currentSpeed;
	
	public Bicycle(int gears, int currentSpeed) {
		this.gears = gears;
		this.currentSpeed = currentSpeed;
	}

	@Override
	public void applyBrake(int decrement) {
		// TODO Auto-generated method stub
		currentSpeed -= decrement;
		System.out.println("After applying brake - " + currentSpeed);
		
	}

	@Override
	public void speedUp(int increment) {
		// TODO Auto-generated method stub
		currentSpeed += increment;
		System.out.println("After increasing speed - " + currentSpeed);
	}	
	
	public String bicycleDesc() {
		return("Number of gears " + gears + ", Speed of bicycle is - "+currentSpeed);
	}
}

class MountainBike extends Bicycle {

	int seatHeight;
	
	public MountainBike(int gears, int currentSpeed, int initialHeight) {
		// TODO Auto-generated constructor stub
		super(gears, currentSpeed);
		seatHeight = initialHeight;
	}
	
	public void setHeight(int newValue) {
		seatHeight = newValue;
	}
	
	public String bicycleDesc() {
		return(super.bicycleDesc() + " Seat Height - " + seatHeight);
		
	}
}

public class Activity7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MountainBike mb = new MountainBike(3, 0, 25);
		System.out.println(mb.bicycleDesc());
		mb.speedUp(20);
		mb.applyBrake(5);
	}

}
