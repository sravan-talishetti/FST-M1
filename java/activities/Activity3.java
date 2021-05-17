package activities;

public class Activity3 {

	public static void main(String[] args) {
		double seconds = 1000000000;
		double mercurySeconds = 0.2408467;
		double earthSeconds = 31557600;
		double venusSeconds = 0.61519726;
		double marsSecond = 1.8808158; 
		double jupiterSecond = 11.862615;
		double saturnSecond = 29.447498;
		double uranusSeconds = 84.016846;
		double neptuneSeconds = 164.79132;
		
		System.out.println("Age on Mercury - " + seconds/earthSeconds/mercurySeconds);
		System.out.println("Age on Venus - " + seconds/earthSeconds/venusSeconds);
		System.out.println("Age on Earth - " + seconds/earthSeconds);
		System.out.println("Age on Mars - " + seconds/earthSeconds/marsSecond);
		System.out.println("Age on Jupiter - " + seconds/earthSeconds/jupiterSecond);
		System.out.println("Age on Saturn - " + seconds/earthSeconds/saturnSecond);
		System.out.println("Age on Uranus - " + seconds/earthSeconds/uranusSeconds);
		System.out.println("Age on Neptune - " + seconds/earthSeconds/neptuneSeconds);
	}

}
