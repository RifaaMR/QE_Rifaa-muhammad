package starter.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.object.*;

public class CheckoutSteps {

    @Steps
    Cart cart;
    @Steps
    Checkout checkout;
    @Steps
    Product product;
    @Steps
    Home home;
    @And("I already have product {string} on Cart")
    public void addProductToCart(String title){
        home.clickProductTitle(title);
        product.pressAddToCart();
        home.clickCartButton();
    }
    @When("I press Checkout button")
    public void pressCheckoutButton(){
        cart.pressCheckout();
    }

    @And("I fill {string}, {string}, {string}")
    public void fillDetails(String firstName,String lastName,String zipCode){
        checkout.fillDetailForm(firstName,lastName,zipCode);
    }
    @And("I press continue button")
    public void pressContinueButton(){
        checkout.clickContinueButton();
    }
    @Then("I will see the {string} on checkout step two page")
    public void checkTitleOnStepTwo(String title){
        checkout.checkTitle(title);
    }
    @When("I press Finish button")
    public void pressFinishButton(){
        checkout.pressFinish();
    }
    @Then("I will see order success title")
    public void checkSuccessTitle(){
        checkout.checkSuccess();
    }
}
