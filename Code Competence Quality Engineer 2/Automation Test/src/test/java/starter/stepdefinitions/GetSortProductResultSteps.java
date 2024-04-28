package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.GetSortProductResult;

public class GetSortProductResultSteps {

    @Steps
    GetSortProductResult getSortProductResult;

    @Given("I set API endpoint for get product with sort result")
    public void setApiGetSortProduct(){
        getSortProductResult.setApiGetSortProduct();
    }

    @When("I send request to get product with sort result")
    public void sendGetSortProduct(){
        getSortProductResult.sendGetSortProduct();
    }

    @And("I receive valid product data with sort result")
    public void receiveSortProduct(){
        getSortProductResult.receiveSortProduct();
    }
}
