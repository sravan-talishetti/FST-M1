package project;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;

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

public class Activity1 {
	
	AppiumDriver<MobileElement> driver = null;
    WebDriverWait wait;
	
	@BeforeTest	
	public void setUp() throws MalformedURLException {
		DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "Pixel_4_API_28");
        caps.setCapability("platformName", "Android");
        caps.setCapability("appPackage", "com.google.android.apps.tasks");
        caps.setCapability("appActivity", ".ui.TaskListsActivity");
        caps.setCapability("noReset", true);

        URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
        driver = new AndroidDriver<MobileElement>(appServer, caps); 
        wait = new WebDriverWait(driver, 20);
	    System.out.println("Google Task is opened");
	    wait.until(ExpectedConditions.elementToBeClickable(MobileBy.xpath("//android.widget.Button[@text='Get started']")));;
//		driver.findElementByXPath("//android.widget.Button[@text='Get started']").click();
	  
	}
  
  @Test
  public void process() {
	  try {
	  String tasks[] = {"Complete Activity with Google Tasks", "Complete Activity with Google Keep", "Complete the second Activity Google Keep"};
	  System.out.println(tasks.length);
	  for(String task : tasks) {
		  wait = new WebDriverWait(driver, 5);
		  wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id("tasks_fab")));
		  driver.findElementById("tasks_fab").click();
		  wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id("add_task_title")));
		  MobileElement task_tile = driver.findElementByXPath("//android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.EditText");
		  task_tile.sendKeys(task);
		  driver.findElementById("add_task_done").click(); 
	  }
	  }catch(ArrayIndexOutOfBoundsException ae) {
		  System.out.println("ArrayIndexOutOfBoundException");
	  }

	  	wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id("task_list_title")));
	  	List<MobileElement> addedtasks=driver.findElementsById("com.google.android.apps.tasks:id/task_name");
		   int totalnotask=addedtasks.size();
		   Assert.assertEquals(3, totalnotask);
		   Assert.assertEquals(addedtasks.get(2).getText(), "Complete Activity with Google Tasks");
  }
  
  @AfterTest
  public void tearDown() {
	  driver.quit();
  }
}
