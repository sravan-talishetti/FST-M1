package activities;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;


public class LMS_Activity9 {
	
	 WebDriver driver;
		
	 @BeforeTest
	  public void setUp() {	  
		 driver = new FirefoxDriver();
		 driver.get("https://alchemy.hguy.co/lms");	
		 driver.manage().window().maximize();
	  }
	
	 @Test
	 public void courses() throws InterruptedException {

			driver.findElement(By.linkText("All Courses")).click();
			String s2 = driver.getTitle();
			String s3 = "All Courses – Alchemy LMS";
			if(s2.equals(s3)) {
				driver.findElement(By.xpath("//a[@role='button']")).click();
				driver.findElement(By.className("ld-button")).click();
				driver.findElement(By.id("user_login")).sendKeys("root");
				driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
				driver.findElement(By.id("wp-submit")).click();
				Thread.sleep(1000);
				driver.findElement(By.className("ld-item-title")).click();
				String lessonTitle = driver.getTitle();
				System.out.println(lessonTitle);
				driver.findElement(By.linkText("Next Lesson")).click();
				driver.findElement(By.linkText("Next Lesson")).click();
				driver.findElement(By.linkText("Back to Course")).click();
				String pageTitle = driver.getTitle();
				System.out.println(pageTitle);
			}
		 
	 }

	 @AfterTest
	 public void tearDown() {
		 driver.close();
	 }

}
