package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.DeleteUser;

public class DeleteUserSteps {

    @Steps
    DeleteUser deleteUser;

    @Given("I set API endpoint for delete user")
    public void setApiEndpoint() {
        deleteUser.setApiEndpoint();
    }

    @When("I send request to delete user with valid ID")
    public void sendDeleteUserRequest() {
        deleteUser.sendDeleteUserRequest();
    }

    @Then("I receive status code 204")
    public void receiveStatusCode204() {
        deleteUser.receiveStatusCode204();
    }

}
