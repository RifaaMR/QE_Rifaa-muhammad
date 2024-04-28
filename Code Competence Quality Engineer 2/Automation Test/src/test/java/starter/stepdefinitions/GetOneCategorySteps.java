package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.GetOneCategory;

public class GetOneCategorySteps {

    @Steps
    GetOneCategory getOneCategory;

    @Given("I set API endpoint for show a product category")
    public void setApiGetOneCategory(){
        getOneCategory.setApiGetOneCategory();
    }

    @When("I send request to get a products category")
    public void sendGetOneCategory(){
        getOneCategory.sendGetOneCategory();
    }

    @And("I receive a product category")
    public void receiveOneCategory(){
        getOneCategory.receiveOneCategory();
    }
}
