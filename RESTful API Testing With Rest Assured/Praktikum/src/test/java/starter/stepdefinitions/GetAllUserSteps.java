package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import starter.user.GetAllUser;

public class GetAllUserSteps {

    @Steps
    GetAllUser getAllUser;

    @Given("I set the API endpoint to get all users")
    public void setApiEndpoint() {
        getAllUser.setApiEndpoint();
    }

    @When("I send a request to get all users")
    public void sendGetAllUserRequest() {
        getAllUser.sendGetAllUserRequest();
    }

    @Then("I should receive a status code 200")
    public void receiveStatusCode200() {
        getAllUser.receiveStatusCode200();
    }

    @And("I should receive valid data for all users")
    public void receiveValidAllUserData() {
        getAllUser.receiveValidAllUserData();
    }

    @Given("I am not authorized to access the API endpoint for retrieving users")
    public void unauthorizedAccessToAPIEndpoint() {
        getAllUser.unauthorizedAccessToAPIEndpoint();
    }

    @Then("the response should contain an error message indicating unauthorized access")
    public void verifyUnauthorizedAccessErrorMessage() {
        getAllUser.verifyUnauthorizedAccessErrorMessage();
    }
}
