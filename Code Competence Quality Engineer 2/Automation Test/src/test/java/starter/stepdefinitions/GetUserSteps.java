package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.GetUser;

public class GetUserSteps {

    @Steps
    GetUser getUser;

    @Given("I set API endpoint for get single user")
    public void setApiEndpoint() {
        getUser.setApiEndpoint();
    }

    @When("I send request to get single user")
    public void sendGetUserRequest() {
        getUser.sendGetUserRequest();
    }


    @And("I receive valid data for single user")
    public void receiveValidUserData() {
        getUser.receiveValidUserData();
    }

}
