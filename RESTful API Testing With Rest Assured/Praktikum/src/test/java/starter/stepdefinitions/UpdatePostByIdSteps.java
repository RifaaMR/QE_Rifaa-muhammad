package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import starter.user.UpdatePostById;

public class UpdatePostByIdSteps {

    @Steps
    UpdatePostById updatePostById;

    @Given("I set API endpoint to update post by ID")
    public void setApiEndpoint() {
        updatePostById.setApiEndpoint();
    }

    @When("I send a request to update post by ID")
    public void sendUpdatePostByIdRequest() {
        updatePostById.sendUpdatePostByIdRequest();
    }

    @Then("I receive status code 200")
    public void receiveStatusCode200() {
        updatePostById.receiveStatusCode200();
    }

    @Then("I receive valid data for updated post")
    public void receiveValidUpdatedPostData() {
        updatePostById.receiveValidUpdatedPostData();
    }
}
