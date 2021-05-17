package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://training-support.net/selenium/simple-form");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		System.out.println(driver.getTitle());
		driver.findElement(By.id("firstName")).sendKeys("Sravan");
		driver.findElement(By.id("lastName")).sendKeys("Kumar");
		driver.findElement(By.id("email")).sendKeys("sravan@gmail.com");
		driver.findElement(By.id("number")).sendKeys("987678762");
		driver.findElement(By.className("green")).click();
		Thread.sleep(1000);
		System.out.println(driver.getTitle());
		driver.close();
		

	}

}
