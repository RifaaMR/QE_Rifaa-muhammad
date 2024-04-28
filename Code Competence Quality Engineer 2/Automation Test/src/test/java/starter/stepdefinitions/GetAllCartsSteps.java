package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

import starter.user.GetAllCarts;

public class GetAllCartsSteps {

    @Steps
    GetAllCarts getallCarts;

    @Given("I set API endpoint for get all carts")
    public void setApiGetAllCarts(){
        getallCarts.setApiGetAllCarts();
    }

    @When("I send request to get all carts")
    public void sendGetAllCarts(){
        getallCarts.sendGetAllCarts();
    }

    @And("I receive valid data for all carts")
    public void receiveCartsData(){
        getallCarts.receiveCartsData();
    }

}
