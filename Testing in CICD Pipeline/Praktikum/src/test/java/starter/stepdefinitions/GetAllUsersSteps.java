package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.GetAllUsers;

public class GetAllUsersSteps {

    @Steps
    GetAllUsers getAllUsers;

    @Given("I set API endpoint for get all users")
    public void setApiEndpoint() {
        getAllUsers.setApiEndpoint();
    }

    @When("I send request to get all users")
    public void sendGetAllUsersRequest() {
        getAllUsers.sendGetAllUsersRequest();
    }

    @And("I receive valid data for all users")
    public void receiveValidUsersData() {
        getAllUsers.receiveValidUsersData();
    }
}
