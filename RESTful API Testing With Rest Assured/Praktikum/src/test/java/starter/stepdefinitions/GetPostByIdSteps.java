package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import starter.user.GetPostById;

public class GetPostByIdSteps {

    @Steps
    GetPostById getPostById;

    @Given("I set API endpoint to get post by ID")
    public void setApiEndpoint() {
        getPostById.setApiEndpoint();
    }

    @When("I send a request to get post by ID")
    public void sendGetPostByIdRequest() {
        getPostById.sendGetPostByIdRequest();
    }

    @Then("I receive status code 200")
    public void receiveStatusCode200() {
        getPostById.receiveStatusCode200();
    }

    @Then("I receive valid data for post by ID")
    public void receiveValidPostByIdData() {
        getPostById.receiveValidPostByIdData();
    }
}
