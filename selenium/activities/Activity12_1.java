package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity12_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.training-support.net/selenium/iframes");
        driver.manage().window().maximize();
        
		System.out.println("Title of the page is: " + driver.getTitle());
		driver.switchTo().frame(0);
		WebElement frameHeading = driver.findElement(By.cssSelector("div.content"));
		System.out.println(frameHeading.getText());
		
		WebElement button = driver.findElement(By.cssSelector("button"));
		System.out.println(button.getText());
		System.out.println(button.getCssValue("background-color"));
		button.click();
		
		System.out.println(button.getText());
		System.out.println(button.getCssValue("background-color"));
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(1);
		
		WebElement frameHeading1 = driver.findElement(By.cssSelector("div.content"));
        System.out.println(frameHeading1.getText());
        
        WebElement button1 = driver.findElement(By.cssSelector("button"));
        System.out.println(button1.getText());
        System.out.println(button1.getCssValue("background-color"));
        button1.click();
        
        System.out.println(button1.getText());
        System.out.println(button1.getCssValue("background-color"));
		

        driver.switchTo().defaultContent();
        
        driver.close();
		

	}

}


