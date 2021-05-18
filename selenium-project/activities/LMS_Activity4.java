package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LMS_Activity4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://alchemy.hguy.co/lms");
		driver.manage().window().maximize();
		String siteTitle = driver.getTitle();
		System.out.println(siteTitle);
		String secondPopularCourse = driver.findElement(By.xpath("(//h3[@class='entry-title'])[2]")).getText();
		System.out.println(secondPopularCourse);
		String s3 = "Email Marketing Strategies";
		if(secondPopularCourse.equals(s3)) {
			System.out.println("Title matched!");
			driver.close();
		}else {
			System.out.println("not matched!");
			driver.close();
		}
	}

}
