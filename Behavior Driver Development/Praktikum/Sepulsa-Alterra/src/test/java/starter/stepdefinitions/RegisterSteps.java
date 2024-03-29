package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterSteps {

    @Given("I am on the register page")
    public void iAmOnRegisterPage() { }

    @When("I input valid email")
    public void iInputValidEmailForRegister() { }

    @And("I input valid phone number")
    public void iInputValidPhoneNumber() { }

    @And("I input valid password")
    public void iInputValidPasswordForRegister() { }

    @And("I click register button")
    public void iClickRegisterButton() { }

    @Then("I redirected to the login page")
    public void iRedirectedToLoginPage() { }

    @When("I input invalid email")
    public void iInputInvalidEmailForRegister() { }

    @And("I input invalid phone number")
    public void iInputInvalidPhoneNumber() { }

    @And("I input invalid password")
    public void iInputInvalidPasswordForRegister() { }

    @Then("I got an invalid input message")
    public void iGotInvalidInputMessage() { }

    @When("I empty the input for register")
    public void iEmptyInputForRegister() { }

    @Then("I cannot redirected to the login page")
    public void iCannotRedirectedToLoginPage() { }
}
