package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.GetSortCartResult;

public class GetSortCartResultSteps {

    @Steps
    GetSortCartResult getSortCartResult;

    @Given("I set API endpoint for get cart with sort result")
    public void setApiGetSortCart(){
        getSortCartResult.setApiGetSortCart();
    }

    @When("I send request to get cart with sort result")
    public void sendGetSortCart(){
        getSortCartResult.sendGetSortCart();
    }

    @And("I receive valid cart data with sort result")
    public void receiveSortProduct(){
        getSortCartResult.receiveSortProduct();
    }
}
