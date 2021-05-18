package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LMS_Activity8 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://alchemy.hguy.co/lms");
		driver.manage().window().maximize();
		String s1 = driver.getTitle();
		System.out.println(s1);
		driver.findElement(By.linkText("Contact")).click();
		driver.findElement(By.id("wpforms-8-field_0")).sendKeys("Sravan");
		driver.findElement(By.id("wpforms-8-field_1")).sendKeys("abc@gnet.in");
		driver.findElement(By.id("wpforms-8-field_3")).sendKeys("Delivery");
		driver.findElement(By.id("wpforms-8-field_2")).sendKeys("On-time delivery of your course");
		driver.findElement(By.id("wpforms-submit-8")).click();
		String message = driver.findElement(By.id("wpforms-confirmation-8")).getText();
		System.out.println(message);
		Thread.sleep(5000);
		driver.close();
	}

}
