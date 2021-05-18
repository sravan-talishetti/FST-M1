package testNGTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.*;

public class Activity10 {
    WebDriver driver;
    Actions builder;

    @BeforeClass
    public void beforeClass() {
        driver = new ChromeDriver();
        builder = new Actions(driver);
        driver.get("https://www.training-support.net/selenium/sliders");
        driver.manage().window().maximize();
    }

    @Test
    public void sliderToMiddleTest() {
        WebElement slider = driver.findElement(By.id("slider"));
        slider.click();
        String volumeLevel = driver.findElement(By.cssSelector("span#value")).getText();
        Reporter.log("Mid value: " + volumeLevel);
        Assert.assertEquals(volumeLevel, "49");
    }
    
    @Test
    public void sliderToMaxTest() {
        WebElement slider = driver.findElement(By.id("slider"));
        builder.clickAndHold(slider).moveByOffset(75, 0).release().build().perform();
        String volumeLevel = driver.findElement(By.cssSelector("span#value")).getText();
        Reporter.log("Max value: " + volumeLevel);
        Assert.assertEquals(volumeLevel, "100");
    }
    
    @Test
    public void sliderToMinTest() {
        WebElement slider = driver.findElement(By.id("slider"));
        builder.clickAndHold(slider).moveByOffset(-75, 0).release().build().perform();
        String volumeLevel = driver.findElement(By.cssSelector("span#value")).getText();
        Reporter.log("Min value: " + volumeLevel);
        
        Assert.assertEquals(volumeLevel, "0");
    }
    
    @Test
    public void sliderTo30Test() {
        WebElement slider = driver.findElement(By.id("slider"));
        builder.clickAndHold(slider).moveByOffset(-30, 0).release().build().perform();
        String volumeLevel = driver.findElement(By.cssSelector("span#value")).getText();
        Reporter.log("Min value: " + volumeLevel);
        Assert.assertEquals(volumeLevel, "23");
    }
    
    @Test
    public void sliderTo80Test() {
        WebElement slider = driver.findElement(By.id("slider"));
        builder.clickAndHold(slider).moveByOffset(45, 0).release().build().perform();
        String volumeLevel = driver.findElement(By.cssSelector("span#value")).getText();
        Reporter.log("Min value: " + volumeLevel);
        Assert.assertEquals(volumeLevel, "90");
    }

    @AfterClass
    public void afterClass() {
        driver.close();
    }
}
