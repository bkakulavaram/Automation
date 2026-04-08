package api.cucumber.Steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class LoginSteps {
    @Given("user is at the login page of the application")
    public void userIsAtTheLoginPageOfTheApplication() {
        System.out.println("user is at  the login page");
    }

    @When("user logs in with the following username and password")
    public void userLogsInWithTheFollowingUsernameAndPassword(DataTable dataTable)  {
        List<List<String>> list_of_rows=dataTable.asLists(String.class);
        for(List<String> row : list_of_rows){
            for(String  str:row){
                System.out.println("Data : "+str);
            }
        }


        
    }

    @Then("user should be able to login with correct username and password")
    public void userShouldBeAbleToLoginWithCorrectUsernameAndPassword() {
        System.out.println("user should be able to login with correct username and password");
    }
}
