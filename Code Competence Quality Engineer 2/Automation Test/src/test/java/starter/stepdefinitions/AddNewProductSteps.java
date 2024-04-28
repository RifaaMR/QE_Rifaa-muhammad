package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.AddNewProduct;

public class AddNewProductSteps {

    @Steps
    AddNewProduct addNewProduct;

    @Given("I set API endpoint for add new product")
    public void setApiAddNewProduct(){
        addNewProduct.setApiAddNewProduct();
    }


    @When("I send request to add new product with valid credential \\({string}, price = {double} , {string}, {string}, {string})")
    public void sendRequestAddNewProduct(String title, double price, String description, String image, String category){
        addNewProduct.sendRequestAddNewProduct(
                title, price, description, image, category);
    }


    @And("I receive valid data for created new product with id 21")
    public void receiveNewProduct(){
        addNewProduct.receiveNewProduct();
    }
}
