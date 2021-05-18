package testNGTests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

public class Activity6 {
    WebDriver driver;
    WebDriverWait wait;

    @BeforeClass
    public void beforeClass() {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 10);
        driver.get("https://www.training-support.net/selenium/login-form");
        driver.manage().window().maximize();
    }
    
    @Test
    @Parameters({"uname", "pwd"})
    public void loginTestCase(String username, String password) {
        WebElement unField = driver.findElement(By.id("username"));
        WebElement pField = driver.findElement(By.id("password"));
        unField.sendKeys(username);
        pField.sendKeys(password);
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        String loginMessage = driver.findElement(By.id("action-confirmation")).getText();
        Assert.assertEquals(loginMessage, "Welcome Back, admin");
    }

    @AfterClass
    public void afterClass() {
        driver.close();
    }

}