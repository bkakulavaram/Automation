package api.cucumber.Steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginStepsDefinitionsForScenarioWithExample {
    private static WebDriver d=new ChromeDriver();
    @Given("user is on home page")
    public void userIsOnHomePage() {

        d.get("https://www.saucedemo.com/");
    }

    @When("user navigate to login page")
    public void userNavigateToLoginPage() {
        System.out.println("user navigated to login page");
    }

    @And("user enter {string} and {string}")
    public void userEnterAnd(String username, String password) {
        System.out.println("username is : "+username+" password is : "+password);
        d.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys(username);
        d.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(password);
        d.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
        
    }

    @Then("message displayed login successfully")
    public void messageDisplayedLoginSuccessfully() {
        System.out.println("successfully logged in");
    }
}
