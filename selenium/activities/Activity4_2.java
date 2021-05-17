package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.training-support.net/selenium/simple-form");
		driver.manage().window().maximize();
        String pageTitle = driver.getTitle();
        System.out.println(pageTitle);
 
        WebElement firstName = driver.findElement(By.xpath("//input[@id = 'firstName']"));
        WebElement lastName = driver.findElement(By.xpath("//input[@id = 'lastName']"));
        firstName.sendKeys("Sravan");
        lastName.sendKeys("Kumar");
 
        driver.findElement(By.xpath("//input[@id = 'email']")).sendKeys("sk@example.com");
        driver.findElement(By.xpath("//input[@id = 'number']")).sendKeys("0987654321");
        driver.findElement(By.xpath("//textarea")).sendKeys("This is my comment");
        driver.findElement(By.xpath("//input[contains(@class, 'green')]")).click();
	}

}
