package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
    WebDriver driver;
    WebDriverWait wait;
    
    @Given("^User is on Login page$")
    public void loginPage() {
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, 10);
        
        driver.get("https://www.training-support.net/selenium/login-form");
    }
    
    @When("^User enters username and password$")
    public void enterCredentials() {
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.id("password")).sendKeys("password");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }
    
    @Then("^Read the page title and confirmation message$")
    public void readTitleAndHeading() {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("action-confirmation")));
        
        String pageTitle = driver.getTitle();
        String confirmMessage = driver.findElement(By.id("action-confirmation")).getText();
        
        System.out.println("Page title is: " + pageTitle);
        System.out.println("Login message is: " + confirmMessage);
    }
    
    @And("^Close the Browser$")
    public void closeBrowser() {
        driver.close();
    }
}
