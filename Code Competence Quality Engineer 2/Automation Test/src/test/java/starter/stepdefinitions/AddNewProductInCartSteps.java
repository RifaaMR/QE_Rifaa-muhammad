package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.AddNewProductInCart;

public class AddNewProductInCartSteps {

    @Steps
    AddNewProductInCart addNewProductInCart;

    @Given("I set API endpoint for add new product in cart")
    public void setApiAddProductInCart(){
        addNewProductInCart.setApiAddProductInCart();
    }

    @When("I send request to add new product with valid credential userId = {int}, date = {string}")
    public void sendRequestAddNewProductInCart(int userId, String date){
        addNewProductInCart.sendRequestAddNewProductInCart(userId,date);
    }

    @And("I receive valid data for created new product in cart")
    public void receiveNewProductinCart(){
        addNewProductInCart.receiveNewProductinCart();
    }
}
