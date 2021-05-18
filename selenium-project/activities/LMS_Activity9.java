package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LMS_Activity9 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://alchemy.hguy.co/lms");
		driver.manage().window().maximize();
		String s1 = driver.getTitle();
		System.out.println(s1);
		driver.findElement(By.linkText("All Courses")).click();
		String s2 = driver.getTitle();
		String s3 = "All Courses – Alchemy LMS";
		if(s2.equals(s3)) {
			driver.findElement(By.cssSelector("article#post-69")).click();
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
			driver.close();
		}
		

	}

}
