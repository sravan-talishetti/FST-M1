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

public class LMS_Activity3 {

	WebDriver driver;
	
	 @BeforeTest
	  public void setUp() {	  
		 driver = new FirefoxDriver();
		 driver.get("https://alchemy.hguy.co/lms");	
		 driver.manage().window().maximize();
			System.out.println(driver.getTitle());
	  }
	
	 @Test
	 public void courses() throws InterruptedException {
		 String s2 = driver.findElement(By.cssSelector("h3.uagb-ifb-title")).getText();
			System.out.println(s2);
			String s3 = "Actionable Training";
			Assert.assertEquals(s2, s3);
			System.out.println("it is matching.");
	 }

	 @AfterTest
	 public void tearDown() {
		 driver.close();
	 }

}

