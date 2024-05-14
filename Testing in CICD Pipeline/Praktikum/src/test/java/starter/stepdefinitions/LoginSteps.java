package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.Login;

public class LoginSteps {

    @Steps
    Login login;

    @Given("I set API endpoint for login")
    public void setApiEndpoint() {
        login.setApiEndpoint();
    }

    @When("I send request to login with valid email {string} and valid password {string}")
    public void sendLoginRequest(String email, String password) {
        login.sendLoginRequest(email, password);
    }

    @And("I receive valid data for login")
    public void receiveValidDataForLogin() {
        login.receiveValidDataForLogin();
    }

}
