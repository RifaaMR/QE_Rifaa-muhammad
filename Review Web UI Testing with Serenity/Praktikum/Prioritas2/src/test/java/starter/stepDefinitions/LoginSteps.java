package starter.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.login.Home;
import starter.login.Login;

public class LoginSteps {
    @Steps
    Login login;

    @Steps
    Home home;

    @Given("I open sepulsa.com login page")
    public void onTheLoginPage(){
        login.openUrl("https://www.sepulsa.com/signin");
        login.checkSignInButton();
    }

    @When("I enter credentials on {string} and {string} fields")
    public void i_enter_credentials_on_and_fields(String email, String password) {
        login.inputEmail(email);
        login.inputPassword(password);
    }

    @And("I press submit button")
    public void i_press_submit_button() {
       login.pressSignIn();
    }

    @Then("I will successfully redirect to homepage")
    public void i_will_successfully_redirect_to_homepage() {
        home.checkHomeButtonExist();
    }

    @Then("I will see error message")
    public void i_will_see_error_message() {
        login.checkErrorAppear();
    }


}
