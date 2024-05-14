package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.CreateUser;

public class CreateUserSteps {

    @Steps
    CreateUser createUser;

    @Given("I set API endpoint for create user")
    public void setApiEndpoint() {
        createUser.setApiEndpoint();
    }

    @When("I send request to create user with valid inputs")
    public void sendCreateUserRequest() {
        createUser.sendCreateUserRequest();
    }

    @Then("I receive status code 201")
    public void receiveStatusCode201() {
        createUser.receiveStatusCode201();
    }

    @And("I receive valid data for created user")
    public void receiveValidCreatedUserData() {
        createUser.receiveValidCreatedUserData();
    }
}
