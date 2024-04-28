package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.UpdateUserData;

public class UpdateUserDataSteps {

    @Steps
    UpdateUserData updateUserData;

    @Given("I set API endpoint for update user data")
    public void setApiUpdateUser(){
        updateUserData.setApiUpdateUser();
    }

    @When("I send request to update user with valid credential")
    public void sendUpdateUser(){
        updateUserData.sendUpdateUser();
    }

    @And("I receive valid data for updated user data")
    public void receiveValidUpdatedUser(){
        updateUserData.receiveValidUpdatedUser();
    }
}
