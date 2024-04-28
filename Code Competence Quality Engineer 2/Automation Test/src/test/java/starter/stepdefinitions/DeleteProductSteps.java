package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.DeleteProduct;

public class DeleteProductSteps {

    @Steps
    DeleteProduct deleteProduct;

    @Given("I set API endpoint for delete product")
    public void setApiDeleteProduct(){
        deleteProduct.setApiDeleteProduct();
    }

    @When("I send request to delete product")
    public void sendDeleteProductRequest(){
        deleteProduct.sendDeleteProductRequest();
    }
}
