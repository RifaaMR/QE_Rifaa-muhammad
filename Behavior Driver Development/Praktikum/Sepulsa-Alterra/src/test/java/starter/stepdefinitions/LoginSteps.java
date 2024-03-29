package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

    @Given("I am on the login page")
    public void iAmOnLoginPage() { }

    @When("I input valid phone number or email")
    public void iInputValidEmailOrPhoneNumberForLogin() { }

    @And("I input valid password")
    public void iInputValidPasswordForLogin() { }

    @And("I click login button")
    public void iClickLoginButton() { }

    @Then("I am redirected to the dashboard page")
    public void iRedirectedToDashboardPage() { }

    @When("I input invalid phone number or email")
    public void iInputInvalidEmailOrPhoneNumber() { }

    @And("I input invalid password")
    public void iInputInvalidPasswordForLogin() { }

    @Then("I get an error message that my password or email is incorrect")
    public void iGetErrorMessage() { }

    @When("I empty the input for login")
    public void iEmptyInputForLogin() { }

    @Then("I cannot be redirected to the dashboard page")
    public void iCannotRedirectedToDashboardPage() { }
}
