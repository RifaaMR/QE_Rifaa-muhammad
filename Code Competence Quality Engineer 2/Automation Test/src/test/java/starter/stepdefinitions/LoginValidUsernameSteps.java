package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.LoginValidUsername;

public class LoginValidUsernameSteps {

    @Steps
    LoginValidUsername loginValidUsername;

    @Given("I set API endpoint for login")
    public void setApiEndpoint() {
        loginValidUsername.setApiEndpoint();
    }

    @When("I send request to login with valid username {string} and valid password {string}")
    public void sendLoginRequest(String username, String password) {
        loginValidUsername.sendLoginRequest(username, password);
    }
//
//    @Then("I receive status code 200")
//    public void receiveStatusCode200() {
//        loginValidUsername.receiveStatusCode200();
//    }

    @And("I receive valid data for login")
    public void receiveValidDataForLogin() {
        loginValidUsername.receiveValidDataForLogin();
    }

}
