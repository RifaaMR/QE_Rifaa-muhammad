package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EwalletSteps {

    @Given("The Sepulsa application is opened by the user")
    public void sepulsaApplicationIsOpened() { }

    @When("The user selects the ewallet topup service")
    public void userSelectsEwalletTopUpService() { }

    @And("A valid ewallet number is entered by the user")
    public void validEwalletNumberEntered() { }

    @And("A valid topup amount is selected by the user")
    public void validTopUpAmountSelected() { }

    @And("The user proceeds with the payment")
    public void userProceedsWithPayment() { }

    @Then("The ewallet topup is successful")
    public void ewalletTopUpIsSuccessful() { }

    @When("An invalid topup amount is selected by the user")
    public void invalidTopUpAmountSelected() { }

    @Then("The ewallet topup fails with an error message")
    public void ewalletTopUpFailsWithErrorMessage() { }
}
