package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.UpdateProductData;

public class UpdateProductDataSteps {

    @Steps
    UpdateProductData updateProductData;

    @Given("I set API endpoint for update product data")
    public void setApiUpdateProductData(){
        updateProductData.setApiUpdateProductData();
    }

    @When("I send request to update product data with valid credential")
    public void sendUpdateProductData(){
        updateProductData.sendUpdateProductData();
    }

    @And("I receive valid data for updated product data")
    public void receiveValidUpdatedProduct(){
        updateProductData.receiveValidUpdatedProduct();
    }
}
