package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LMS_Activity6 {
	
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

			driver.findElement(By.linkText("My Account")).click();
			String s2 = driver.getTitle();
			String s3 = "My Account – Alchemy LMS";
			if(s2.equals(s3)) {
				System.out.println("matched!");
				driver.findElement(By.cssSelector("a.ld-login")).click();
				driver.findElement(By.id("user_login")).sendKeys("root");
				driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
				driver.findElement(By.id("wp-submit")).click();
				Thread.sleep(1000);
				String s4 = driver.getTitle();
				String s5 = "My Account – Alchemy LMS";
				Assert.assertEquals(s4, s5);
				System.out.println("it is matching.");
			}
	 }

	 @AfterTest
	 public void tearDown() {
		 driver.close();
	 }

}
