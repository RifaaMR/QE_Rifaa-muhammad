package starter.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.object.Home;
import starter.object.Login;

public class LoginSteps {
    @Steps
    Login login;

    @Steps
    Home home;

    @Given("I am on the login page")
    public void onTheLoginPage(){
        login.openUrl("https://www.saucedemo.com/");
        login.validateOnTheLoginPage();
    }

    @When("I enter username {string}")
    public void doEnterUsername(String username){
        login.inputUsername(username);
    }

    @And("I enter password {string}")
    public void doEnterPassword(String password){
        login.inputPassword(password);
    }

    @And("I click login button")
    public void doClickLoginButton(){
        login.clickButtonLogin();
    }

    @Then("I am on the home page")
    public void onTheHomePage(){
        home.validateOnTheHomePage();
    }

    @Then("I will see login error message")
    public void seeErrorMessage(){
        login.checkErrorMessage();
    }
}
