package starter.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.login.Home;
import starter.login.Login;
import starter.login.Product;

public class ProductSteps {
    @Steps
    Home home;

    @Steps
    Product product;
    @Given("I open sepulsa.com homepage")
    public void i_open_sepulsa_com_homepage() {
        home.openUrl("https://www.sepulsa.com/");
        home.checkHomeButtonExist();
    }
    @When("I press at {string} product icon")
    public void i_press_at_product_icon(String product) {
        home.pressProduct(product);
    }
    @Then("I will be directed to the correct {string} product page")
    public void i_will_be_directed_to_the_correct_product_page(String item) {
        product.checkTitleWording(item);
    }

}
