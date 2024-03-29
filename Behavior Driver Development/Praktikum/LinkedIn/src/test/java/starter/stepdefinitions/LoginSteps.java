package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
    @Given("I am on the login page")
    public void onTheLoginPage(){ }

    @When("I input valid email for login")
    public void inputValidEmail(){ }

    @And("I input valid password login")
    public void inputValidPassword(){ }

    @And("I click login button")
    public void clickLoginButton(){ }

    @Then("I successfully entered the dashboard page")
    public void successfullyEnteredTheDashboardPage() {}

    @When("I input invalid email or password for login")
    public void inputInvalidEmailAndPassword(){ }

    @Then("I failed to enter the dashboard page")
    public void failedEnterTheDashboardPage(){ }

    @When("I empty the input")
    public void emptyTheInput(){ }

    @Then("I still in the login page")
    public void StillInTheLoginPage(){ }
}
