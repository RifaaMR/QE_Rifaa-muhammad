package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.GetSingleProduct;

public class GetSingleProductSteps {
    @Steps
    GetSingleProduct getSingleProduct;

    @Given("I set API endpoint for get product data")
    public void setApiGetSingleProduct(){
        getSingleProduct.setApiGetSingleProduct();
    }

    @When("I send request to get product data")
    public void sendGetSingleProduct(){
        getSingleProduct.sendGetSingleProduct();
    }

    @And("I receive valid data from a product")
    public void receiveValidSingleProduct(){
        getSingleProduct.receiveValidSingleProduct();
    }
}
