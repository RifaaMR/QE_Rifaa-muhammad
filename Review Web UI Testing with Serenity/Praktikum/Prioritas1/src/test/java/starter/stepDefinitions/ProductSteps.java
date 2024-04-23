package starter.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.object.Home;
import starter.object.Product;

public class ProductSteps {
    @Steps
    Home home;
    @Steps
    Product product;
    @When("I press product {string} title")
    public void pressProductTitle(String product){
        home.clickProductTitle(product);
    }
    @And("I will be directed to product page")
    public void arriveOnProductPage(){
        product.checkBackButton();
    }

    @And("I can see the same product {string} title")
    public void checkProductTitle(String title){
        product.checkProductTitle(title);
    }
    @And("I can see product description")
    public void checkProductDesc(){
        product.checkProductDesc();
    }
    @And("I can see product price")
    public void checkProductPrice(){
        product.checkProductPrice();
    }
    @And("I can see product image")
    public void checkProductImage(){
        product.checkProductImage();
    }
    @And("I press add to cart button")
    public void pressAddToCartButton(){
        product.pressAddToCart();
    }
}
