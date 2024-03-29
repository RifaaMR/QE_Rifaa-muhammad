package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchProfileSteps {
    @Given("I am on the LinkedIn homepage")
    public void iAmOnHomepage() { }

    @When("I entered Rifaa in the search bar")
    public void iEnterNameInSearchBar() { }

    @And("I click on the search button")
    public void iClickSearchButton() { }

    @Then("I should see search results related to Rifaa")
    public void iSeeSearchResults() { }

}
