package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.GetUsersCart;

public class GetUsersCartSteps {

    @Steps
    GetUsersCart getUsersCart;

    @Given("I set API endpoint for get user cart with id")
    public void setApiGetUsersCarts(){
        getUsersCart.setApiGetUsersCarts();
    }

    @When("I send request to get user cart with id")
    public void sendGetUsersCart(){
        getUsersCart.sendGetUsersCart();
    }

    @And("I receive valid user cart data")
    public void receiveGetUsersCart(){
        getUsersCart.receiveGetUsersCart();
    }
}
