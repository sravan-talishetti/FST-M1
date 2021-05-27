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

public class Activity3 {
	
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
	   driver.findElementById("com.google.android.keep:id/editable_title").sendKeys("Frameworks");
	   wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id("com.google.android.keep:id/edit_note_text")));
	   driver.findElementById("com.google.android.keep:id/edit_note_text").sendKeys("Tools available to create an application quickly");
	   Thread.sleep(3000);
	   driver.findElementByXPath("//android.widget.TextView[@content-desc=\"Reminder\"]").click();
	   Thread.sleep(3000);
	   wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id("com.google.android.keep:id/time_spinner")));
	   driver.findElementById("com.google.android.keep:id/time_spinner").click();
	   wait.until(ExpectedConditions.elementToBeClickable(MobileBy.xpath("//android.widget.TextView[1][@text='Night']")));
	   driver.findElementByXPath("//android.widget.TextView[1][@text='Night']").click();
	   wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id("com.google.android.keep:id/save")));
	   driver.findElementById("com.google.android.keep:id/save").click();
	   wait.until(ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Open navigation drawer")));
	   driver.findElementByAccessibilityId("Open navigation drawer").click();
	   Thread.sleep(5000);
	   driver.findElementByAccessibilityId("Open navigation drawer").click();
	   wait.until(ExpectedConditions.elementToBeClickable(MobileBy.xpath("//android.widget.LinearLayout[2]/android.widget.TextView[@text='Reminders']")));
	   driver.findElementByXPath("//android.widget.LinearLayout[2]/android.widget.TextView[@text='Reminders']").click();
	   Thread.sleep(3000);
	   wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("//android.widget.LinearLayout/android.widget.TextView[1]")));
	   String result=driver.findElementByXPath("//android.widget.LinearLayout/android.widget.TextView[1]").getText();
	   Thread.sleep(3000);
	   System.out.println(result);
	   Assert.assertEquals("Frameworks",result);
	  
  }
  
  @AfterTest
  public void tearDown() {
	  driver.quit();
  }
}
