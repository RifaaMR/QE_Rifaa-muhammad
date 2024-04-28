package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.GetSingleCart;

public class GetSingleCartSteps {

    @Steps
    GetSingleCart getSingleCart;

    @Given("I set API endpoint for get Cart data")
    public void setApiGetSingleCart(){
        getSingleCart.setApiGetSingleCart();
    }

    @When("I send request to get Cart data")
    public void sendGetSingleCart(){
        getSingleCart.sendGetSingleCart();
    }

    @And("I receive valid data from a Cart")
    public void receiveValidSingleCart(){
        getSingleCart.receiveValidSingleCart();
    }

}
