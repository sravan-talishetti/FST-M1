package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.training-support.net");
		driver.manage().window().maximize();
 
        String title = driver.getTitle();
        System.out.println("Page title is: " + title);

        driver.findElement(By.xpath("/html/body/div/div/div/a")).click();
 
        System.out.println("Heading is: " + driver.getTitle());
        
        driver.close();

	}

}
