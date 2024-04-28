package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.GetLimitProduct;

public class GetLimitProductSteps {
    @Steps
    GetLimitProduct getLimitProduct;

    @Given("I set API endpoint for get user with limit 5 products only")
    public void setApiGet5Products(){
        getLimitProduct.setApiGet5Products();
    }

    @When("I send request to get user with limit 5 products only")
    public void sendGet5Products(){
        getLimitProduct.sendGet5Products();
    }

    @And("I receive valid data with limit {int} products only")
    public void receiveGet5Products(int numberUser){
        getLimitProduct.receiveGet5Products(numberUser);
    }

}
