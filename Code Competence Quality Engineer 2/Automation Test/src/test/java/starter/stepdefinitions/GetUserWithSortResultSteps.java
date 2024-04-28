package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;
import net.thucydides.core.annotations.Steps;
import starter.user.GetUserWithSortResult;

public class GetUserWithSortResultSteps {

    @Steps
    GetUserWithSortResult getUserWithSortResult;

    @Given("I set API endpoint for get user with sort result")
    public void setApiGetSortResult(){
        getUserWithSortResult.setApiGetSortResult();
    }

    @When("I send request to get user with sort result")
    public void sendGetSortResult(){
        getUserWithSortResult.sendGetSortResult();
    }

    @And("I receive valid data with sort result")
    public void receiveSortResult(){
        getUserWithSortResult.receiveSortResult();
    }
}
