package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LMS_Activity6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://alchemy.hguy.co/lms");
		driver.manage().window().maximize();
		String s1 = driver.getTitle();
		System.out.println(s1);
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
			if(s4.equals(s5)) {
				String s6 = driver.findElement(By.className("ld-profile-summary")).getText();
				System.out.println(s6);
				driver.close();
			}
		}else {
			System.out.println("not matched!");
			driver.close();
		}
	}

}
