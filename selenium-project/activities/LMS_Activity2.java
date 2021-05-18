package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LMS_Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://alchemy.hguy.co/lms");
		driver.manage().window().maximize();
		String s1 = driver.getTitle();
		System.out.println(s1);
		String s2 = driver.findElement(By.className("uagb-ifb-title")).getText();
		System.out.println(s2);
		String s3 = "Learn from Industry Experts";
		if(s2.equals(s3)) {
			System.out.println("Title matched!");
			driver.close();
		}else {
			System.out.println("not matched!");
			driver.close();
		}

	}

}
