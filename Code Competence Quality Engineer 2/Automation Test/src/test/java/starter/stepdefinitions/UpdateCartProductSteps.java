package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.UpdateCartProduct;

public class UpdateCartProductSteps {

    @Steps
    UpdateCartProduct updateCartProduct;

    @Given("I set API endpoint for update product in cart")
    public void setApiUpdateProductCart(){
        updateCartProduct.setApiUpdateProductCart();
    }

    @When("I send request to update product in cart with valid credential")
    public void sendUpdateProductCart(){
        updateCartProduct.sendUpdateProductCart();
    }

    @And("I receive valid data for updated product in cart")
    public void receiveValidUpdatedCart(){
        updateCartProduct.receiveValidUpdatedCart();
    }
}
