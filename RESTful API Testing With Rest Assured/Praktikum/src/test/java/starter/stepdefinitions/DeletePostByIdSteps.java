package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import starter.user.DeletePostById;

public class DeletePostByIdSteps {

    @Steps
    DeletePostById deletePostById;

    @Given("I set API endpoint to delete post by ID")
    public void setApiEndpoint() {
        deletePostById.setApiEndpoint();
    }

    @When("I send a request to delete post by ID")
    public void sendDeletePostByIdRequest() {
        deletePostById.sendDeletePostByIdRequest();
    }

    @Then("I receive status code 200")
    public void receiveStatusCode200() {
        deletePostById.receiveStatusCode200();
    }

    @Then("I receive valid data for deleted post")
    public void receiveValidDeletedPostData() {
        deletePostById.receiveValidDeletedPostData();
    }
}
