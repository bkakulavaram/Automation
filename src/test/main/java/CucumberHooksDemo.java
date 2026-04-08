import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class CucumberHooksDemo {
    @BeforeStep
    public void setupSteps(){
        System.out.println("before step cucumber hook");
    }
    @Before (order =-3)
    public void setUp(){
        System.out.println("before hook cucumber");
    }
    @Before (order=1)
    public void setUp2(){
        System.out.println("before with order cucumber hook");
    }

    @After(order=1)
    public void tearDown(){
        System.out.println("after hook cucumber");
    }
    @AfterStep
    public void tearDownSteps(){
        System.out.println("after step cucumber hook");
    }
}
