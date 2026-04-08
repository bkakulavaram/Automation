package stepdefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.After;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BBCSteps {
private WebDriver d=new ChromeDriver();
    @Given("i open the bbc webpage")
    public void iOpenTheBbcWebpage() {
        d.get("https://www.bbc.com");
    }

    @When("i click on the news link")
    public void iClickOnTheNewsLink() {
        d.findElement(By.xpath("//*[@id=\"global-navigation\"]/div[3]/ul[2]/li[2]/a")).click();
    }

    @Then("i should see {string} in the page title")
    public void iShouldSeeInThePageTitle(String expectedString) {
        String title=d.getTitle();
        System.out.println(title);
        Assert.assertTrue(title.contains(expectedString));
    }
    @After
    public void tearDown(){
        if(d!=null)
            d.quit();
    }




}
