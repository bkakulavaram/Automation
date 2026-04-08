package runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features={"src/test/resources/Features/Feature.feature"},
        glue={"stepdefinitions"},
        plugin={"pretty","html:target/cucumber-report.html"},
        monochrome = true)
public class TestRunner {
}
