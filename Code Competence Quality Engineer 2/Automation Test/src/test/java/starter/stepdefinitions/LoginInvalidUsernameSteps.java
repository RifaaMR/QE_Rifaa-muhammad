package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.LoginInvalidUsername;

public class LoginInvalidUsernameSteps {

    @Steps
    LoginInvalidUsername loginInvalidUsername;

    @Given("I set API endpoint for login with invalid credentials")
    public void setApiInvalid(){
        loginInvalidUsername.setApiInvalid();
    }

    @When("I send request to login with invalid username {string} and valid password {string}")
    public void sendLoginInvalidUsername(String username, String password) {
        loginInvalidUsername.sendLoginInvalidUsername(username, password);
    }

    @Then("I receive status code {int}")
    public void receive404(int code){
        loginInvalidUsername.receive404(code);
    }
}
