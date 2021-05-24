package activities;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LMS_Activity1 {

	WebDriver driver;
	
	 @BeforeTest
	  public void setUp() {	  
		 driver = new FirefoxDriver();
		 driver.get("https://alchemy.hguy.co/lms");	
		 driver.manage().window().maximize();
			System.out.println(driver.getTitle());
	  }
	
	 @Test
	 public void courses() {
		 String s1 = driver.getTitle();
			String s2 = "Alchemy LMS – An LMS Application";
			System.out.println(s1);
			Assert.assertEquals(s1, s2);
			System.out.println("it is matching.");
	 }

	 @AfterTest
	 public void tearDown() {
		 driver.close();
	 }

}
