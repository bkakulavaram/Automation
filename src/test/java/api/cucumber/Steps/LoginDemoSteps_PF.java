package api.cucumber.Steps;

import Pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageFactory.HomePage_PF;
import pageFactory.LoginPage_PF;

import java.time.Duration;

public class LoginDemoSteps_PF {
    WebDriver driver;
    LoginPage_PF login;
    HomePage_PF home;

    @Given("Browser is open")
    public void browserIsOpen() {
        System.out.println("====I am inside browser is open=====");
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().window().maximize();
    }
    @And("User is on login page")
    public void userIsOnLoginPage() {
        driver.navigate().to("https://practicetestautomation.com/practice-test-login/");
    }

    @When("User enters {string} and {string}")
    public void userEntersAnd(String username, String password) throws InterruptedException {
        login= new LoginPage_PF(driver);
        login.enterUserName(username);
        login.enterPassword(password);
        Thread.sleep(2000);
    }
    @And("User clicks on login")
    public void userClicksOnLogin() {
        login.clickLogin();
    }

    @Then("User is navigated to the home page")
    public void userIsNavigatedToTheHomePage() throws InterruptedException {
        HomePage_PF home=new HomePage_PF(driver)         ;
        Assert.assertTrue(home.checkLogoutIsDisplayed());
        Thread.sleep(4000);
    }


}
