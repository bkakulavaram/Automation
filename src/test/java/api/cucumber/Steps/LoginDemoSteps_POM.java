package api.cucumber.Steps;

import Pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LoginDemoSteps_POM {
    WebDriver driver=null;
    LoginPage login;
    @Given("browser is open")
    public void browser_is_open() {
        System.out.println("====I am inside browser is open=====");
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().window().maximize();
    }
    @And("user is on login page")
    public void user_is_on_login_page() {
       driver.navigate().to("https://practicetestautomation.com/practice-test-login/");
    }
    @When("user enters {string} and {string}")
    public void userEntersAnd(String username, String password) throws InterruptedException {
        login=new LoginPage(driver);
        login.enterUserName(username);
        login.enterPassword(password);
        Thread.sleep(2000);

    }
    @And("user clicks on login")
    public void user_clicks_on_login() {
        login.clickLogin();
    }
    @Then("user is navigated to the home page")
    public void user_is_navigated_to_the_home_page() throws InterruptedException {
        Assert.assertTrue(login.checkLogoutIsDisplayed());
        Thread.sleep(2000);
    }


}
