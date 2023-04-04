package StepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Testing {

    public static WebDriver driver;


    @Given("the user is on the login page")
    public void theUserIsOnTheLoginPage() {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://testcs.helpr-app.com/");
    }

    @When("the user enters valid username and password")
    public void theUserEntersValidUsernameAndPassword() {
        WebElement email = driver.findElement(By.id("login-email"));
        WebElement password = driver.findElement(By.id("login-password"));
        email.sendKeys("a1@notarbitrary.com");
        password.sendKeys("mGUN7JF76UE_9/7Z$f)$v\\K;ke/D$J4RXXzQxNW%;k'6^(C8`f");
    }

    @And("clicks the login button")
    public void clicksTheLoginButton() {
        WebElement login = driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
        login.click();

    }
    @Then("the user should be redirected to the home page")
    public void theUserShouldBeRedirectedToTheHomePage() {
    }

    @When("the user enters invalid username and password")
    public void theUserEntersInvalidUsernameAndPassword() {
        WebElement email = driver.findElement(By.id("login-email"));
        WebElement password = driver.findElement(By.id("login-password"));
        email.sendKeys("a45@notarbitrary.com");
        password.sendKeys("mGUN7JF7/7Z$f)$v\\K;ke/D$J4RXXzQxNW%;k'6^(C8`f");

    }

    @Then("display error message")
    public void displayErrorMessage() {
        WebElement toast = driver.findElement(By.xpath("//div[@class='Toastify']"));
    }

    @When("the user enters invalid username and valid password")
    public void theUserEntersInvalidUsernameAndValidPassword() {

        WebElement email = driver.findElement(By.id("login-email"));
        WebElement password = driver.findElement(By.id("login-password"));
        email.sendKeys("a1@otarbitrary.com");
        password.sendKeys("mGUN7JF76UE_9/7Z$f)$v\\K;ke/D$J4RXXzQxNW%;k'6^(C8`f");

    }

    @When("the user enters valid username and invalid password")
    public void theUserEntersValidUsernameAndInvalidPassword() {
        WebElement email = driver.findElement(By.id("login-email"));
        WebElement password = driver.findElement(By.id("login-password"));
        email.sendKeys("a1@notarbitrary.com");
        password.sendKeys("mGUN7JF_9/7Z$f)$v\\K;ke/D$J4RXXzQxNW%;k'6^(C8`f");

    }

    @When("the user enters empty username and password")
    public void theUserEntersEmptyUsernameAndPassword() {
        WebElement login = driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
        login.click();
        driver.close();
    }
}
