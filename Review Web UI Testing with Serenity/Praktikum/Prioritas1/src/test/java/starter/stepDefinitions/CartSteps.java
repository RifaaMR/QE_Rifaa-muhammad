package starter.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.object.Cart;
import starter.object.Home;
import starter.object.Login;

public class CartSteps {
    @Steps
    Login login;

    @Steps
    Home home;

    @Steps
    Cart cart;
    @Given("I am a logged in user")
    public void loginAsAUser(){
        login.openUrl("https://www.saucedemo.com/");
        login.inputUsername("standard_user");
        login.inputPassword("secret_sauce");
        login.clickButtonLogin();
    }
    @When("I add a product {string} to the cart from homepage")
    public void addProductToCart(String product){
        home.clickProduct(product);
    }
    @And("I open the cart page")
    public void openCartPage(){
        home.clickCartButton();
    }

    @Then("I will see the same {string} on the cart list")
    public void openCartPage(String productTitle){
        cart.checkTitle(productTitle);
    }

    @And("I press remove button for product {string}")
    public void pressRemove(String id){
        cart.pressRemove(id);
    }

    @Then("I will no longer see the {string} on the cart list")
    public void checkNotExist(String title){
        cart.checkNotExist();
    }
}
