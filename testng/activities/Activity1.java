package testNGTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.annotations.Test;

public class Activity1 {
    WebDriver driver;
    
    @BeforeMethod
    public void beforeMethod() {
        driver = new ChromeDriver();
        driver.get("https://www.training-support.net");
        driver.manage().window().maximize();
    }

    @Test
    public void exampleTestCase() {
        String title = driver.getTitle();
        System.out.println("Page title is: " + title);
        Assert.assertEquals("Training Support", title);
        driver.findElement(By.id("about-link")).click();
        System.out.println("New page title is: " + driver.getTitle());
        Assert.assertEquals(driver.getTitle(), "About Training Support");
    }

    @AfterMethod
    public void afterMethod() {
        driver.quit();
    }

}
