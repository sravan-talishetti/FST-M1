package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigations {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.training-support.net");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.id("about-link")).click();
		driver.navigate().to("https://www.training-support.net");
		Thread.sleep(1000);
		System.out.println(driver.getTitle());
		driver.findElement(By.className("green")).click();
		//driver.findElement(By.linkText("About Us")).click();
		//driver.findElement(By.cssSelector(".green")).click();
		Thread.sleep(1000);
		System.out.println(driver.getTitle());
		driver.navigate().back();
		Thread.sleep(1000);
		System.out.println(driver.getTitle());
		driver.navigate().forward();
		Thread.sleep(1000);
		System.out.println(driver.getTitle());
		driver.close();
	}

}
