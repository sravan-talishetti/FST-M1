package activities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LMS_Activity1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://alchemy.hguy.co/lms");
		driver.manage().window().maximize();
		String s1 = driver.getTitle();
		String s2 = "Alchemy LMS – An LMS Application";
		System.out.println(s1);
		if(s1.equals(s2)) {
			System.out.println("Title matched!");
			driver.close();
		}else {
			System.out.println("not matched!");
			driver.close();
		}

	}

}
