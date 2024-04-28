package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.GetUsersLimit5;

public class GetUsersLimit5Steps {

    @Steps
    GetUsersLimit5 getUsersLimit5;

    @Given("I set API endpoint for get user with limit 5 users only")
    public void setApiGet5Users(){
        getUsersLimit5.setApiGet5Users();
    }

    @When("I send request to get user with limit 5 users only")
    public void sendGet5Users(){
        getUsersLimit5.sendGet5Users();
    }


    @And("I receive valid data with limit 5 users only")
    public void receiveGet5Users() {
        getUsersLimit5.receiveGet5Users();
    }
}
