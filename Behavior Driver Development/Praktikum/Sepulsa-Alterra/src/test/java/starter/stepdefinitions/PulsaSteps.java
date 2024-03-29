package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PulsaSteps {

    @Given("User opens the Sepulsa application")
    public void userOpensSepulsaApplication() { }

    @When("User selects the credit top-up service")
    public void userSelectsCreditTopUpService() { }

    @And("User enters a valid phone number")
    public void userEntersValidPhoneNumber() { }

    @And("User selects a valid credit amount")
    public void userSelectsValidCreditAmount() { }

    @And("User proceeds with the payment")
    public void userProceedsWithPayment() { }

    @Then("Credit top-up is successful")
    public void creditTopUpIsSuccessful() { }

    @When("User selects an invalid credit amount")
    public void userSelectsInvalidCreditAmount() { }

    @Then("Credit top-up fails with an error message")
    public void creditTopUpFailsWithErrorMessage() { }
}
