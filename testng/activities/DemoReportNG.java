package testNGTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.SkipException;
import org.testng.annotations.*;

public class DemoReportNG {
    WebDriver driver;
    
    @BeforeClass
    public void beforeMethod() {
        driver = new ChromeDriver();
        driver.get("https://www.training-support.net/");
        Reporter.log("Test Started");
        driver.manage().window().maximize();
    }
    
    @Test
    public void testCase1() {
        String title = driver.getTitle();
        Reporter.log("Title is: " + title);
        Assert.assertEquals("Training Support", title);
    }
    
    @Test
    public void testCase2() {
        WebElement button = driver.findElement(By.tagName("button"));
        Reporter.log("Element Found");
        Assert.assertTrue(button.isDisplayed());
    }
    
    @Test(enabled = false)
    public void testCase3() {
        Reporter.log("This page title will not be printed: " + driver.getTitle());
    }
    
    @Test
    public void testCase4() {
        Reporter.log("Test skipped with Exception");
        throw new SkipException("Skipping test case");
    }

    @AfterClass
    public void afterMethod() {
        driver.close();
        Reporter.log("Test Completed");
    }
}
