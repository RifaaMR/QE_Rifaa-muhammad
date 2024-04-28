package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.GetCartWithDate;

public class GetCartWithDateSteps {

    @Steps
    GetCartWithDate getCartWithDate;

    @Given("I set API endpoint for get all cart in date range")
    public void setApiGetCartWithDate() {
        getCartWithDate.setApiGetCartWithDate();
    }

    @When("I send request to get all cart in date range")
    public void sendGetCartWithDate(){
        getCartWithDate.sendGetCartWithDate();
    }

    @And("I receive valid data for all cart in date range")
    public void receiveCartWithDate(){
        getCartWithDate.receiveCartWithDate();
    }
}
