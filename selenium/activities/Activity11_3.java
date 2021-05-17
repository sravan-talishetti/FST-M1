package activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity11_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver = new ChromeDriver();
		 
	        driver.get("https://www.training-support.net/selenium/javascript-alerts");
	 
	        System.out.println("Page title is: " + driver.getTitle());
	 
	        driver.findElement(By.cssSelector("button#prompt")).click();
	 
	        Alert promptAlert = driver.switchTo().alert();
	 
	        String alertText = promptAlert.getText();
	        System.out.println("Alert text is: " + alertText);
	 
	        promptAlert.sendKeys("Awesome!");
	        promptAlert.accept();
	 
	        driver.close();

	}

}
