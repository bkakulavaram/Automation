package api.cucumber.Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features={"src/test/resources/Features/Tags.feature"},
        glue={"api.cucumber.Steps"},
        //tags="@smoke or @regression"
//tags="@smoke and @regression"
        //tags="(@smoke or @regression) and @important"
        //tags="@regression and not@smoke"
        //tags="(@smoke or @regression) or  not@important"
        tags="@mustRun"


)
public class TestRunner_RunWithSingleTag {


}
