package activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity11_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		 
        driver.get("https://www.training-support.net/selenium/javascript-alerts");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("button#confirm")).click();
 
        Alert confirmAlert = driver.switchTo().alert();
 
        String alertText = confirmAlert.getText();
        System.out.println("Alert text is: " + alertText);
 
        confirmAlert.accept();
        //confirmAlert.dismiss();
 
        driver.close();

	}

}
