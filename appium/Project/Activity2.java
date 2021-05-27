package project;

import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Activity2 {
	
	AppiumDriver<MobileElement> driver = null;
    WebDriverWait wait;
	
	@BeforeTest	
	public void setUp() throws MalformedURLException {
		DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "Pixel_4_API_28");
        caps.setCapability("platformName", "Android");
        caps.setCapability("appPackage", "com.google.android.keep");
        caps.setCapability("appActivity", ".activities.BrowseActivity");
        caps.setCapability("noReset", true);

        URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
        driver = new AndroidDriver<MobileElement>(appServer, caps);
        wait = new WebDriverWait(driver, 20);
	    System.out.println("Google Keep is opened");
	  
	}
  
  @Test
  public void process() throws InterruptedException {

	  
	  wait.until(ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("New text note")));
	   driver.findElementByAccessibilityId("New text note").click();
	   wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id("com.google.android.keep:id/editable_title")));
	   driver.findElementById("com.google.android.keep:id/editable_title").sendKeys("Title-Activity2 - Frameworks");
	   wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id("com.google.android.keep:id/edit_note_text")));
	   driver.findElementById("com.google.android.keep:id/edit_note_text").sendKeys("Tools available to create an application quickly");
	   Thread.sleep(3000);
	   driver.findElementByAccessibilityId("Open navigation drawer").click();
	   wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.id("com.google.android.keep:id/index_note_title")));
	   String noteTitle=driver.findElementById("com.google.android.keep:id/index_note_title").getText();
	   String noteDescription=driver.findElementById("com.google.android.keep:id/index_note_text_description").getText();
	   Assert.assertEquals("Title-Activity2 -Google Keep Notes",noteTitle);
	   Assert.assertEquals("Hello..Reminder note to complete Appium project",noteDescription);

  }
  
  @AfterTest
  public void tearDown() {
	  driver.quit();
  }
}

