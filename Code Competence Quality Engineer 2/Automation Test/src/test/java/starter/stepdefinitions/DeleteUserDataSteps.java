package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.DeleteUserData;

public class DeleteUserDataSteps {

    @Steps
    DeleteUserData deleteUserData;

    @Given("I set API endpoint for delete user data")
    public void setApiDeleteUser(){
        deleteUserData.setApiDeleteUser();
    }

    @When("I send request to delete user data with valid ID")
    public void sendDeleteUserDataRequest(){
        deleteUserData.sendDeleteUserDataRequest();
    }
}
