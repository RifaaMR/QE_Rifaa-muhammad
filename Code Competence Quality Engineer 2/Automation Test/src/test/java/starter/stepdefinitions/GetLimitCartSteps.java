package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.GetLimitCart;

public class GetLimitCartSteps {

    @Steps
    GetLimitCart getLimitCart;

    @Given("I set API endpoint for get cart with limit 5 carts only")
    public void setApiGet5Carts(){
        getLimitCart.setApiGet5Carts();
    }

    @When("I send request to get cart with limit 5 carts only")
    public void sendGet5Carts(){
        getLimitCart.sendGet5Carts();
    }

    @And("I receive valid data with limit 5 carts only")
    public void receiveGet5Carts( ){
        getLimitCart.receiveGet5Carts();
    }
}
