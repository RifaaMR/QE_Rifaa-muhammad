package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.DeleteProductInCart;

public class DeleteProductInCartSteps {

    @Steps
    DeleteProductInCart deleteProductInCart;

    @Given("I set API endpoint for delete product in cart")
    public void setApiDeleteProductInCart(){
        deleteProductInCart.setApiDeleteProductInCart();
    }

    @When("I send request to delete product in cart")
    public void sendDeleteProductInCart(){
        deleteProductInCart.sendDeleteProductInCart();
    }
}
