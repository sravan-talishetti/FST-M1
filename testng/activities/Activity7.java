package testNGTests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.*;

public class Activity7 {
    WebDriver driver;
    WebDriverWait wait;

    @BeforeClass
    public void beforeClass() {
        driver = new ChromeDriver();
        driver.get("https://www.training-support.net/selenium/login-form");
        driver.manage().window().maximize();
        Reporter.log("Opening browser for logging in");
    }
    
    @DataProvider(name = "Authentication")
    public static Object[][] credentials() {
        return new Object[][] { { "admin", "password" }};
    }
    
    @Test (dataProvider = "Authentication")
    public void loginTestCase(String username, String password) {
        WebElement usernameField = driver.findElement(By.id("username"));
        WebElement passwordField = driver.findElement(By.id("password"));
        usernameField.sendKeys(username);
        Reporter.log("Typing in Username");
        passwordField.sendKeys(password);
        Reporter.log("Typing in Password");
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        Reporter.log("Logging in");
        Reporter.log("Logged-in successful.");
        String loginMessage = driver.findElement(By.id("action-confirmation")).getText();
        Assert.assertEquals(loginMessage, "Welcome Back, admin");
    }

    @AfterClass
    public void afterClass() {
        driver.close();
        Reporter.log("Closed browser");
    }

}