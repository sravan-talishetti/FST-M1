package project;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

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

public class Activity4 {
	
	AppiumDriver<MobileElement> driver = null;
    WebDriverWait wait;
	
	@BeforeTest	
	public void setUp() throws MalformedURLException {
		DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "Pixel_4a_API_30");
        caps.setCapability("platformName", "Android");
        caps.setCapability("appPackage", "com.android.chrome");
        caps.setCapability("appActivity", "com.google.android.apps.chrome.Main");
        caps.setCapability("noReset", true);

        URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
        driver = new AndroidDriver<MobileElement>(appServer, caps);
        wait = new WebDriverWait(driver, 5);
        driver.get("https://www.training-support.net/selenium");
	  
	}
  
  @Test
  public void process() throws InterruptedException {
	  	
		 	wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("//android.view.View")));        
	        driver.findElement(MobileBy.AndroidUIAutomator("UiScrollable(new UiSelector().scrollable(true)).flingToEnd(5)"));
			Thread.sleep(3000);
	        driver.findElementByXPath("//android.view.View[contains(@text,'To-Do List')]").click();
	        Thread.sleep(3000);
	        String[] tasks= {"Add tasks to list","Get number of tasks","Clear the list"};
	        
	        for (String task : tasks) 
	        {
	        	wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("//android.view.View[4]/android.view.View[1]/android.widget.EditText")));
	        	driver.findElementByXPath("//android.view.View[4]/android.view.View[1]/android.widget.EditText").sendKeys(task);
	        	
	        	wait.until(ExpectedConditions.elementToBeClickable(MobileBy.xpath("//android.widget.Button[@text='Add Task']")));
	        	driver.findElementByXPath("//android.widget.Button[@text='Add Task']").click();
	         }
	        Thread.sleep(3000);
	        String addedtask1=driver.findElementByXPath("//android.view.View[4]/android.view.View[2]/android.view.View[2]/android.view.View").getText();
	        String addedtask2=driver.findElementByXPath("//android.view.View[4]/android.view.View[2]/android.view.View[3]/android.view.View").getText();
	        String addedtask3=driver.findElementByXPath("//android.view.View[4]/android.view.View[2]/android.view.View[4]/android.view.View").getText();
	        Assert.assertEquals("Add tasks to list", addedtask1);
	        Assert.assertEquals("Get number of tasks", addedtask2);
	        Assert.assertEquals("Clear the list", addedtask3);
	        List<MobileElement> addedTasks = driver.findElementsByXPath("//android.view.View[@resource-id='tasksList']/android.view.View");
	        System.out.println("no. of tasks: " + addedTasks.size());
	        Assert.assertEquals(addedTasks.size(), 4);
	        driver.findElementByXPath("//android.view.View[4]/android.view.View[2]/android.view.View[2]/android.view.View").click();
	        Thread.sleep(3000);
	        driver.findElementByXPath("//android.view.View[4]/android.view.View[2]/android.view.View[3]/android.view.View").click();
	        Thread.sleep(3000);
	        driver.findElementByXPath("//android.view.View[4]/android.view.View[2]/android.view.View[4]/android.view.View").click();
	        Thread.sleep(3000);
	        driver.findElementByXPath("//android.view.View/android.view.View[4]/android.view.View[3]/android.view.View[2]").click();
	        Thread.sleep(3000);
	        List<MobileElement> addedTasks1 = driver.findElementsByXPath("//android.view.View[@resource-id='tasksList']/android.view.View");
	        System.out.println("no. of tasks: " + addedTasks1.size());
	        Assert.assertEquals(addedTasks1.size(), 0);
  }
  
  @AfterTest
  public void tearDown() {
	  driver.quit();
  }
}

