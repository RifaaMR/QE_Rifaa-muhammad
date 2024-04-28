package starter.stepdefinitions;

import io.cucumber.java.en.When;
import starter.user.LoginInvalidPassword;

public class LoginInvalidPasswordSteps {
    LoginInvalidPassword loginInvalidPassword;

    @When("I send request to login with valid username {string} and invalid password {string}")
    public void sendLoginInvalidPassword(String username, String password){
        loginInvalidPassword.sendLoginInvalidPassword(username, password);
    }
}
