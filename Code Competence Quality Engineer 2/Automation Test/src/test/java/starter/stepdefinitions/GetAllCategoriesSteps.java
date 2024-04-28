package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.GetAllCategories;

public class GetAllCategoriesSteps {

    @Steps
    GetAllCategories getAllCategories;

    @Given("I set API endpoint for show all product categories")
    public void setApiGetAllCategories(){
        getAllCategories.setApiGetAllCategories();
    }

    @When("I send request to get all products categories")
    public void sendGetAllCategories(){
        getAllCategories.sendGetAllCategories();
    }
    @And("I receive all product categories")
    public void receiveValidProduct(){
        getAllCategories.receiveValidProduct();
    }

}
